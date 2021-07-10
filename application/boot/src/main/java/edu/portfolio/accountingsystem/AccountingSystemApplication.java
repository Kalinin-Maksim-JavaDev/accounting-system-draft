package edu.portfolio.accountingsystem;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ModelMapper getMapper() {
        return new ModelMapper();
    }

}
