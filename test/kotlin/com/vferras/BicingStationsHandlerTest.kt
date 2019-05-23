package com.vferras

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
    fun `test`() {
        webTestClient
            .get()
            .uri("/bicing/stations")
            .exchange()
            .expectStatus()
            .is4xxClientError()
    }
}