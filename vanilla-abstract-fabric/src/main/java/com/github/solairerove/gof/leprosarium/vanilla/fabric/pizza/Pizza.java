package com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza;

import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.Cheese;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.Dough;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.Sauce;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
