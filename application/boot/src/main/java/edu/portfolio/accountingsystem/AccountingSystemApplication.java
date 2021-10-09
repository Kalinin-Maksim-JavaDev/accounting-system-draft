package edu.portfolio.accountingsystem;

import edu.portfolio.accountingsystem.map.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class AccountingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountingSystemApplication.class, args);
    }

    @Bean
    public Mapper getMapper() {
        return new Mapper() {

            ModelMapper mapper = new ModelMapper();

            @Override
            public <D> D map(Object source, Class<D> destinationType) {
                return mapper.map(source, destinationType);
            }
        };
    }
}
