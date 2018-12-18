package io.github.inoutch.kotchan.sample

import io.github.inoutch.kotchan.core.KotchanEngine
import io.github.inoutch.kotchan.core.constant.ScreenType
import io.github.inoutch.kotchan.sample.scene.AppScene
import io.github.inoutch.kotchan.utility.type.Point
import kotchan.logger.LogLevel

class AppConfig : KotchanEngine.Config() {

    override val appName = "kotchan-sample"

    override val logLevel = LogLevel.DEBUG

    override val screenSize = Point(640, 1136) / 4

    override val screenType = ScreenType.EXTEND

    override val windowSize = Point(640, 1136)

    override fun initScene() = AppScene()
}