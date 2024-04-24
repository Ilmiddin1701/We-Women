package com.Ilmiddin1701.loyiha.fragments

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.Ilmiddin1701.loyiha.databinding.FragmentHelpingBinding

class HelpingFragment : Fragment() {
    private val binding by lazy { FragmentHelpingBinding.inflate(layoutInflater) }
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}