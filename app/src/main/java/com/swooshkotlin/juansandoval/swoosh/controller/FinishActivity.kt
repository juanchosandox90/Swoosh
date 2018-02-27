package com.swooshkotlin.juansandoval.swoosh.controller

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.swooshkotlin.juansandoval.swoosh.R
import com.swooshkotlin.juansandoval.swoosh.utils.EXTRA_LEAGUE
import com.swooshkotlin.juansandoval.swoosh.utils.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "looking for a $league $skill beginner league near you…"
    }
}
