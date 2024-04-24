package com.Ilmiddin1701.loyiha.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.Ilmiddin1701.loyiha.R
import com.Ilmiddin1701.loyiha.adapters.RvAdapter1
import com.Ilmiddin1701.loyiha.databinding.FragmentLessonBinding
import com.Ilmiddin1701.loyiha.models.Data1
import com.Ilmiddin1701.loyiha.utils.obj

class LessonFragment : Fragment() {
    private val binding by lazy { FragmentLessonBinding.inflate(layoutInflater) }
    lateinit var rvAdapter1: RvAdapter1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rvAdapter1 = RvAdapter1(object : RvAdapter1.RvAction {
            override fun itemClick(data1: Data1, position: Int) {
                obj.c = 1
                findNavController().navigate(
                    R.id.youtubeFragment,
                    bundleOf("keyPosition" to position)
                )
            }
        }, obj.list1)
        binding.rv.adapter = rvAdapter1
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        requireActivity().findViewById<ConstraintLayout>(R.id.actionBar).visibility = View.VISIBLE
    }
}