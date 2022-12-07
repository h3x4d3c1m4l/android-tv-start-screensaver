package com.h3xsoftware.startscreensaver

import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle

/**
 * Loads [MainFragment].
 */
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // start the Android TV screensaver
        // see: https://stackoverflow.com/questions/16060408/android-daydream-in-application
        val cn = ComponentName.createRelative("com.android.systemui", ".Somnambulator")
        val intent = Intent()
        intent.component = cn
        startActivity(intent)

        Thread.sleep(2000)
        finish()
    }
}
