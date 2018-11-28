package edu.cmu.constellation.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {
        "edu.cmu.constellation.controller",
        "edu.cmu.constellation.main"})
@EnableMongoRepositories(basePackages = {
        "edu.cmu.constellation.dao"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
