package com.swooshkotlin.juansandoval.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensToogleBtn.isChecked = false
        coedToogleBtn.isChecked = false
        selectedLeague = "Mens"
    }

    fun onWomensClicked(view: View) {
        mensToogleBtn.isChecked = false
        coedToogleBtn.isChecked = false
        selectedLeague = "Womens"
    }

    fun onCoedClicked(view: View) {
        mensToogleBtn.isChecked = false
        womensToogleBtn.isChecked = false
        selectedLeague = "Co-ed"
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "You have to choose a League", Toast.LENGTH_LONG).show()
        }
    }


}
