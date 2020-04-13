package com.github.solairerove.gof.leprosarium.vanilla.strategy;

import com.github.solairerove.gof.leprosarium.vanilla.strategy.another.AnotherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final AnotherService anotherService;

    @Autowired
    public Application(AnotherService anotherService) {
        this.anotherService = anotherService;
    }

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.anotherService.makeAwesome();
    }
}
