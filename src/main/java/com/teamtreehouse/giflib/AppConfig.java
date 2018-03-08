package com.teamtreehouse.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class AppConfig {
    public static void main(String[] args) {
//      spring to be auto configured, we'll need to add an annotation to this class
        SpringApplication.run(AppConfig.class, args);
    }
}
