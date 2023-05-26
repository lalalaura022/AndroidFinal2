package com.example.androidfinal

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidfinal.databinding.ActivityBucharestBinding
import com.example.androidfinal.databinding.ActivityTargovisteBinding
import com.example.searchviewkotlin.LanguageAdapter
import com.example.searchviewkotlin.LanguageData
import java.util.Locale

class Targoviste : AppCompatActivity() {

    lateinit var binding : ActivityTargovisteBinding
    lateinit var toggle: ActionBarDrawerToggle
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private var mList = ArrayList<LanguageData>()
    private lateinit var adapter: LanguageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTargovisteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.searchView)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = LanguageAdapter(mList)
        recyclerView.adapter = adapter

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }

        })
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

    private fun filterList(query: String?) {

        if (query != null) {
            val filteredList = ArrayList<LanguageData>()
            for (i in mList) {
                if (i.title.lowercase(Locale.ROOT).contains(query)) {
                    filteredList.add(i)
                }
            }

            if (filteredList.isEmpty()) {
                Toast.makeText(this, "No Data found", Toast.LENGTH_SHORT).show()
            } else {
                adapter.setFilteredList(filteredList)
            }
        }
    }

    private fun addDataToList() {
        mList.add(LanguageData("Alexo", R.drawable.alexo))
        mList.add(LanguageData("Casa Domneasca", R.drawable.casadomneasca))
        mList.add(LanguageData("Casa Veche", R.drawable.casadomneasca))
        mList.add(LanguageData("Fragilistic", R.drawable.fragilistic))
        mList.add(LanguageData("Juba", R.drawable.juba))
        mList.add(LanguageData("Moshu", R.drawable.moshu))
        mList.add(LanguageData("Toscany", R.drawable.toscany))
        mList.add(LanguageData("TowersPub", R.drawable.towerspub))
        mList.add(LanguageData("Urban21", R.drawable.urban21))
        mList.add(LanguageData("Xiao", R.drawable.xiao))

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}
