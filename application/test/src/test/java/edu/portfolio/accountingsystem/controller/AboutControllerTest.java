package edu.portfolio.accountingsystem.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AboutControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @DisplayName("Test /about return")
    @Test
    public void getAbout() throws Exception {

        ResponseEntity response = restTemplate.getForEntity(
                new URL("http://localhost:" + port + "/about").toString(), Object.class);
        Assertions.assertEquals("{title=accounting-system}", response.getBody().toString());
    }
}