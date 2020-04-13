package com.github.solairerove.gof.leprosarium.vanilla.strategy.awesome;

import com.github.solairerove.gof.leprosarium.vanilla.strategy.some.SomeService;
import com.github.solairerove.gof.leprosarium.vanilla.strategy.some.factory.SomeFactory;
import com.github.solairerove.gof.leprosarium.vanilla.strategy.some.type.SomeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultAwesomeService implements AwesomeService {

    private final SomeFactory someFactory;

    @Autowired
    public DefaultAwesomeService(SomeFactory someFactory) {
        this.someFactory = someFactory;
    }

    @Override
    public void makeVeryAwesome() {
        SomeService someService = this.someFactory.getSomeService(SomeType.TYPE_B);

        someService.makeSome();
    }
}
