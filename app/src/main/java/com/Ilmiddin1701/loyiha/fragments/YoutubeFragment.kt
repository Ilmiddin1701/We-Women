package com.Ilmiddin1701.loyiha.fragments

import android.os.Build
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.GravityCompat
import com.Ilmiddin1701.loyiha.R
import com.Ilmiddin1701.loyiha.databinding.FragmentYoutubeBinding
import com.Ilmiddin1701.loyiha.utils.NetworkHelper
import com.Ilmiddin1701.loyiha.utils.obj
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener

class YoutubeFragment : Fragment() {
    private val binding by lazy { FragmentYoutubeBinding.inflate(layoutInflater) }
    lateinit var networkHelper: NetworkHelper
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        networkHelper = NetworkHelper(requireContext())
        if (networkHelper.isNetworkConnected()){
            binding.youtubePlayerView.visibility = View.VISIBLE
            binding.tvVideoName.visibility = View.VISIBLE
            binding.imgNoInternet.visibility = View.GONE
            binding.tvNoInternet.visibility = View.GONE
            binding.btnRestart.visibility = View.GONE
        }else{
            binding.imgNoInternet.visibility = View.VISIBLE
            binding.tvNoInternet.visibility = View.VISIBLE
            binding.btnRestart.visibility = View.VISIBLE
            binding.youtubePlayerView.visibility = View.GONE
            binding.tvVideoName.visibility = View.GONE
        }
        binding.btnRestart.setOnClickListener {
            if (networkHelper.isNetworkConnected()){
                binding.youtubePlayerView.visibility = View.VISIBLE
                binding.tvVideoName.visibility = View.VISIBLE
                binding.imgNoInternet.visibility = View.GONE
                binding.tvNoInternet.visibility = View.GONE
                binding.btnRestart.visibility = View.GONE
            }else{
                binding.imgNoInternet.visibility = View.VISIBLE
                binding.tvNoInternet.visibility = View.VISIBLE
                binding.btnRestart.visibility = View.VISIBLE
                binding.youtubePlayerView.visibility = View.GONE
                binding.tvVideoName.visibility = View.GONE
            }
        }
        lifecycle.addObserver(binding.youtubePlayerView)
        val p = arguments?.getInt("keyPosition")
        when (obj.c) {
            1 -> binding.tvVideoName.text = obj.list1[p!!].videoName
            3 -> binding.tvVideoName.text = obj.bookList[p!!].videoName
        }
        binding.youtubePlayerView.addYouTubePlayerListener(object : YouTubePlayerListener {
            override fun onApiChange(youTubePlayer: YouTubePlayer) {}
            override fun onCurrentSecond(youTubePlayer: YouTubePlayer, second: Float) {}
            override fun onError(youTubePlayer: YouTubePlayer, error: PlayerConstants.PlayerError) {}
            override fun onPlaybackQualityChange(youTubePlayer: YouTubePlayer, playbackQuality: PlayerConstants.PlaybackQuality) {}
            override fun onPlaybackRateChange(youTubePlayer: YouTubePlayer, playbackRate: PlayerConstants.PlaybackRate) {}

            override fun onReady(youTubePlayer: YouTubePlayer) {
                when (obj.c) {
                    1 -> youTubePlayer.loadVideo(obj.list1[p!!].videoId, 0f)
                    3 -> youTubePlayer.loadVideo(obj.bookList[p!!].videoId, 0f)
                }
            }
            override fun onStateChange(youTubePlayer: YouTubePlayer, state: PlayerConstants.PlayerState) {}
            override fun onVideoDuration(youTubePlayer: YouTubePlayer, duration: Float) {}
            override fun onVideoId(youTubePlayer: YouTubePlayer, videoId: String) {}
            override fun onVideoLoadedFraction(youTubePlayer: YouTubePlayer, loadedFraction: Float) {}
        })
        requireActivity().findViewById<ConstraintLayout>(R.id.actionBar).visibility = View.GONE
        return binding.root
    }
}