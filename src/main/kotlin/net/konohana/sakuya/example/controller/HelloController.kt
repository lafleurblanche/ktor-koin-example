package net.konohana.sakuya.example.controller

import net.konohana.sakuya.example.service.HelloService
import net.konohana.sakuya.example.service.WorldService

class HelloController(
    private val helloService: HelloService,
    private val worldService: WorldService
) {
   fun printsHello() {
       helloService.printHello()
       worldService.printWorld()
   }
}
