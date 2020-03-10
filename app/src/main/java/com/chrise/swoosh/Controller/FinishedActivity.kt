package com.chrise.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chrise.swoosh.R
import com.chrise.swoosh.Utilities.EXTRA_LEAGUE
import com.chrise.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finished.*

class FinishedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finished)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "looking for $league $skill league near you..."
    }
}