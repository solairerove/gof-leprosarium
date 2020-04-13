package com.github.solairerove.gof.leprosarium.vanilla.strategy;

import com.github.solairerove.gof.leprosarium.vanilla.strategy.another.AnotherService;
import com.github.solairerove.gof.leprosarium.vanilla.strategy.awesome.AwesomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final AnotherService anotherService;
    private final AwesomeService awesomeService;

    @Autowired
    public Application(AnotherService anotherService, AwesomeService awesomeService) {
        this.anotherService = anotherService;
        this.awesomeService = awesomeService;
    }

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.anotherService.makeAwesome();
        this.awesomeService.makeVeryAwesome();
    }
}
