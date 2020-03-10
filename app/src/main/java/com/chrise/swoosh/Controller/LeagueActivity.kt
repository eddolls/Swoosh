package com.chrise.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.chrise.swoosh.Utilities.EXTRA_LEAGUE
import com.chrise.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    // Next Button Function, Will only run if a league choice has been made if no
    // choice has been made a message will be displayed with the Toast function

    fun leagueNextClicked(view: View){
        if (selectedLeague != ""){

        val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
        startActivity(skillActivity)}else{
            //Toast Function
            Toast.makeText(this,"Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
    // Set onClick functions for league choice
    fun onMensClicked (view: View){
        womensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomensClicked (view: View){
        mensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false
        selectedLeague = "womens"
}

    fun onCoedClicked (view: View){
        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false
        selectedLeague = "Co-Ed"
    }

}