package com.example.android

import android.os.Bundle
import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.example.core.GameApp

class AndroidLauncher : AndroidApplication() {

    override fun onCreate(state: Bundle?) {
        super.onCreate(state)

        val config = AndroidApplicationConfiguration()
        config.useAccelerometer = false
        config.useCompass = false

        initialize(GameApp(), config)
    }

}
