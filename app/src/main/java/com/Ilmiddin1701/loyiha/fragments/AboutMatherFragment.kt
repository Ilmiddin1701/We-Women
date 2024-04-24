package com.Ilmiddin1701.loyiha.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.Ilmiddin1701.loyiha.R
import com.Ilmiddin1701.loyiha.databinding.FragmentAboutMatherBinding
import com.Ilmiddin1701.loyiha.utils.obj

class AboutMatherFragment : Fragment() {
    private val binding by lazy { FragmentAboutMatherBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        requireActivity().findViewById<ConstraintLayout>(R.id.actionBar).visibility = View.GONE
        val p = arguments?.getInt("keyPosition")
        binding.imgMather.setImageResource(obj.matherList[p!!].videoImage)
        binding.tvMather.text = obj.matherList[p!!].videoId
        return binding.root
    }
}