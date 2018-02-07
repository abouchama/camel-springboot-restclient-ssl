package com.aboucham;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// load regular Spring XML file from the class path that contains the Camel XML DSL
@ImportResource(locations = {"classpath:spring/camel-context.xml"})
//@PropertySource(value = {"classpath:application.properties"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

