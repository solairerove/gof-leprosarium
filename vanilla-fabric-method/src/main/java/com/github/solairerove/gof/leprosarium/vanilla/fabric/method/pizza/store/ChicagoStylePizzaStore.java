package com.github.solairerove.gof.leprosarium.vanilla.fabric.method.pizza.store;

import com.github.solairerove.gof.leprosarium.vanilla.fabric.method.pizza.ChicagoStyleCheesePizza;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.method.pizza.ChicagoStylePepperoniPizza;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.method.pizza.Pizza;

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
