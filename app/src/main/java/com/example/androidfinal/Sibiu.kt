package com.example.androidfinal

import android.animation.ObjectAnimator
import android.animation.TimeInterpolator
import android.content.Intent
import android.os.Bundle
import android.util.Property
import android.view.MenuItem
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfinal.databinding.ActivityMainBinding
import com.example.androidfinal.databinding.ActivitySibiuBinding

class Sibiu : AppCompatActivity() {

    lateinit var binding : ActivitySibiuBinding
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySibiuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val animateButton = findViewById<Button>(R.id.animateButton)
        val blueView = findViewById<TextView>(R.id.blueView)
        animateButton.setOnClickListener{
            animate(blueView, View.TRANSLATION_Y,blueView.translationY, blueView.translationY + 100f, 500, DecelerateInterpolator())
            animate(blueView, View.ALPHA,1.0f, 0.0f, 2500, LinearInterpolator())
        }
        binding.apply {
            toggle = ActionBarDrawerToggle(this@Sibiu, drawerLayout, R.string.open, R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.firstItem -> {
                        startActivity(Intent(this@Sibiu, Bucharest::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.secondItem -> {
                        startActivity(Intent(this@Sibiu, Iasi::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.thirdItem -> {
                        startActivity(Intent(this@Sibiu, Targoviste::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.fourthItem -> {
                        startActivity(Intent(this@Sibiu, Sibiu::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.fifthItem -> {
                        startActivity(Intent(this@Sibiu, Sighisoara::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.sixthItem -> {
                        startActivity(Intent(this@Sibiu, Brasov::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.seventhItem -> {
                        startActivity(Intent(this@Sibiu, Constanta::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.eighthItem -> {
                        startActivity(Intent(this@Sibiu, Craiova::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }}
                    true
                }

            }

        }
    fun animate(target: View, property: Property<View, Float>, from: Float, to: Float, duration: Long, interpolator: TimeInterpolator)
    {
        val tY = ObjectAnimator.ofFloat(target, property, from, to)

        tY.duration = duration
        tY.interpolator = interpolator
        tY.start()
    }
        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            if (toggle.onOptionsItemSelected(item)){
                true
            }
            return super.onOptionsItemSelected(item)
        }
    }