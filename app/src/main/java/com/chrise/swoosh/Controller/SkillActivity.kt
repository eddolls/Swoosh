package com.chrise.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.chrise.swoosh.Utilities.EXTRA_LEAGUE
import com.chrise.swoosh.R
import com.chrise.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = "" //Define var for receiving league choice info from constant.kt
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

        fun onBallerClicked(view: View) {
            beginnerSkillBtn.isChecked = false
            skill = "baller"
        }

        fun onBeginnerClicked(view: View) {
            ballerSkillBtn.isChecked = false
            skill = "beginner"
        }
    fun onSkillFinnishClicked(view: View) {
        if (skill != "") {
            val finishedActivity = Intent(this, FinishedActivity::class.java)
            finishedActivity.putExtra(EXTRA_LEAGUE, league)
            finishedActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishedActivity)
        } else
        //Toast
        {
            Toast.makeText(this, "please choose a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}