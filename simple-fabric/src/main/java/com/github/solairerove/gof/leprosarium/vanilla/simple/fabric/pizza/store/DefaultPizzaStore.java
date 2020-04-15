package com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.store;

import com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.Pizza;
import com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.factory.PizzaFactory;

public class DefaultPizzaStore implements PizzaStore {

    private final PizzaFactory pizzaFactory;

    public DefaultPizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    @Override
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = this.pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
