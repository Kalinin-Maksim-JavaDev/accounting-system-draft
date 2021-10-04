package edu.portfolio.accountingsystem.IT.controller;

import edu.portfolio.accountingsystem.IT.SpringTestConfig;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static edu.portfolio.accountingsystem.IT.TestEnvironment.postgresqlContainer;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("db-test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringTestConfig.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
public class ControllerTest {

    @Autowired
    DataSource dataSource;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getAbout() throws Exception {

        ResponseEntity response = restTemplate.getForEntity(
                new URL("http://localhost:" + port + "/about").toString(), Object.class);
        Assertions.assertEquals("{title=accounting-system}", response.getBody().toString());
    }

    @Test
    public void testSimple() throws SQLException {

        ResultSet resultSet = performQuery(postgresqlContainer.getTestQueryString());
        int resultSetInt = resultSet.getInt(1);
        assertEquals(1, resultSetInt);
    }

    @Test
    public void test() throws SQLException {
        ResultSet resultSet = performQuery("select * from VERSION");
        assertEquals(true, resultSet.next());
        assertEquals("accounting-system-test", resultSet.getString("title"));
    }

    private ResultSet performQuery(String sql) throws SQLException {
        Statement statement = dataSource.getConnection().createStatement();
        statement.execute(sql);
        ResultSet resultSet = statement.getResultSet();

        resultSet.next();
        return resultSet;
    }


}
