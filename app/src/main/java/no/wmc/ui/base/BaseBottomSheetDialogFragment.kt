package no.wmc.ui.base

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.LayoutRes
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import no.wmc.R
import no.wmc.utils.ext.getWindowHeight

open class BaseBottomSheetDialogFragment<DB : ViewDataBinding>(
    @LayoutRes private val layoutId: Int
) : BottomSheetDialogFragment() {

    protected lateinit var binding: DB
    private lateinit var sheetBehavior: BottomSheetBehavior<FrameLayout>

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        object : BottomSheetDialog(requireContext(), theme) {
            override fun onAttachedToWindow() {
                super.onAttachedToWindow()

                window?.let {
                    WindowCompat.setDecorFitsSystemWindows(it, false)
                }

                findViewById<View>(com.google.android.material.R.id.container)?.apply {
                    fitsSystemWindows = false
                    ViewCompat.setOnApplyWindowInsetsListener(this) { _, windowInsets ->
                        val systemInsets =
                            windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())
                        val keyboardInsets =
                            windowInsets.getInsets(WindowInsetsCompat.Type.ime()).bottom
                        val bottomInset = if (systemInsets.bottom > keyboardInsets) {
                            systemInsets.bottom
                        } else {
                            keyboardInsets
                        }

                        findViewById<FrameLayout>(
                            com.google.android.material.R.id.design_bottom_sheet
                        )
                            ?.let { bottomSheet ->
                                bottomSheet.background = ContextCompat.getDrawable(
                                    context,
                                    R.drawable.bg_bottom_sheet_dialog
                                )
                                val params = bottomSheet.layoutParams
                                val windowHeight = requireActivity().getWindowHeight()
                                val bottomSheetSafeSpace =
                                    resources.getDimensionPixelSize(R.dimen.bottom_sheet_safe_space)
                                params.height =
                                    windowHeight - systemInsets.top - bottomSheetSafeSpace
                                bottomSheet.layoutParams = params
                                bottomSheet.setPadding(0, 0, 0, bottomInset)
                                sheetBehavior = BottomSheetBehavior.from(bottomSheet).apply {
                                    isHideable = true
                                    setPeekHeight(windowHeight, true)
                                    setState(BottomSheetBehavior.STATE_COLLAPSED)
                                }
                            }

                        WindowInsetsCompat.CONSUMED
                    }
//                    findViewById<View>(R.id.coordinator)?.fitsSystemWindows = false
                }
            }
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, true)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }
}
