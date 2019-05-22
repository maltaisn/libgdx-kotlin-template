package com.example.desktop

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.example.core.GameApp


object DesktopLauncher {

    @JvmStatic
    fun main(args: Array<String>) {
        val config = Lwjgl3ApplicationConfiguration()
        config.setTitle("Template")
        config.setWindowSizeLimits(960, 540, -1, -1)

        Lwjgl3Application(GameApp(), config)
    }
}
