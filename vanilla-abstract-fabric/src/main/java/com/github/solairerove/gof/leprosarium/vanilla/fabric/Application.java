package com.github.solairerove.gof.leprosarium.vanilla.fabric;

import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.Pizza;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.store.NYStylePizzaStore;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.store.PizzaStore;

public class Application {
    public static void main(String... args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");

        System.out.println(pizza.getName());
    }
}
