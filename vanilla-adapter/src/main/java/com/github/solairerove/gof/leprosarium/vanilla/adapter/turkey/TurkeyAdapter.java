package com.github.solairerove.gof.leprosarium.vanilla.adapter.turkey;

import com.github.solairerove.gof.leprosarium.vanilla.adapter.duck.Duck;

public class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        this.turkey.fly();
    }
}
