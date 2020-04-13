package com.github.solairerove.gof.leprosarium.vanilla.strategy.some.factory;

import com.github.solairerove.gof.leprosarium.vanilla.strategy.some.SomeService;
import com.github.solairerove.gof.leprosarium.vanilla.strategy.some.type.SomeType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class DefaultSomeFactory implements SomeFactory {

    private static Map<SomeType, SomeService> someService;

    public DefaultSomeFactory(List<SomeService> someServices) {
        someService = someServices.stream()
                .collect(Collectors.toMap(SomeService::getSomeType, Function.identity()));
    }

    @Override
    public SomeService getSomeService(SomeType someType) {
        return someService.get(someType);
    }
}
