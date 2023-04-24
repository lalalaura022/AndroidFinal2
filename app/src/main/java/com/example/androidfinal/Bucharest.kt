package com.example.androidfinal

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfinal.databinding.ActivityBucharestBinding

class Bucharest : AppCompatActivity() {

    lateinit var binding : ActivityBucharestBinding
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBucharestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            toggle = ActionBarDrawerToggle(this@Bucharest, drawerLayout, R.string.open, R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.firstItem -> {
                        startActivity(Intent(this@Bucharest, Bucharest::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.secondItem -> {
                        startActivity(Intent(this@Bucharest, Iasi::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.thirdItem -> {
                        startActivity(Intent(this@Bucharest, Targoviste::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.fourthItem -> {
                        startActivity(Intent(this@Bucharest, Sibiu::class.java))
                        finish()
                        overridePendingTransition(0, 0)                    }
                    R.id.fifthItem -> {
                        startActivity(Intent(this@Bucharest, Sighisoara::class.java))
                        finish()
                        overridePendingTransition(0, 0)                    }
                    R.id.sixthItem -> {
                        startActivity(Intent(this@Bucharest, Brasov::class.java))
                        finish()
                        overridePendingTransition(0, 0)                    }
                    R.id.seventhItem -> {
                        startActivity(Intent(this@Bucharest, Constanta::class.java))
                        finish()
                        overridePendingTransition(0, 0)                    }
                    R.id.eighthItem -> {
                        startActivity(Intent(this@Bucharest, Craiova::class.java))
                        finish()
                        overridePendingTransition(0, 0)}                }
                true
            }

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}