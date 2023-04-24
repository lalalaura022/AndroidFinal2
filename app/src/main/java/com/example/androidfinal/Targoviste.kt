package com.example.androidfinal

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfinal.databinding.ActivityBucharestBinding
import com.example.androidfinal.databinding.ActivityTargovisteBinding

class Targoviste : AppCompatActivity() {

    lateinit var binding : ActivityTargovisteBinding
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTargovisteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            toggle = ActionBarDrawerToggle(this@Targoviste, drawerLayout, R.string.open, R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.firstItem -> {
                        startActivity(Intent(this@Targoviste, Bucharest::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.secondItem -> {
                        startActivity(Intent(this@Targoviste, Iasi::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.thirdItem -> {
                        startActivity(Intent(this@Targoviste, Targoviste::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.fourthItem -> {
                        startActivity(Intent(this@Targoviste, Sibiu::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.fifthItem -> {
                        startActivity(Intent(this@Targoviste, Sighisoara::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.sixthItem -> {
                        startActivity(Intent(this@Targoviste, Brasov::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.seventhItem -> {
                        startActivity(Intent(this@Targoviste, Constanta::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.eighthItem -> {
                        startActivity(Intent(this@Targoviste, Craiova::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }                }
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