package com.example.androidfinal

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfinal.databinding.ActivityBrasovBinding
import com.example.androidfinal.databinding.ActivityMainBinding
import com.example.androidfinal.databinding.ActivitySibiuBinding

class Brasov : AppCompatActivity() {

    lateinit var binding : ActivityBrasovBinding
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrasovBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            toggle = ActionBarDrawerToggle(this@Brasov, drawerLayout, R.string.open, R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.firstItem -> {
                        startActivity(Intent(this@Brasov, Bucharest::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.secondItem -> {
                        startActivity(Intent(this@Brasov, Iasi::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.thirdItem -> {
                        startActivity(Intent(this@Brasov, Targoviste::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.fourthItem -> {
                        startActivity(Intent(this@Brasov, Sibiu::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.fifthItem -> {
                        startActivity(Intent(this@Brasov, Sighisoara::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.sixthItem -> {
                        startActivity(Intent(this@Brasov, Brasov::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.seventhItem -> {
                        startActivity(Intent(this@Brasov, Constanta::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.eighthItem -> {
                        startActivity(Intent(this@Brasov, Craiova::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }}
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
