package com.destiny.springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.destiny"})

public class SpringaopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringaopApplication.class, args);
    }
}
