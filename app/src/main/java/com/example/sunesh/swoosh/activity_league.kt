package com.example.sunesh.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class activity_league : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }
    fun leaguenext(view: View) {
        val skill= Intent(this,SkillActivity::class.java)
        startActivity(skill)
    }

}