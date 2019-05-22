package com.example.core

import com.badlogic.gdx.ApplicationListener
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Container
import com.badlogic.gdx.scenes.scene2d.ui.Image
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
import com.badlogic.gdx.utils.Scaling
import com.badlogic.gdx.utils.viewport.ExtendViewport
import ktx.assets.load

class GameApp : ApplicationListener {

    private lateinit var stage: Stage
    private val assetManager = AssetManager()

    override fun create() {
        stage = Stage(ExtendViewport(940f, 540f))

        // Load image texture and create a drawable
        assetManager.load<Texture>(IMAGE)
        assetManager.finishLoading()
        val drawable = TextureRegionDrawable(assetManager.get<Texture>(IMAGE))

        // Do the stage layout
        val image = Image(drawable, Scaling.fit)
        stage.addActor(Container(image).apply {
            size(600f, 100f)
            setFillParent(true)
        })
    }

    override fun render() {
        stage.act()

        Gdx.gl.glClearColor(1f, 1f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        stage.draw()
    }

    override fun pause() {

    }

    override fun resume() {

    }

    override fun resize(width: Int, height: Int) {
        stage.viewport.update(width, height, true)
    }

    override fun dispose() {
        stage.dispose()
        assetManager.dispose()
    }

    companion object {
        private const val IMAGE = "libgdx.png"
    }

}
