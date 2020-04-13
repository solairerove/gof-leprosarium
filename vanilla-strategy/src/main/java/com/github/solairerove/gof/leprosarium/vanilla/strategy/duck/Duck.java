package com.github.solairerove.gof.leprosarium.vanilla.strategy.duck;

import com.github.solairerove.gof.leprosarium.vanilla.strategy.beavior.fly.FlyBehavior;
import com.github.solairerove.gof.leprosarium.vanilla.strategy.beavior.quack.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }
}
