package com.destiny.springbootfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.destiny"})

public class SpringbootfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootfileApplication.class, args);
    }
}
