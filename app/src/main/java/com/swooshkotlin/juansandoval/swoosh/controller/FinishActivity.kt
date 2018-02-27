package com.swooshkotlin.juansandoval.swoosh.controller

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.swooshkotlin.juansandoval.swoosh.R
import com.swooshkotlin.juansandoval.swoosh.model.Player
import com.swooshkotlin.juansandoval.swoosh.utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "looking for a ${player.league} ${player.skill} beginner league near you…"
    }
}
