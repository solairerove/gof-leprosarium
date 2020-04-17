package com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding topping: ");
        this.toppings.forEach(e -> System.out.println(" " + e));
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
