package com.github.solairerove.gof.leprosarium.spring.decorator.printer.decorator;

import com.github.solairerove.gof.leprosarium.spring.decorator.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("lowerCasePrinter")
public class LowerCasePrinter extends PrinterDecorator {

    @Autowired
    public LowerCasePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        var lowerCase = text.toLowerCase();

        this.printer.print(lowerCase);
    }
}
