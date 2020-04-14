package com.github.solairerove.gof.leprosarium.spring.decorator;

import com.github.solairerove.gof.leprosarium.spring.decorator.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final Printer printer;

    @Autowired
    public Application(@Qualifier("lowerCasePrinter") Printer printer) {
        this.printer = printer;
    }

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        this.printer.print("TEXT");
    }
}
