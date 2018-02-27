package com.swooshkotlin.juansandoval.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.swooshkotlin.juansandoval.swoosh.R
import com.swooshkotlin.juansandoval.swoosh.model.Player
import com.swooshkotlin.juansandoval.swoosh.utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {


    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = getString(R.string.baller)
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = getString(R.string.beginer)
    }

    fun onSkillFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, getString(R.string.select_skill), Toast.LENGTH_LONG).show()
        }
    }
}
