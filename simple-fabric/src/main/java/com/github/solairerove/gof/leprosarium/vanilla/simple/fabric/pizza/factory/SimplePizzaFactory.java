package com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.factory;

import com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.CheesePizza;
import com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.PepperoniPizza;
import com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.Pizza;

public class SimplePizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;

        switch (type) {
            case "cheese": {
                pizza = new CheesePizza();
                break;
            }
            case "pepperoni": {
                pizza = new PepperoniPizza();
                break;
            }
            default:
                return null;
        }
        return pizza;
    }
}
