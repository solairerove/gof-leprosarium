package com.github.solairerove.gof.leprosarium.vanilla.singleton;

/**
 * After Java 1.4
 */
public class ClassicVolatileSingleton {

    private volatile static ClassicVolatileSingleton classicVolatileSingleton;

    private ClassicVolatileSingleton() {

    }

    public static ClassicVolatileSingleton getInstance() {
        if (classicVolatileSingleton == null) {
            synchronized (ClassicSynchronizedSingleton.class) {
                if (classicVolatileSingleton == null) {
                    classicVolatileSingleton = new ClassicVolatileSingleton();
                }
            }
        }
        return classicVolatileSingleton;
    }
}
