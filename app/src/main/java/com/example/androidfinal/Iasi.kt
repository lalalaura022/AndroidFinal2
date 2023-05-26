package com.example.androidfinal

import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfinal.databinding.ActivityIasiBinding
import com.example.androidfinal.databinding.ActivityMainBinding

class Iasi : AppCompatActivity() {

    lateinit var binding : ActivityIasiBinding
    lateinit var toggle: ActionBarDrawerToggle

    lateinit var imageView: ImageView
    lateinit var button: Button
    val REQUEST_IMAGE_CAPTURE = 100


    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imageView = findViewById(R.id.imageView2)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            try {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            } catch (e: ActivityNotFoundException) {
                Toast.makeText(this, "Error: " + e.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        }

        //val mediaCollection = MediaController(this)

        binding.apply {
            toggle = ActionBarDrawerToggle(this@Iasi, drawerLayout, R.string.open, R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.firstItem -> {
                        startActivity(Intent(this@Iasi, Bucharest::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.secondItem -> {
                        startActivity(Intent(this@Iasi, Iasi::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.thirdItem -> {
                        startActivity(Intent(this@Iasi, Targoviste::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.fourthItem -> {
                        startActivity(Intent(this@Iasi, Sibiu::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.fifthItem -> {
                        startActivity(Intent(this@Iasi, Sighisoara::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.sixthItem -> {
                        startActivity(Intent(this@Iasi, Brasov::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.seventhItem -> {
                        startActivity(Intent(this@Iasi, Constanta::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }
                    R.id.eighthItem -> {
                        startActivity(Intent(this@Iasi, Craiova::class.java))
                        finish()
                        overridePendingTransition(0, 0)
                    }                }
                true
            }

        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK)
        {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imageView.setImageBitmap(imageBitmap)
        }
        else
        {
            super.onActivityResult(requestCode, resultCode, data)

        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }

}