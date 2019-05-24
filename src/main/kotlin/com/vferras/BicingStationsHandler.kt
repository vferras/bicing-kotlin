package com.vferras

import com.vferras.bicingStations.BicingStation
import com.vferras.bicingStations.BicingStationsService
import jdk.jfr.ContentType
import org.springframework.http.MediaType.APPLICATION_JSON_UTF8
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class BicingStationsHandler(
        private val bicingStationsService: BicingStationsService
) {
    fun getBicingStations(request: ServerRequest): Mono<ServerResponse> {
        val stations = bicingStationsService.getStations()

        return ServerResponse
                .ok()
                .contentType(APPLICATION_JSON_UTF8)
                .body(stations, BicingStation::class.java)
    }
}