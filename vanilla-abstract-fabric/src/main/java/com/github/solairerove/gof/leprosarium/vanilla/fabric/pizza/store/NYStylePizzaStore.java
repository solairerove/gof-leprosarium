package com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.store;

import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.CheesePizza;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.Pizza;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.factory.NYStylePizzaIngredientFactory;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.factory.PizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYStylePizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("NY Style Cheese Pizza");
        }

        return pizza;
    }
}
