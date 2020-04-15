package com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.store;

import com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.Pizza;

public interface PizzaStore {

    Pizza orderPizza(String type);
}
