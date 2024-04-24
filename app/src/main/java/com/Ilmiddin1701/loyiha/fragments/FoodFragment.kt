package com.Ilmiddin1701.loyiha.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.Ilmiddin1701.loyiha.R
import com.Ilmiddin1701.loyiha.databinding.FragmentFoodBinding

class FoodFragment : Fragment() {
    private val binding by lazy { FragmentFoodBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }
}