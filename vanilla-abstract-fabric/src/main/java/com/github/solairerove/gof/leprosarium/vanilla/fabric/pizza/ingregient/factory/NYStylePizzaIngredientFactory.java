package com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.factory;

import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.Cheese;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.Dough;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.MarinaraSauce;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.ReggianoCheese;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.Sauce;
import com.github.solairerove.gof.leprosarium.vanilla.fabric.pizza.ingregient.ThinCrustDough;

public class NYStylePizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
