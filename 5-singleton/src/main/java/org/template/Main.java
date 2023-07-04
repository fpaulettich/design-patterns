package org.template;

import org.template.structure.SingletonExample;

/**
 * Example of Singleton pattern design.
 */
public class Main {

    public static void main(String[] args) {
        SingletonExample exampleOne = SingletonExample.getInstance();
        SingletonExample exampleTwo = SingletonExample.getInstance();
        System.out.println("Both instances are the same instance: " + exampleOne.equals(exampleTwo));
    }
}