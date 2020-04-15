package com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.factory;

import com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.Pizza;

public interface PizzaFactory {

    Pizza createPizza(String type);
}
