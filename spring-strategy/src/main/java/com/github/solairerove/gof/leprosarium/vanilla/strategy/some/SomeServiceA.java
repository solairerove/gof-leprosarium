package com.github.solairerove.gof.leprosarium.vanilla.strategy.some;

import com.github.solairerove.gof.leprosarium.vanilla.strategy.some.type.SomeType;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceA implements SomeService {

    @Override
    public void makeSome() {
        System.out.println("Make some A");
    }

    @Override
    public SomeType getSomeType() {
        return SomeType.TYPE_A;
    }
}
