package io.github.inoutch.kotchan.sample

import kotlin.jvm.JvmStatic
import io.github.inoutch.kotchan.core.KotchanEngine

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        KotchanEngine(AppConfig()).run()
    }
}