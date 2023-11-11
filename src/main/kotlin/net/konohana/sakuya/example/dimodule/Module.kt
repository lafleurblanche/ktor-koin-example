package net.konohana.sakuya.example.dimodule

import net.konohana.sakuya.example.controller.HelloController
import net.konohana.sakuya.example.service.HelloService
import net.konohana.sakuya.example.service.WorldService
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

object Module {
    val koinExampleModules = module {
        // Service
        singleOf(::HelloService)
        singleOf(::WorldService)

        //Controller
        singleOf(::HelloController)
    }
}
