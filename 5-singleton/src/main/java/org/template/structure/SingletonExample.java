package org.template.structure;

/**
 * Class which contains the static instance and offers a way to either retrieve it or created if it is null.
 */
public class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
