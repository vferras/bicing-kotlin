package com.vferras.bicing

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.reactive.server.WebTestClient

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class BicingStationsHandlerTest {

    @Autowired
    private lateinit var webTestClient: WebTestClient

    @Test
    fun test() {

        webTestClient
                .get()
                .uri("/bicing/stations")
                .exchange()
                .expectStatus()
                .isOk
                .expectBodyList(BicingStationTest::class.java)

    }
}

class BicingStationTest(
        _id: Int?,
        _name: String?,
        _physicalConfiguration: String?,
        _lat: Int?,
        _lon: Int?,
        _altitude: Int?,
        _address: String?,
        _post_code: String?,
        _capacity: Int?
) {
    var id: Int? = _id
        private set
    var name: String? = _name
        private set
    var physicalConfiguration: String? = _physicalConfiguration
        private set
    var lat: Int? = _lat
        private set
    var lon: Int? = _lon
        private set
    var altitude: Int? = _altitude
        private set
    var address: String? = _address
        private set
    var post_code: String? = _post_code
        private set
    var capacity: Int? = _capacity
        private set
}