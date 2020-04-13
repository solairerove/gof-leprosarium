package com.github.solairerove.gof.leprosarium.vanilla.strategy;

import com.github.solairerove.gof.leprosarium.vanilla.strategy.duck.Duck;
import com.github.solairerove.gof.leprosarium.vanilla.strategy.duck.MallardDuck;

public class Application {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
    }
}
