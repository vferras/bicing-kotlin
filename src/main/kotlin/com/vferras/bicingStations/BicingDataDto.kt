package com.vferras.bicingStations

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class BicingDataDto @JsonCreator constructor(
    var data: BicingStationsDto //@JsonProperty("data")
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class BicingStationsDto @JsonCreator constructor(
    var stations: List<BicingStationDto>
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class BicingStationDto(
        var station_id: Int? = null,
        var name: String? = null,
        var physical_configuration: String? = null,
        var lat: Int? = null,
        var lon: Int? = null,
        var altitude: Int? = null,
        var address: String? = null,
        var post_code: String? = null,
        var capacity: Int? = null
)