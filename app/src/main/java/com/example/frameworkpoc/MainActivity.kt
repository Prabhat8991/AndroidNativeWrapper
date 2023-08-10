package com.example.frameworkpoc

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.awesomeproject.MainActivity
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler

class MainActivity : Activity(), DefaultHardwareBackBtnHandler {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun invokeDefaultOnBackPressed() {
        super.onBackPressed()
    }
}