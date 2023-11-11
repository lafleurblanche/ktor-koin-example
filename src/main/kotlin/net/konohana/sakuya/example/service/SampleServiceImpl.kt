package net.konohana.sakuya.example.service

data class Name(val value: String = "Koin")

interface SampleService {
    fun greeting(): String
}

class SampleServiceImpl(private val name: Name) : SampleService {
    override fun greeting() = "Hello, ${name.value}"
}
