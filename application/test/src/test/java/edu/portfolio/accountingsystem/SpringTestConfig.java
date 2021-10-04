package edu.portfolio.accountingsystem;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import liquibase.pro.packaged.A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.stream.StreamSupport;


@Configuration
@EnableAutoConfiguration
@ComponentScan("edu.portfolio.accountingsystem")
public class SpringTestConfig {

    @Autowired
    private ApplicationContext appContext;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    protected DataSource getDataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(TestEnvironment.postgresqlContainer.getJdbcUrl());
        hikariConfig.setUsername(TestEnvironment.postgresqlContainer.getUsername());
        hikariConfig.setPassword(TestEnvironment.postgresqlContainer.getPassword());
        hikariConfig.setDriverClassName(TestEnvironment.postgresqlContainer.getDriverClassName());
        return new HikariDataSource(hikariConfig);
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringTestConfig.class);

    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent event) {
        final Environment env = event.getApplicationContext().getEnvironment();
        LOGGER.info("====== Environment and configuration ======");
        LOGGER.info("Active profiles: {}", Arrays.toString(env.getActiveProfiles()));
        final MutablePropertySources sources = ((AbstractEnvironment) env).getPropertySources();
        StreamSupport.stream(sources.spliterator(), false)
                .filter(ps -> ps instanceof EnumerablePropertySource)
                .map(ps -> ((EnumerablePropertySource) ps).getPropertyNames())
                .flatMap(Arrays::stream)
                .distinct()
                .filter(prop -> !(prop.contains("credentials") || prop.contains("password")))
                .forEach(prop -> LOGGER.info("{}: {}", prop, env.getProperty(prop)));
        LOGGER.info("===========================================");
    }
}