package io.github.inoutch.kotchan.sample.scene

import io.github.inoutch.kotchan.core.KotchanCore
import io.github.inoutch.kotchan.core.tool.TexturePacker
import io.github.inoutch.kotchan.core.view.Scene
import io.github.inoutch.kotchan.core.view.batch.Batch
import io.github.inoutch.kotchan.core.view.drawable.Sprite
import io.github.inoutch.kotchan.core.view.shader.NoColorsShaderProgram
import io.github.inoutch.kotchan.utility.type.Vector3

class AppScene : Scene() {
    private val camera = KotchanCore.instance.createCamera2D()
    private val shaderProgram = NoColorsShaderProgram()
    private val batch = Batch()
    private val sprite: Sprite
    private var animation = 0.0f

    init {
        val textureDir = file.getResourcePath("samples")
                ?: throw Error("texture dir is not found")
        val spriteSheetPath = file.getResourcePath("samples/spritesheet.json")
                ?: throw Error("spritesheet is not found")
        val textureAtlas = TexturePacker.loadFile(textureDir, spriteSheetPath)
                ?: throw Error("texture atlas is not created")

        sprite = Sprite(textureAtlas)
        sprite.position = (KotchanCore.instance.screenSize / 2).toVector3()
        sprite.scale = Vector3(0.5f, 0.5f, 1.0f)
        batch.add(sprite, shaderProgram)
    }

    override fun destroyed() {}

    override fun draw(delta: Float) {
        gl.clearColor(1.0f, 1.0f, 1.0f, 1.0f)

        gl.enableBlend()
        gl.activeTexture(0)

        camera.update()
        sprite.setAtlas("go_" + ((animation * 8).toInt() % 8 + 1) + ".png")
        animation += delta

        batch.draw(delta, camera)
    }

    override fun pause() {}

    override fun reshape(x: Int, y: Int, width: Int, height: Int) {}

    override fun resume() {}
}