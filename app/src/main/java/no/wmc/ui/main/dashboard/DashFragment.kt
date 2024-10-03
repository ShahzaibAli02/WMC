package no.wmc.ui.main.dashboard

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.DocumentSnapshot
import com.google.gson.Gson
import kotlinx.coroutines.launch
import no.wmc.BuildConfig
import no.wmc.R
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.local.manager.SharedPrefManager
import no.wmc.databinding.DialogConfirmOrderCardBinding

import no.wmc.databinding.FragmentDashBinding
import no.wmc.databinding.LytDeleteAccountBinding
import no.wmc.domain.model.Profile
import no.wmc.firebase.helper.FireStoreHelper
import no.wmc.firebase.interfaces.FireStoreGetUserInterface
import no.wmc.utils.Utility
import org.koin.android.ext.android.inject
import timber.log.Timber


class DashFragment : Fragment()
{
    private lateinit var binding: FragmentDashBinding
    private val sharedPrefManage: SharedPrefManager by inject()
    private val localDataManager: LocalDataManager by inject()
    val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View?
    {

        binding = FragmentDashBinding.inflate(inflater, container, false);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        binding.parent.bringChildToFront(binding.lytHeader)
        activity?.window?.statusBarColor = Color.parseColor("#F0F4FB")

        binding.drawerLayout.setViewRotation(GravityCompat.START, 10.0f);
        binding.drawerLayout.setViewScale(GravityCompat.START, 0.9f); //set height scale for main view (0f to 1f)
        binding.drawerLayout.setViewElevation(GravityCompat.START, 10.0f); //set main view elevation when  binding.drawerLayout open (dimension)
        binding.drawerLayout.setViewScrimColor(GravityCompat.START, Color.TRANSPARENT); //set  binding.drawerLayout overlay coloe (color)
        binding.drawerLayout.setRadius(GravityCompat.START, 20.0f); //set end container's corner radius (dimension)
        binding.imageMenu.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }
        val nestedNavHostFragment = childFragmentManager.findFragmentById(R.id.navHostNew) as NavHostFragment

