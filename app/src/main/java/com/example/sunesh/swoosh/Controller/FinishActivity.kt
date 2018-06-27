package com.example.sunesh.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.sunesh.swoosh.Model.Player
import com.example.sunesh.swoosh.R
import com.example.sunesh.swoosh.Utilities.PLAYER_EXTRAS
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player= intent.getParcelableExtra<Player>(PLAYER_EXTRAS)
        finalText.text="Looking for a ${player.league} ${player.skill} near you..."
    }
}
