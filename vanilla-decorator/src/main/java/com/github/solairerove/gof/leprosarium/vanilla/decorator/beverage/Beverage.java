package com.github.solairerove.gof.leprosarium.vanilla.decorator.beverage;

public abstract class Beverage {
    protected String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
