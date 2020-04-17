package com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.store;

import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.NYStyleCheesePizza;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.NYStylePepperoniPizza;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
