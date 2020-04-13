package com.github.solairerove.gof.leprosarium.vanilla.strategy.duck;

import com.github.solairerove.gof.leprosarium.vanilla.strategy.beavior.fly.FlyWithWings;
import com.github.solairerove.gof.leprosarium.vanilla.strategy.beavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
