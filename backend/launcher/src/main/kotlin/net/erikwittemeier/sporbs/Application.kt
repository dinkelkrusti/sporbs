package net.erikwittemeier.sporbs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["net.erikwittemeier.sporbs"])
open class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}