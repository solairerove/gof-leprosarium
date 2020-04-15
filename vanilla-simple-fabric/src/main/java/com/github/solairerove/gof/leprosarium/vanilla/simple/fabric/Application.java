package com.github.solairerove.gof.leprosarium.vanilla.simple.fabric;

import com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.Pizza;
import com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.factory.PizzaFactory;
import com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.factory.SimplePizzaFactory;
import com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.store.DefaultPizzaStore;
import com.github.solairerove.gof.leprosarium.vanilla.simple.fabric.pizza.store.PizzaStore;

public class Application {
    public static void main(String... args) {
        PizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new DefaultPizzaStore(pizzaFactory);

        Pizza cheesePizza = pizzaStore.orderPizza("cheese");

        System.out.println(cheesePizza);
    }
}
