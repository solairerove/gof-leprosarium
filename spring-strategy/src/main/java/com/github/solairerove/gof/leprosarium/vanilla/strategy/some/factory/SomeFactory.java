package com.github.solairerove.gof.leprosarium.vanilla.strategy.some.factory;

import com.github.solairerove.gof.leprosarium.vanilla.strategy.some.SomeService;
import com.github.solairerove.gof.leprosarium.vanilla.strategy.some.type.SomeType;

public interface SomeFactory {

    SomeService getSomeService(SomeType someType);
}
