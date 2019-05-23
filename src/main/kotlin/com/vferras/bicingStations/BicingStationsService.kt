package com.vferras.bicingStations

import org.springframework.stereotype.Service
import khttp.get

@Service
class BicingStationsService() {
    fun getStations() {
        val response = get("https://opendata-ajuntament.barcelona.cat/data/dataset/bd2462df-6e1e-4e37-8205-a4b8e7313b84/resource/e5adca8d-98bf-42c3-9b9c-364ef0a80494/download")
    }
}