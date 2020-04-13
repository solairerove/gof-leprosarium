package com.github.solairerove.gof.leprosarium.vanilla.strategy.beavior.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I prefer not to fly");
    }
}
