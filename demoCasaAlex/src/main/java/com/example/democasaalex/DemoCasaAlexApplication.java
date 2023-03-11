package com.example.democasaalex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude =   {DataSourceAutoConfiguration.class }
        ,scanBasePackages = {"com.example.democasaalex.Identity"}
)
public class DemoCasaAlexApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCasaAlexApplication.class, args);
    }

}
