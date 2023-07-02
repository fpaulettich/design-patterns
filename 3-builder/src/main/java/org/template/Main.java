package org.template;

import org.template.structure.builder.CarBuilder;
import org.template.structure.builder.MotorbikeBuilder;
import org.template.structure.director.Director;
import org.template.structure.product.Car;
import org.template.structure.product.Motorbike;

/**
 * Example of Builder pattern design.
 * Credits to <a href="https://refactoring.guru/design-patterns/builder/java/example">Refactor Guru</a> for the example.
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        MotorbikeBuilder motorbikeBuilder = new MotorbikeBuilder();
        director.buildVehicle(motorbikeBuilder);
        Motorbike motorbike = motorbikeBuilder.build();

        motorbike.printVehicleInfo();

        CarBuilder carBuilder = new CarBuilder();
        director.buildVehicle(carBuilder);
        Car car = carBuilder.build();
        car.printVehicleInfo();
    }
}