package com.vferras.bicing.config

import com.vferras.BicingStationsHandler
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean
import org.springframework.web.reactive.function.server.router
import org.springframework.http.MediaType

@Configuration
class Routing {
    @Bean
    fun booksRouter(handler: BicingStationsHandler) = router {
        ("/bicing/stations" and accept(MediaType.APPLICATION_JSON)).nest {
            GET("/", handler::getBicingStations)
        }
    }
}