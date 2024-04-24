package com.Ilmiddin1701.loyiha.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.Ilmiddin1701.loyiha.R
import com.Ilmiddin1701.loyiha.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val navOptions = NavOptions.Builder()
        navOptions.setEnterAnim(R.anim.enter_anim)
        navOptions.setExitAnim(R.anim.exit_anim)
        navOptions.setPopEnterAnim(R.anim.pop_enter_anim)
        navOptions.setPopExitAnim(R.anim.pop_exit_anim)

        binding.apply {
            item1.setOnClickListener {
                findNavController().navigate(
                    R.id.lessonFragment,
                    bundleOf("keyPosition" to 0),
                    navOptions.build()
                )
            }
            item2.setOnClickListener {
                findNavController().navigate(
                    R.id.helpingFragment,
                    bundleOf("keyPosition" to 0),
                    navOptions.build()
                )
            }
            tv.setOnClickListener {
                findNavController().navigate(
                    R.id.helpingFragment,
                    bundleOf("keyPosition" to 0),
                    navOptions.build()
                )
            }
            item3.setOnClickListener {
                findNavController().navigate(
                    R.id.booksFragment,
                    bundleOf("keyPosition" to 0),
                    navOptions.build()
                )
            }
            item4.setOnClickListener {
                findNavController().navigate(
                    R.id.informationFragment,
                    bundleOf("keyPosition" to 0),
                    navOptions.build()
                )
            }
            item5.setOnClickListener {
                findNavController().navigate(
                    R.id.foodFragment,
                    bundleOf("keyPosition" to 0),
                    navOptions.build()
                )
            }
            item6.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://t.me/+sAQv2NaIFvVhOThi")
                startActivity(intent)
            }
        }
        return binding.root
    }
    override fun onResume() {
        super.onResume()
        requireActivity().findViewById<ConstraintLayout>(R.id.actionBar).visibility = View.VISIBLE
    }
}