        navController = nestedNavHostFragment.navController

        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            binding.bottomBar.rlActivity.isSelected = false
            binding.bottomBar.rlLocation.isSelected = false
            binding.bottomBar.rlHome.isSelected = false
            binding.bottomBar.rlProfile.isSelected = false
            binding.lytHeader.setBackgroundColor(Color.parseColor("#F0F4FB"))
            when (destination.id)
            {
                R.id.mainFragment ->
                {
                    binding.bottomBar.rlActivity.isSelected = true
                    binding.txtheaderTitle.setText("Dashboard")
                }

                R.id.mapsFragment ->
                {
                    binding.bottomBar.rlLocation.isSelected = true
                    binding.txtheaderTitle.setText("Nearby Hospitals")
                    binding.lytHeader.setBackgroundColor(Color.TRANSPARENT)
                }

                R.id.badgesFragment ->
                {
                    binding.txtheaderTitle.setText("Membership Badges")
                }
                R.id.myCardFragment ->
                {
                    binding.txtheaderTitle.setText("My Card")
                }
                R.id.emergencyFragment ->
                {
                    binding.txtheaderTitle.setText("Emergency")
                }

                R.id.homeNew2 ->
                {
                    binding.bottomBar.rlHome.isSelected = true
                    binding.txtheaderTitle.setText("") // binding.lytHeader.visibility=View.GONE
                }
                R.id.profile ->
                {
                    binding.bottomBar.rlProfile.isSelected = true
                    binding.txtheaderTitle.setText("Profile") // binding.lytHeader.visibility=View.GONE
                }
            }
        }
        binding.bottomBar.rlActivity.setOnClickListener {
            navController.navigate(R.id.mainFragment)
        }
        binding.bottomBar.rlLocation.setOnClickListener {
            navController.navigate(R.id.mapsFragment)
        }


        binding.bottomBar.rlHome.setOnClickListener {
            navController.navigate(R.id.homeNew2)
        }

        binding.bottomBar.rlProfile.setOnClickListener {
            navController.navigate(R.id.profile)
        }
        binding.bottomBar.ivCard.setOnClickListener {
            navController.navigate(R.id.myCardFragment)
        }

        binding.txtChanepassword.setOnClickListener(::onclickDrawerItem)
        binding.lytMemberShipBadge.setOnClickListener(::onclickDrawerItem)
        binding.lytAboutus.setOnClickListener(::onclickDrawerItem)
        binding.lytSecurityAndPrivacy.setOnClickListener(::onclickDrawerItem)
        binding.lytContactUs.setOnClickListener(::onclickDrawerItem)
        binding.lytDelete.setOnClickListener(::onclickDrawerItem)
        binding.txtTermsAndConditions.setOnClickListener(::onclickDrawerItem)
        binding.txtPrivacyPolicy.setOnClickListener(::onclickDrawerItem)
        binding.lytLogout.setOnClickListener(::onclickDrawerItem)
        binding.lytEmergency.setOnClickListener(::onclickDrawerItem)

        showUserData()


    }
    private fun onclickDrawerItem(v:View)
    {
        closeDrawer()
        if(v==binding.lytDelete)
        {
            confirmDelete()
        }
        if(v==binding.lytMemberShipBadge){
            navController.navigate(R.id.badgesFragment)
        }
        if(v==binding.lytAboutus)
        {
            Utility.openLink(requireContext(),BuildConfig.ABOUT_URL)
        }
        if(v==binding.txtChanepassword)
        {
            navController.navigate(R.id.resetPasswordFragment)
        }
        if(v==binding.lytSecurityAndPrivacy)
        {
            Utility.openLink(requireContext(),BuildConfig.SECURITY_PRIVACY)
        }
        if(v==binding.lytContactUs)
        {
            Utility.openLink(requireContext(),BuildConfig.CONTACT_US)
        }
        if(v==binding.txtPrivacyPolicy)
        {
            Utility.openLink(requireContext(),BuildConfig.SECURITY_PRIVACY)
        }
        if(v==binding.txtTermsAndConditions)
        {
            Utility.openLink(requireContext(),BuildConfig.TERMS_CONDITION)
        }
        if(v==binding.lytEmergency)
        {
            navController.navigate(R.id.emergencyFragment)
        }
        if(v==binding.lytLogout)
        {
            confirmLogOut()
        }

    }

    private fun confirmLogOut()
    {
        MaterialAlertDialogBuilder(requireContext()).setMessage("Are you sure to Logout?")
            .setPositiveButton("No",null)
            .setNegativeButton("Yes") { p0, p1 ->
                logOutUser()
            }
            .show()
    }

    private fun confirmDelete()
    {
        val dialogConfirmBinding = LytDeleteAccountBinding.inflate(LayoutInflater.from(requireContext()))


        dialogConfirmBinding.etEmail.setText(localDataManager.getCredentials()?.email)
        val dialog= AlertDialog.Builder(requireContext()).setView(dialogConfirmBinding.root).show()
        dialogConfirmBinding.btnDelete.setOnClickListener {

            if (dialogConfirmBinding.etEmail.text.toString().isBlank() && dialogConfirmBinding.etPassword.text.toString().isBlank())
                return@setOnClickListener

            Toast.makeText(requireContext(), "Checking password...", Toast.LENGTH_SHORT).show()
            FirebaseAuth.getInstance().signInWithEmailAndPassword(dialogConfirmBinding.etEmail.text.toString(),dialogConfirmBinding.etPassword.text.toString())
                .addOnCompleteListener {



                    if(it.isSuccessful)
                    {
                        dialog.dismiss()
                        it.result.user?.uid?.let {
                            FireStoreHelper().removeUser(it){
                                deleteUser()
                            }
                        }?:runCatching {
                            Toast.makeText(requireContext(), "Failed to delete user", Toast.LENGTH_SHORT).show()
                        }

                    }
                    else
                    {
                        dialogConfirmBinding.etPassword.error="Invalid password"
                        dialogConfirmBinding.etPassword.requestFocus()
                    }

                }

        }
        dialogConfirmBinding.btnCancel.setOnClickListener {
            dialog.dismiss()
        }


    }

    private fun deleteUser()
    {

        Log.d("TAG", "USER ID : "+FirebaseAuth.getInstance().uid)
        FirebaseAuth.getInstance().currentUser?.delete()?.addOnCompleteListener {
            if(it.isSuccessful)
            {
                Toast.makeText(requireContext(), "Account deleted !", Toast.LENGTH_SHORT).show()
                logOutUser()
            }
            else
            {
                Toast.makeText(requireContext(), it.exception?.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }



    private fun logOutUser(eraseData:Boolean=false)
    {
        lifecycleScope.launch {
            sharedPrefManage.putString("user_date",null)
            localDataManager.isLoggedIn(false)
            if(eraseData)
            {
                localDataManager.saveCredentials(null)
            }
           // localDataManager.saveCredentials(null)
        }
        FirebaseAuth.getInstance().signOut()
        findNavController().navigate(
            R.id.dash_to_login_fragment)
    }

    private fun showUserData()
    {

        lifecycleScope.launch {

            if(localDataManager.getCredentials()?.id==null)
            {
                logOutUser(eraseData = true)
                return@launch
            }
            val jsonUser = sharedPrefManage.getString("user_date")
            if (jsonUser != null)
            {
                showUserOnDrawer(jsonUser)
            }
            else
            {
                getUserFromFirebase()
            }

        }

    }
    suspend fun getUserFromFirebase()
    {

        localDataManager.getCredentials()?.id?.let {id->


            FireStoreHelper().getUser(id, object : FireStoreGetUserInterface
            {

                override fun onSuccess(chatsData: DocumentSnapshot)
                {

                    val jsonData = Utility.convertToJson(chatsData.data)
                    lifecycleScope.launch { sharedPrefManage.putString("user_date", jsonData) }
                    showUserOnDrawer(jsonData)
                }

                override fun onError(error: String)
                {
                    Timber.e("onError: " + error)
                }
            })
        }
    }

    private fun showUserOnDrawer(jsonData: String?)
    {
        val gsn = Gson()
        val requireModel: Profile = gsn.fromJson(jsonData.toString(), Profile::class.java)

        binding.txtName.text = "${requireModel.firstName} ${requireModel.lastName}"
        binding.txtMemberSince.text = "Member Since ${
            requireModel.memberSince?.split("-")?.getOrNull(0)
        }"
        if (requireModel.avatar?.isEmpty() == false)
        {
            Glide.with(this@DashFragment).load(requireModel.avatar)
                .placeholder(R.drawable.loading).error(R.drawable.avatar_placeholder)
                .into(binding.profileImage)
        }
    }

    private fun closeDrawer()
    {
        binding.drawerLayout.isDrawerOpen(GravityCompat.START).let {
            if (it) binding.drawerLayout.closeDrawer(GravityCompat.START)
        }
    }

}