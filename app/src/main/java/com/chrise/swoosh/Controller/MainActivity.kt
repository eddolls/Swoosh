package com.chrise.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.chrise.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // onClick listener for the get Started Button
        // this button changes from the main to the league activity
        getStartedButton.setOnClickListener{
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)

        }

    }
}
