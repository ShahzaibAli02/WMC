package no.wmc.ui.intro

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import coil.load
import coil.transform.RoundedCornersTransformation
import no.wmc.R
import no.wmc.databinding.IntroPageContentBinding
import no.wmc.databinding.IntroScreenBinding
import no.wmc.ui.base.BaseFragment
import no.wmc.ui.landing.LandingFragmentDirections
import no.wmc.utils.ext.getDrawableResourceByName
import no.wmc.utils.ext.getStringResourceByName
import no.wmc.utils.ext.safeNavigate

class IntroFragment : BaseFragment<IntroScreenBinding>(
    R.layout.intro_screen
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        val introPagesCount = getString(R.string.intro_number_of_pages).toInt()
        val introPages = mutableListOf<IntroPage>()
        val listImages= listOf<Drawable>(
                resources.getDrawable(R.drawable.hands),
                resources.getDrawable(R.drawable.family_2),
                resources.getDrawable(R.drawable.family_03)
        )
        val titles= listOf("Create a Secure Account","Travel Worry Free","Share Your Info")
        val descriptions= listOf(
                "Store your critical medical data in the most secure environment using WHO codes, which are readily understood by first responders worldwide.",
                "Your account details, along with your physical card, will ensure that you will received the correct treatment without delay - should you need medical treatment while travelling.",
                "You can chose to share your profile with relatives, travel partner or others you trust, so that they can be able to provide you with first line of support."
        )
        (1..3).forEach { pageNumber ->
            introPages.add(
                IntroPage(
                    imageUrl = listImages.getOrNull(pageNumber-1),
                    title = titles.getOrNull(pageNumber-1)?:"",
                    message = descriptions.getOrNull(pageNumber-1)?:"",
                    videoUrl = requireContext().getStringResourceByName(
                        "intro_content_video_$pageNumber"
                    )
                )
            )
        }

        val adapter = CarouselSlidePagerAdapter(introPages)
//        binding.pager.offscreenPageLimit = 0
        binding.pager.adapter = adapter
        binding.dotsIndicator.setViewPager2(binding.pager)
        binding.pager.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                /*when {
                    position < adapter.pages.size - 1 -> {
                        binding.nextButton.isVisible = false
                        binding.skipTourButton.isVisible = true
                    }
                    else -> {
                        binding.skipTourButton.isVisible = false
                        binding.nextButton.isVisible = true
                    }
                }*/
                adapter.notifyDataSetChanged()
            }
        })
        binding.skipTourButton.setOnClickListener {
            /*findNavController().safeNavigate(
                IntroFragmentDirections.introToLanding()
            )*/


            // TODO direct intro to login
            findNavController().safeNavigate(
                IntroFragmentDirections.introToLogin()
            )
        }
        binding.nextButton.setOnClickListener {
            when(binding.pager.currentItem){
                    0 -> {
                        binding.pager.currentItem = binding.pager.currentItem+1
                    }

                    1 -> {
                        binding.pager.currentItem = binding.pager.currentItem+1
                    }

                    2 -> {
//                        binding.pager.currentItem = binding.pager.currentItem+1
                        findNavController().safeNavigate(
                                IntroFragmentDirections.introToLogin()
                        )
                    }

                    3 -> {
                        /*findNavController().safeNavigate(
                            IntroFragmentDirections.introToLanding()
                        )*/

                        // TODO direct intro to login
                        findNavController().safeNavigate(
                            IntroFragmentDirections.introToLogin()
                        )
                    }
                }
        }
    }

    private inner class CarouselSlidePagerAdapter(
        val pages: List<IntroPage>
    ) : RecyclerView.Adapter<CarouselSlidePagerAdapter.PageViewHolder>() {
        override fun getItemCount(): Int = pages.size

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewHolder {
            val binding = DataBindingUtil.inflate<IntroPageContentBinding>(
                LayoutInflater.from(parent.context),
                R.layout.intro_page_content,
                parent,
                false
            )
            return PageViewHolder(binding)
        }

        override fun onBindViewHolder(holder: PageViewHolder, position: Int) {
            holder.bind(pages[position])
        }

        inner class PageViewHolder(
            private val binding: IntroPageContentBinding
        ) : RecyclerView.ViewHolder(binding.root) {
            internal fun bind(introPage: IntroPage) {
               binding.image.load(introPage.imageUrl)



//                binding.wmc.setVideoURI(Uri.parse("android.resource://" + requireContext().packageName + "/raw/${introPage.videoUrl}"))  // set the absolute path of the video file local file
//                binding.wmc.setVideoURI(Uri.parse("android.resource://" + requireContext().packageName + "/raw/${introPage.videoUrl}"))  // set the absolute path of the video file local file

//                binding.wmcVideoSlide.setMediaController(null)
//
//                // Start playing the video
//                binding.wmcVideoSlide.start()

                binding.title.text = introPage.title
                binding.message.text = introPage.message
            }
        }
    }
}
