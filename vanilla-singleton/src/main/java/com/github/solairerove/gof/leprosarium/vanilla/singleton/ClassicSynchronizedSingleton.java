package com.github.solairerove.gof.leprosarium.vanilla.singleton;

public class ClassicSynchronizedSingleton {

    private static ClassicSynchronizedSingleton classicSynchronizedSingleton;

    private ClassicSynchronizedSingleton() {

    }

    public static synchronized ClassicSynchronizedSingleton getInstance() {
        if (classicSynchronizedSingleton == null) {
            classicSynchronizedSingleton = new ClassicSynchronizedSingleton();
        }
        return classicSynchronizedSingleton;
    }
}
