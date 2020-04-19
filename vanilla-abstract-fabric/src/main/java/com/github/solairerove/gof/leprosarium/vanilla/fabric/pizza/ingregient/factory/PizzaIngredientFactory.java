package com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.factory;

import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.Cheese;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.Dough;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.Sauce;

public interface PizzaIngredientFactory {

    Cheese createCheese();
    Dough createDough();
    Sauce createSauce();
}
