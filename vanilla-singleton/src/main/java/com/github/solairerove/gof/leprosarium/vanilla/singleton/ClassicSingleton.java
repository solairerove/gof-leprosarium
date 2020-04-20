package com.github.solairerove.gof.leprosarium.vanilla.singleton;

public class ClassicSingleton {

    private static ClassicSingleton classicSingleton;

    private ClassicSingleton() {

    }

    public static ClassicSingleton getInstance() {
        if (classicSingleton == null) {
            classicSingleton = new ClassicSingleton();
        }
        return classicSingleton;
    }
}
