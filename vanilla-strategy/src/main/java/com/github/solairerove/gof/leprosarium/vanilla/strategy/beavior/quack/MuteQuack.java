package com.github.solairerove.gof.leprosarium.vanilla.strategy.beavior.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
