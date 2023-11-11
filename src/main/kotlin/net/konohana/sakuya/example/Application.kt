package net.konohana.sakuya.example

import io.ktor.server.application.Application
import net.konohana.sakuya.example.plugins.configureHTTP
import net.konohana.sakuya.example.plugins.configureRouting
import net.konohana.sakuya.example.plugins.configureSerialization
import net.konohana.sakuya.example.plugins.settingKoin

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureHTTP()
    configureRouting()
    settingKoin()
}
