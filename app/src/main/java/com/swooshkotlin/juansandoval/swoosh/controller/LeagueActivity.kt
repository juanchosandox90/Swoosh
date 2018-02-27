package com.swooshkotlin.juansandoval.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.swooshkotlin.juansandoval.swoosh.R
import com.swooshkotlin.juansandoval.swoosh.model.Player
import com.swooshkotlin.juansandoval.swoosh.utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensToogleBtn.isChecked = false
        coedToogleBtn.isChecked = false
        player.league = getString(R.string.mens)
    }

    fun onWomensClicked(view: View) {
        mensToogleBtn.isChecked = false
        coedToogleBtn.isChecked = false
        player.league = getString(R.string.womens)
    }

    fun onCoedClicked(view: View) {
        mensToogleBtn.isChecked = false
        womensToogleBtn.isChecked = false
        player.league = getString(R.string.co_ed)
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, getString(R.string.choose_league), Toast.LENGTH_LONG).show()
        }
    }


}
