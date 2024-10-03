package no.wmc.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<DB : ViewDataBinding>(@LayoutRes private val resId: Int) : Fragment() {

    private var _binding: DB? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate(inflater, resId, container, false)
        _binding!!.lifecycleOwner = viewLifecycleOwner
        return _binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }


}
