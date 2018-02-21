package com.swooshkotlin.juansandoval.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v(TAG, "${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.v(TAG, "${javaClass.simpleName} onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.v(TAG, "${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.v(TAG, "${javaClass.simpleName} onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.v(TAG, "${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.v(TAG, "${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.v(TAG, "${javaClass.simpleName} onRestart")
        super.onRestart()
    }
}
