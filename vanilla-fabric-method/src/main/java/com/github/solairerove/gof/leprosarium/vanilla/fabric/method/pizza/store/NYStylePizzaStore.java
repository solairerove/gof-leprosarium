package com.github.solairerove.gof.leprosarium.vanilla.fabric.method.pizza.store;

import com.github.solairerove.gof.leprosarium.vanilla.fabric.method.pizza.NYStyleCheesePizza;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.method.pizza.NYStylePepperoniPizza;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.method.pizza.Pizza;

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
