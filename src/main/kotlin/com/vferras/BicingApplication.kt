package com.vferras

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.context.annotation.Bean
import com.fasterxml.jackson.databind.DeserializationFeature

@SpringBootApplication
class BicingApplication {}

fun main(args: Array<String>) {
    runApplication<BicingApplication>(*args)
}
