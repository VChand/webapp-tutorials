package com.vinson

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringWebappApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringWebappApplication>(*args)
}
