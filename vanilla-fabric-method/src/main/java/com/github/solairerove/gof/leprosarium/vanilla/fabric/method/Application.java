package com.github.solairerove.gof.leprosarium.vanilla.fabric.method;

import com.github.solairerove.gof.leprosarium.vanilla.fabric.method.pizza.Pizza;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.method.pizza.store.ChicagoStylePizzaStore;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.method.pizza.store.NYStylePizzaStore;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.method.pizza.store.PizzaStore;

public class Application {
    public static void main(String... args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName() + "\n");
    }
}
