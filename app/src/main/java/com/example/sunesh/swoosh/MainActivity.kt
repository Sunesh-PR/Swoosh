package com.example.sunesh.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        getStartedbtn.setOnClickListener {
            val leagueintent = Intent(this, activity_league::class.java)
            startActivity(leagueintent)
        }
    }
}