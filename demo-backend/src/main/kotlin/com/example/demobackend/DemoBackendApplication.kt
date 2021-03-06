package com.example.demobackend

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration

@SpringBootApplication
@EnableAutoConfiguration(exclude = arrayOf(JacksonAutoConfiguration::class))
open class DemoBackendApplication {

    companion object {
        @JvmStatic fun main(vararg args: String) {
            SpringApplication.run(DemoBackendApplication::class.java, *args)
        }
    }
}