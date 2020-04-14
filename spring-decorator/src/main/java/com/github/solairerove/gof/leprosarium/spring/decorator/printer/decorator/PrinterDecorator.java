package com.github.solairerove.gof.leprosarium.spring.decorator.printer.decorator;

import com.github.solairerove.gof.leprosarium.spring.decorator.printer.Printer;

public abstract class PrinterDecorator implements Printer {

    protected final Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }
}
