package com.example.sunesh.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.sunesh.swoosh.Model.Player
import com.example.sunesh.swoosh.R
import com.example.sunesh.swoosh.Utilities.PLAYER_EXTRAS
import kotlinx.android.synthetic.main.activity_league.*

class activity_league : AppCompatActivity() {

    var player= Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }
    fun leaguenext(view: View) {
        if ((leaguecoedbtn.isChecked||leaguewomensbtn.isChecked||leaguemensbtn.isChecked)) {
            val skill = Intent(this, SkillActivity::class.java)
            skill.putExtra(PLAYER_EXTRAS,player)
            startActivity(skill)
        }else{
            Toast.makeText(this,"Select a league to continue",Toast.LENGTH_SHORT).show()
        }
    }
    fun mensbtnclicked(view:View){
        leaguecoedbtn.isChecked=false
        leaguewomensbtn.isChecked=false
        player.league="mens"

    }
    fun womensbtnclicked(view:View){
        leaguecoedbtn.isChecked=false
        leaguemensbtn.isChecked=false
        player.league="womens"

    }
    fun coedbtnclicked(view:View){
        leaguemensbtn.isChecked=false
        leaguewomensbtn.isChecked=false
        player.league="coed"

    }

}