package com.github.solairerove.gof.leprosarium.vanilla.adapter.turkey;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("fly short distance");
    }
}
