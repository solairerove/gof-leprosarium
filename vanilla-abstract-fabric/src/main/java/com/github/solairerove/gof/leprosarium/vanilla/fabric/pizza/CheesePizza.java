package com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza;

import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + this.name);
        this.dough = this.pizzaIngredientFactory.createDough();
        this.sauce = this.pizzaIngredientFactory.createSauce();
        this.cheese = this.pizzaIngredientFactory.createCheese();
    }
}
