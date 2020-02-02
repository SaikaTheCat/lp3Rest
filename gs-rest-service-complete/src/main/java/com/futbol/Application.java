package com.futbol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot startup class file. it will start the application
 * and run it on http port 8080
 * @author
 */

@SpringBootApplication
@ComponentScan(basePackages ="com.futbol")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
