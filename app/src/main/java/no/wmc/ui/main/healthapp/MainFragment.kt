package no.wmc.ui.main.healthapp

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.fitness.Fitness
import com.google.android.gms.fitness.FitnessOptions
import com.google.android.gms.fitness.data.DataSource
import com.google.android.gms.fitness.data.DataType
import com.google.android.gms.fitness.data.Field
import com.google.android.gms.fitness.data.HealthDataTypes
import com.google.android.gms.fitness.data.HealthFields
import com.google.android.gms.fitness.request.DataReadRequest
import com.google.android.gms.fitness.request.GoalsReadRequest
import no.wmc.R
import no.wmc.databinding.FragmentMainBinding
import timber.log.Timber
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.concurrent.TimeUnit
import kotlin.math.roundToInt

class MainFragment : Fragment()
{

    private lateinit var binding: FragmentMainBinding
    private val PERMISSION_REQUEST_CODE=11
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View?
    {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.ACTIVITY_RECOGNITION) != PackageManager.PERMISSION_GRANTED || ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.BODY_SENSORS) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(
                requireActivity(), arrayOf(Manifest.permission.ACTIVITY_RECOGNITION, Manifest.permission.BODY_SENSORS), PERMISSION_REQUEST_CODE
            )
        } else
        {
            readTodayStepCount()
        }
    }

    lateinit var fitnessOptions: FitnessOptions
    fun readTodayStepCount()
    {

        fitnessOptions = FitnessOptions.builder()
            .addDataType(DataType.TYPE_HYDRATION,FitnessOptions.ACCESS_READ)
            .addDataType(DataType.TYPE_HEART_POINTS, FitnessOptions.ACCESS_READ)
            .addDataType(HealthDataTypes.AGGREGATE_BLOOD_PRESSURE_SUMMARY, FitnessOptions.ACCESS_READ)
            .addDataType(DataType.AGGREGATE_HEART_RATE_SUMMARY, FitnessOptions.ACCESS_READ)
            .addDataType(DataType.TYPE_STEP_COUNT_DELTA, FitnessOptions.ACCESS_READ)
            .addDataType(DataType.AGGREGATE_STEP_COUNT_DELTA, FitnessOptions.ACCESS_READ).build()

        val account = GoogleSignIn.getAccountForExtension(requireContext(), fitnessOptions)
        if (!GoogleSignIn.hasPermissions(account, fitnessOptions))
        {
            GoogleSignIn.requestPermissions(
                this, 11, // e.g. 1
                account, fitnessOptions
            )
        } else
        {
            accessGoogleFit()
            //readGoals()
            readHearRate()
            readBloodPressure()
            readHydrationLevel()
        }
    }

    private fun readHydrationLevel()
    {



        val startTime = LocalDate.now().atStartOfDay(ZoneId.systemDefault())
        val endTime = LocalDateTime.now().atZone(ZoneId.systemDefault())
        // Build a data read request for hydration data
        val readRequest = DataReadRequest.Builder()
            .read(DataType.TYPE_HYDRATION)
            .setTimeRange(startTime.toEpochSecond(), endTime.toEpochSecond(), TimeUnit.SECONDS)
            .build()

        // Get the HistoryClient and read the hydration data
        Fitness.getHistoryClient(requireContext(), getGoogleAccount())
            .readData(readRequest)
            .addOnSuccessListener { response ->
                // Process the response to get hydration data
                for (dataSet in response.dataSets) {
                    for (dataPoint in dataSet.dataPoints) {
                        val hydrationValue = dataPoint.getValue(Field.FIELD_VOLUME).asFloat()
                        val timestampMillis = dataPoint.getStartTime(TimeUnit.MILLISECONDS)
                        binding.txtHydration.text = "$hydrationValue Liter"
                        binding.txtHydrationLastRead.text = calculateTimeAgo(System.currentTimeMillis(), timestampMillis)
                        val percentage:Int=if(hydrationValue>0 && goalHydration>0) ((hydrationValue/goalHydration).roundToInt()*100) else 0

                        binding.imageWater.setPercentage(percentage.coerceIn(0,100))
                    }
                }
            }
            .addOnFailureListener { e ->
                // Handle failure
                Log.e("HydrationData", "Failed to read hydration data", e)
            }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray,
    )
    {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==PERMISSION_REQUEST_CODE && grantResults[0]== PackageManager.PERMISSION_GRANTED )
        {
            readTodayStepCount()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
    {
        super.onActivityResult(requestCode, resultCode, data)
        when (resultCode)
        {
            Activity.RESULT_OK ->
            {
                readTodayStepCount()
            }

            else ->
            { // Permission not granted
            }
        }
    }
    private var totalSteps=0.0
    private var goalHydration=5
    private var stepsGoal=0.0
    private fun accessGoogleFit()
    {
        val startTime = LocalDate.now().atStartOfDay(ZoneId.systemDefault())
        val endTime = LocalDateTime.now().atZone(ZoneId.systemDefault())
        val datasource = DataSource.Builder().setAppPackageName("com.google.android.gms")
            .setDataType(DataType.TYPE_STEP_COUNT_DELTA).setType(DataSource.TYPE_DERIVED)
            .setStreamName("estimated_steps").build()

        val request = DataReadRequest.Builder().aggregate(datasource).bucketByTime(1, TimeUnit.DAYS)
            .setTimeRange(startTime.toEpochSecond(), endTime.toEpochSecond(), TimeUnit.SECONDS)
            .build()

        Fitness.getHistoryClient(requireContext(), getGoogleAccount()).readData(request)
            .addOnSuccessListener { response ->
                var lastTimeStamp: Long = 0

                for (bucket in response.buckets)
                {
                    for (dataSet in bucket.dataSets)
                    {
                        for (dataPoint in dataSet.dataPoints)
                        {

                            totalSteps += dataPoint.getValue(Field.FIELD_STEPS).asInt()
                            val dataPointTimestamp = dataPoint.getTimestamp(TimeUnit.MILLISECONDS)
                            if (dataPointTimestamp > lastTimeStamp)
                            {
                                lastTimeStamp = dataPointTimestamp
                            }
                        }
                    }
                }

                binding.txtSteps.text = "$totalSteps/$stepsGoal"
                binding.txtStepsLastRead.text = calculateTimeAgo(System.currentTimeMillis(), lastTimeStamp)
                readGoals()

            }
    }

    private fun readHearRate()
    {


        Fitness.getHistoryClient(requireContext(), getGoogleAccount())
            .readDailyTotal(DataType.TYPE_HEART_RATE_BPM).addOnSuccessListener { response ->

                val currentTimeMillis = System.currentTimeMillis()
                for (dataPoint in response.dataPoints)
                {
                    val heartRateValue = dataPoint.getValue(Field.FIELD_AVERAGE).asFloat()
                    val timestampMillis = dataPoint.getEndTime(TimeUnit.MILLISECONDS)
                    binding.txtHeartRate.text = "${heartRateValue.toInt()} BPM"
                    binding.textHeartRateReadTime.text = calculateTimeAgo(currentTimeMillis, timestampMillis)
                    binding.imageHeartBeat.setImageResource(R.drawable.pulse_graph_png)

                }



            }.addOnFailureListener {
                Log.d("MainFragment", "readHearRate addOnFailureListener: ")
            }
    }

    private fun readBloodPressure()
    {


        Fitness.getHistoryClient(requireContext(), getGoogleAccount())
            .readDailyTotal(HealthDataTypes.TYPE_BLOOD_PRESSURE).addOnSuccessListener { response ->
                Log.d("MainFragment", "readBloodPressure SUCCESS: ")
                val currentTimeMillis = System.currentTimeMillis()
                for (dataPoint in response.dataPoints)
                {
                    val bloodPressure = dataPoint.getValue(HealthFields.FIELD_BLOOD_PRESSURE_SYSTOLIC_AVERAGE).asFloat()
                    val timestampMillis = dataPoint.getEndTime(TimeUnit.MILLISECONDS)
                    binding.txtBloodPressure.text = "${bloodPressure.toInt()} mm Hg"
                    binding.txtBloodPressureLastRead.text = calculateTimeAgo(currentTimeMillis, timestampMillis)
                    binding.imageBloodPressure.setImageResource(R.drawable.graph_blood_pressure)
                }
            }.addOnFailureListener {
                Log.d("MainFragment", "readHearRate addOnFailureListener: ")
            }
    }

    private fun calculateTimeAgo(currentTimeMillis: Long, timestampMillis: Long): String
    {
        if(timestampMillis<=0)
        {
            return  "Last updated Today"
        }
        val timeDifferenceMillis = currentTimeMillis - timestampMillis
        val minutes = TimeUnit.MILLISECONDS.toMinutes(timeDifferenceMillis)

        return if (minutes < 60)
        { // Return minutes if less than an hour
            "Last updated $minutes mins ago"
        } else
        { // Return hours if more than an hour
            val hours = minutes / 60
            "Last updated  $hours hours ago"
        }
    }


    private val goalsReadRequest: GoalsReadRequest by lazy {
        GoalsReadRequest.Builder().addDataType(DataType.TYPE_STEP_COUNT_DELTA).build()
    }

    private fun getGoogleAccount(): GoogleSignInAccount =
        GoogleSignIn.getAccountForExtension(requireContext(), fitnessOptions)


    fun setGraphSteps(percentage:Int)
    {
        //binding.imageSteps.setProgress(percentage)
        Log.d("MainFragment", "setGraphSteps: ")
        binding.imageSteps.setProgressWithAnimation(percentage)
    }
    private fun readGoals()
    {
        Fitness.getGoalsClient(requireContext(), getGoogleAccount())
            .readCurrentGoals(goalsReadRequest).addOnSuccessListener { goals ->
                goals.firstOrNull()?.apply {
                    stepsGoal= metricObjective.value
                    binding.txtSteps.text = "${totalSteps.toInt()}/${stepsGoal.toInt()}"
                    val divVal=(totalSteps/stepsGoal)
                    val percentage:Int=if(stepsGoal>0 && totalSteps>0) (divVal*100).toInt() else 0
                    setGraphSteps(percentage.coerceIn(0,100))
                }
            }
    }


}