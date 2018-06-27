package com.example.sunesh.swoosh.Controller

import android.content.Intent
import android.media.AsyncPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.sunesh.swoosh.Model.Player
import com.example.sunesh.swoosh.R
import com.example.sunesh.swoosh.Utilities.PLAYER_EXTRAS
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    lateinit var player: Player
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(PLAYER_EXTRAS,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null){
            player = savedInstanceState.getParcelable<Player>(PLAYER_EXTRAS)
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player=intent.getParcelableExtra(PLAYER_EXTRAS)
    }
    fun skillnextclicked(view: View){
        if(beginnerskillbtn.isChecked||ballerskillbtn.isChecked) {
            val final= Intent(this, FinishActivity::class.java)
            final.putExtra(PLAYER_EXTRAS,player)
            startActivity(final)
        }else{
            Toast.makeText(this,"Select a skill to continue",Toast.LENGTH_SHORT).show()
        }
    }
    fun beginnerskillclicked(view: View){
        ballerskillbtn.isChecked=false
        player.skill="beginners"

    }
    fun ballerskillclicked(view: View){
        beginnerskillbtn.isChecked=false
        player.skill="baller"

    }
}
