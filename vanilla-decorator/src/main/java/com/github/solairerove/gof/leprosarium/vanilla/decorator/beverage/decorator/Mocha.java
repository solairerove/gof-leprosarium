package com.github.solairerove.gof.leprosarium.vanilla.decorator.beverage.decorator;

import com.github.solairerove.gof.leprosarium.vanilla.decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription().concat(", Mocha");
    }

    @Override
    public double cost() {
        return .20 + this.beverage.cost();
    }
}
