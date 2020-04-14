package com.github.solairerove.gof.leprosarium.vanilla.decorator;

import com.github.solairerove.gof.leprosarium.vanilla.decorator.beverage.Beverage;
import com.github.solairerove.gof.leprosarium.vanilla.decorator.beverage.DarkRoast;
import com.github.solairerove.gof.leprosarium.vanilla.decorator.beverage.Espresso;
import com.github.solairerove.gof.leprosarium.vanilla.decorator.beverage.decorator.Mocha;

public class Application {

    public static void main(String... args) {
        Beverage espresso = new Espresso();
        System.out.println(String.format("%s $%s", espresso.getDescription(), espresso.cost()));

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);

        System.out.println(String.format("%s $%s", darkRoast.getDescription(), darkRoast.cost()));
    }
}
