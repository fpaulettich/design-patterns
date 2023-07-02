package org.template.structure.product;

/**
 * Motorbike product with its corresponding operations.
 */
public record Motorbike(int wheels, int seats, int breaks)  {

    public void printVehicleInfo() {
        System.out.println(this);
    }

}
