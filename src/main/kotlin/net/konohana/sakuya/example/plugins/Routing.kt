package net.konohana.sakuya.example.plugins

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.application.install
import io.ktor.server.plugins.statuspages.StatusPages
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import net.konohana.sakuya.example.controller.HelloController
import net.konohana.sakuya.example.service.SampleService
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    install(StatusPages) {
        exception<Throwable> { call, cause ->
            call.respondText(text = "500: $cause" , status = HttpStatusCode.InternalServerError)
        }
    }
    routing {
        val helloController by inject<HelloController>()
        get("/ditest") {
            helloController.printsHello()
            call.respondText("Hello World!")
        }
        get("/") {
            call.respondText("Hello World!")
        }
        val sampleService by inject<SampleService>()
        get("/sample") {
            call.respond(sampleService.greeting())
        }
    }
}
