package com.github.solairerove.gof.leprosarium.vanilla.decorator.beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.19;
    }
}
