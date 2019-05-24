package com.vferras.bicingStations

class BicingStation(
    _id: Int,
    _name: String,
    _physicalConfiguration: String,
    _lat: Int,
    _lon: Int,
    _altitude: Int,
    _address: String,
    _post_code: String,
    _capacity: Int
) {
    var id: Int = _id
        private set
    var name: String = _name
        private set
    var physicalConfiguration: String = _physicalConfiguration
        private set
    var lat: Int = _lat
        private set
    var lon: Int = _lon
        private set
    var altitude: Int = _altitude
        private set
    var address: String = _address
        private set
    var post_code: String = _post_code
        private set
    var capacity: Int = _capacity
        private set
}