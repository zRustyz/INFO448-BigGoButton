package edu.uw.ischool.rliu05.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private val TAG: String = "activitySpy"
    private lateinit var btnPushMe: Button
    private var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate event fired")
        if (savedInstanceState != null) {
            Log.i(TAG, "onCreate - savedInstanceState: $savedInstanceState")
        }
        setContentView(R.layout.activity_main)
        btnPushMe = this.findViewById(R.id.btnPushMe)
        btnPushMe.setOnClickListener {
            num++
            Log.i(TAG, "You have pushed me $num ${if (num < 2) "time" else "times"}")
            btnPushMe.setText("You have pushed me $num ${if (num < 2) "time" else "times"}")
        }

    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "By order of the Peaky Blinders! - The Peaky Blinders")
    }

}