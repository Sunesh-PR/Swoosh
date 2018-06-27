package com.example.sunesh.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.Touch
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class activity_league : AppCompatActivity() {

    var league=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }
    fun leaguenext(view: View) {
        if ((leaguecoedbtn.isChecked||leaguewomensbtn.isChecked||leaguemensbtn.isChecked)) {
            val skill = Intent(this, SkillActivity::class.java)
            skill.putExtra(LEAGUE_EXTRAS,league)
            startActivity(skill)
        }else{
            Toast.makeText(this,"Select a league to continue",Toast.LENGTH_SHORT).show()
        }
    }
    fun mensbtnclicked(view:View){
        leaguecoedbtn.isChecked=false
        leaguewomensbtn.isChecked=false
        league="mens"

    }
    fun womensbtnclicked(view:View){
        leaguecoedbtn.isChecked=false
        leaguemensbtn.isChecked=false
        league="womens"

    }
    fun coedbtnclicked(view:View){
        leaguemensbtn.isChecked=false
        leaguewomensbtn.isChecked=false
        league="coed"

    }

}