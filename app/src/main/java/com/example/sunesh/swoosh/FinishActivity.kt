package com.example.sunesh.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league= intent.getStringExtra(LEAGUE_EXTRAS)
        val skill= intent.getStringExtra(SKILL_EXTRAS)
        finalText.text="Looking for a $league $skill near you..."
    }
}
