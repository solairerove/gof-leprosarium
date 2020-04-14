package com.github.solairerove.gof.leprosarium.spring.decorator.printer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("defaultPrinter")
public class DefaultPrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
