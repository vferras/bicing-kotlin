package com.vferras

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class BicingStationsHandler(
    
) {
    fun getBicingStations(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok().build()
    }
}