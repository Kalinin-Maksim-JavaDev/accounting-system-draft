package edu.portfolio.accountingsystem.IT;

import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;

public class TestEnvironment {

    @Container
    public static final PostgreSQLContainer postgresqlContainer = new PostgreSQLContainer()
            .withDatabaseName("test")
            .withUsername("sa");

    static {

        postgresqlContainer.start();
    }
}
