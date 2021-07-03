package edu.portfolio.accountingsystem.controller;

import edu.portfolio.accountingsystem.view.AboutView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AboutControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @DisplayName("Test /about return")
    @Test
    public void getAbout() throws Exception {

        ResponseEntity<AboutView> response = restTemplate.getForEntity(
                new URL("http://localhost:" + port + "/about").toString(), AboutView.class);
        assertEquals("accounting-system", response.getBody().getTitle());
    }
}