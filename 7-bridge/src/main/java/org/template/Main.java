package org.template;

import org.template.structure.device.Device;
import org.template.structure.device.Radio;
import org.template.structure.device.Tv;
import org.template.structure.remote.AdvancedRemote;
import org.template.structure.remote.BasicRemote;

/**
 * Example of Adapter pattern design.
 * Credits to <a href="https://refactoring.guru/design-patterns/bridge/java/example">Refactor Guru</a> for the example.
 */
public class Main {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

}
