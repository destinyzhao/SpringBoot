package com.destiny.springproxyfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.destiny"})

public class SpringproxyfactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringproxyfactoryApplication.class, args);
    }
}
