package com.github.solairerove.gof.leprosarium.vanilla.adapter;

import com.github.solairerove.gof.leprosarium.vanilla.adapter.duck.Duck;
import com.github.solairerove.gof.leprosarium.vanilla.adapter.duck.MallardDuck;
import com.github.solairerove.gof.leprosarium.vanilla.adapter.turkey.Turkey;
import com.github.solairerove.gof.leprosarium.vanilla.adapter.turkey.TurkeyAdapter;
import com.github.solairerove.gof.leprosarium.vanilla.adapter.turkey.WildTurkey;

public class Application {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();

        duck.fly();

        turkeyAdapter.fly();
    }
}
