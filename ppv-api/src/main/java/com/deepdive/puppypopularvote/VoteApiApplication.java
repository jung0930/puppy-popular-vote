package com.deepdive.puppypopularvote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VoteApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoteApiApplication.class, args);
    }

}
