package com.example.androidfinal

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            toggle = ActionBarDrawerToggle(this@MainActivity, drawerLayout, R.string.open, R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.firstItem -> {
                        Toast.makeText(this@MainActivity, "First Item Clicked!!!!", Toast.LENGTH_SHORT).show()
                    }
                    R.id.secondItem -> {
                        Toast.makeText(this@MainActivity, "Second Item Clicked!!!!", Toast.LENGTH_SHORT).show()
                    }
                    R.id.thirdItem -> {
                        Toast.makeText(this@MainActivity, "third Item Clicked!!!!", Toast.LENGTH_SHORT).show()
                    }
                    R.id.fourthItem -> {
                        Toast.makeText(this@MainActivity, "fourth Item Clicked!!!!!", Toast.LENGTH_SHORT).show()
                    }
                    R.id.fifthItem -> {
                        Toast.makeText(this@MainActivity, "fifth Item Clicked!!!!", Toast.LENGTH_SHORT).show()
                    }
                    R.id.sixthItem -> {
                        Toast.makeText(this@MainActivity, "sixth Item Clicked!!!!", Toast.LENGTH_SHORT).show()
                    }
                    R.id.seventhItem -> {
                        Toast.makeText(this@MainActivity, "seventh Item Clicked!!!!", Toast.LENGTH_SHORT).show()
                    }
                    R.id.eighthItem -> {
                        Toast.makeText(this@MainActivity, "eighth Item Clicked!!!!", Toast.LENGTH_SHORT).show() }
                }
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