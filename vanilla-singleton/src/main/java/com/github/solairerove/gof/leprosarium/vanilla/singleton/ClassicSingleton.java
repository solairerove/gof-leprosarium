package com.github.solairerove.gof.leprosarium.vanilla.singleton;

/**
 * Before Java 1.2 might be removed by gc)
 */
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
