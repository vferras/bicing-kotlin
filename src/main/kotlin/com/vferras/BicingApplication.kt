package com.vferras

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BicingApplication

fun main(args: Array<String>) {
    runApplication<BicingApplication>(*args)
}
