package net.konohana.sakuya.example.plugins

import io.ktor.server.application.Application
import io.ktor.server.application.install
import net.konohana.sakuya.example.dimodule.Module
import net.konohana.sakuya.example.dimodule.SingleModule
import org.koin.ktor.plugin.Koin

fun Application.settingKoin() {
    install(Koin) {
        modules(
            Module.koinExampleModules,
            SingleModule.koinSingletonExampleModules
        )
    }
}
