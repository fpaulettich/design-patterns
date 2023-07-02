package org.template;

import org.template.structure.Car;
import org.template.structure.Motorbike;
import org.template.structure.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of Prototype pattern design.
 * Credits to <a href="https://refactoring.guru/design-patterns/prototype/java/example">Refactor Guru</a> for the example.
 */
public class Main {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> vehiclesCopy = new ArrayList<>();

        Car car = new Car();
        car.setEngine("v8");
        car.setWheels(4);
        car.setSeats(5);
        car.setBreaks(4);

        vehicles.add(car);

        Car anotherCar = (Car) car.clone();
        vehicles.add(anotherCar);

        Motorbike motorbike = new Motorbike();
        motorbike.setEngine("4 cylinder");
        motorbike.setWheels(2);
        motorbike.setSeats(2);
        motorbike.setBreaks(2);
        vehicles.add(motorbike);

        cloneAndCompare(vehicles, vehiclesCopy);
    }

    private static void cloneAndCompare(List<Vehicle> vehicles, List<Vehicle> vehiclesCopy) {
        for (Vehicle vehicle : vehicles) {
            vehiclesCopy.add(vehicle.clone());
        }

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) != vehiclesCopy.get(i)) {
                System.out.println(i + ": Vehicles are different objects (yay!)");
                if (vehicles.get(i).equals(vehiclesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}