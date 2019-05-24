package com.vferras.bicingStations

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.ExchangeStrategies
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono

@Service
class BicingStationsService @Autowired
constructor() {

    private val webClient: WebClient = WebClient
            .builder()
            .exchangeStrategies(ExchangeStrategies.withDefaults())
            .baseUrl("https://api.bsmsa.eu/ext/api/bsm/gbfs/v2/")
            .build()

    fun getStations(): Flux<BicingStation> {
        return webClient
                .get()
                .uri("en/station_information")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap { response -> response.bodyToMono(BicingDataDto::class.java) }
                .flatMapMany { mapBicingStations(it.data.stations.toMono()) }
    }

    private fun mapBicingStations(dto: Mono<List<BicingStationDto>>): Flux<BicingStation> {
        return dto.map {
            it.map {
                bicingStationDto -> BicingStation(
                    bicingStationDto.station_id!!,
                    bicingStationDto.name!!,
                    bicingStationDto.physical_configuration!!,
                    bicingStationDto.lat!!,
                    bicingStationDto.lon!!,
                    bicingStationDto.altitude!!,
                    bicingStationDto.address!!,
                    bicingStationDto.post_code!!,
                    bicingStationDto.capacity!!)}
        }.flatMapIterable { it }
    }
}