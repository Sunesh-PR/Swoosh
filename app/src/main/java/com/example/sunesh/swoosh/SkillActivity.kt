package com.example.sunesh.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    var league=""
    var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league=intent.getStringExtra(LEAGUE_EXTRAS)
    }
    fun skillnextclicked(view: View){
        if(beginnerskillbtn.isChecked||ballerskillbtn.isChecked) {
            val final= Intent(this,FinishActivity::class.java)
            final.putExtra(LEAGUE_EXTRAS,league)
            final.putExtra(SKILL_EXTRAS,skill)
            startActivity(final)
        }else{
            Toast.makeText(this,"Select a skill to continue",Toast.LENGTH_SHORT).show()
        }
    }
    fun beginnerskillclicked(view: View){
        ballerskillbtn.isChecked=false
        skill="beginners"

    }
    fun ballerskillclicked(view: View){
        beginnerskillbtn.isChecked=false
        skill="baller"

    }
}
