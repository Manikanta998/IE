package com.ie.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }


}

   /* @Override
    public void run(String... args) throws Exception {
        System.out.println("Command line args");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Application line args");
    }*/
