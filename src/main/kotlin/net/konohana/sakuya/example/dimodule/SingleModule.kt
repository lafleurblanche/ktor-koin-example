package net.konohana.sakuya.example.dimodule

import net.konohana.sakuya.example.service.Name
import net.konohana.sakuya.example.service.SampleService
import net.konohana.sakuya.example.service.SampleServiceImpl
import org.koin.dsl.module

object SingleModule {
    val koinSingletonExampleModules = module {
        single { Name() }
        single { SampleServiceImpl(get()) as SampleService }
    }
}
