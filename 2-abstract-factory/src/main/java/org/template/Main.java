package org.template;

import org.template.structure.factory.Factory;
import org.template.structure.factory.BmwFactory;
import org.template.structure.factory.AudiFactory;
import org.template.structure.product.Motorbike;
import org.template.structure.product.Car;

public class Main {

    private static Factory factory;
    private static Motorbike motorbike;
    private static Car car;

    public static void main(String[] args) {
        factory = new BmwFactory();
        motorbike = factory.createMotorbike("steve");
        car = factory.createCar("john");
        motorbike.printOwnerName();
        car.printOwnerName();

        factory = new AudiFactory();
        motorbike = factory.createMotorbike("leo");
        car = factory.createCar("joseph");
        motorbike.printOwnerName();
        car.printOwnerName();
    }

}