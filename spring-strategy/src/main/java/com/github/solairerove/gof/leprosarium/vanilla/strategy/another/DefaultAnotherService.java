package com.github.solairerove.gof.leprosarium.vanilla.strategy.another;

import com.github.solairerove.gof.leprosarium.vanilla.strategy.some.SomeService;
import com.github.solairerove.gof.leprosarium.vanilla.strategy.some.type.SomeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class DefaultAnotherService implements AnotherService {

    private static Map<SomeType, SomeService> someService;

    @Autowired
    public DefaultAnotherService(List<SomeService> someServices) {
        someService = someServices.stream()
                .collect(Collectors.toMap(SomeService::getSomeType, Function.identity()));
    }

    @Override
    public void makeAwesome() {
        someService.get(SomeType.TYPE_A).makeSome();
    }
}
