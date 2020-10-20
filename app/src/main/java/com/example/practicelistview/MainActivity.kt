package com.example.practicelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val movie = arrayOf("Bad Boys for Life", "The Old Guard", "Raised by Wolves", "Elite", "The Walking Dead: World Beyond", "Artemis Fowl", "Black Box", "Riverdale", "Law & Order: Special Victims Unit", "Scary Movie 5", "Star Trek: Discovery", "Hubie Halloween", "District 9", "The Hurricane Heist", "Paddington 2", "Pride & Prejudice")
    private lateinit var lvMovie: ListView
    private lateinit var movieAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, movie)

        lvMovie = findViewById(R.id.lv_movie)
        lvMovie.adapter = movieAdapter

    }
}