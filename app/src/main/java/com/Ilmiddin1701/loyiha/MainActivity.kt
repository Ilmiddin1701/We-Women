package com.Ilmiddin1701.loyiha

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.GravityCompat
import androidx.navigation.Navigation
import com.Ilmiddin1701.loyiha.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            btnMenu.setOnClickListener {
                drawerLayout.openDrawer(GravityCompat.START)
            }
            val drawer = navigationView.getHeaderView(0)
            val cardHome = drawer.findViewById<CardView>(R.id.cardHome)
            val card1 = drawer.findViewById<CardView>(R.id.card1)
            val card2 = drawer.findViewById<CardView>(R.id.card2)
            val card3 = drawer.findViewById<CardView>(R.id.card3)
            val card4 = drawer.findViewById<CardView>(R.id.card4)
            val card5 = drawer.findViewById<CardView>(R.id.card5)
            val card6 = drawer.findViewById<CardView>(R.id.card6)

            cardHome.setOnClickListener {
                drawerLayout.closeDrawer(GravityCompat.START)
                Navigation.findNavController(this@MainActivity, R.id.my_navigation_host).navigate(R.id.homeFragment)
            }
            card1.setOnClickListener {
                drawerLayout.closeDrawer(GravityCompat.START)
                Navigation.findNavController(this@MainActivity, R.id.my_navigation_host).navigate(R.id.lessonFragment)
            }
            card2.setOnClickListener {
                drawerLayout.closeDrawer(GravityCompat.START)
                Navigation.findNavController(this@MainActivity, R.id.my_navigation_host).navigate(R.id.helpingFragment)
            }
            card3.setOnClickListener {
                drawerLayout.closeDrawer(GravityCompat.START)
                Navigation.findNavController(this@MainActivity, R.id.my_navigation_host).navigate(R.id.booksFragment)
            }
            card4.setOnClickListener {
                drawerLayout.closeDrawer(GravityCompat.START)
                Navigation.findNavController(this@MainActivity, R.id.my_navigation_host).navigate(R.id.informationFragment)
            }
            card5.setOnClickListener {
                drawerLayout.closeDrawer(GravityCompat.START)
                Navigation.findNavController(this@MainActivity, R.id.my_navigation_host).navigate(R.id.foodFragment)
            }
            card6.setOnClickListener {
                drawerLayout.closeDrawer(GravityCompat.START)
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://t.me/+sAQv2NaIFvVhOThi")
                startActivity(intent)
            }
        }

    }
}