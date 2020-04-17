package com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.store;

import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ChicagoStyleCheesePizza;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ChicagoStylePepperoniPizza;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
