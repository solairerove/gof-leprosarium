package com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        this.name = "Chicago Style Deep Dish Pepperoni Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";

        this.toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
