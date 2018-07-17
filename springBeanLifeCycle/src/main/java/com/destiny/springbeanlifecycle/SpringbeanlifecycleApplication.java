package com.destiny.springbeanlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.destiny"})

public class SpringbeanlifecycleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbeanlifecycleApplication.class, args);
    }
}
