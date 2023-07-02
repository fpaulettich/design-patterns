package org.template.structure.product;

/**
 * Car product with its corresponding operations.
 */
public record Car(int wheels, int seats, int breaks)  {

    public void printVehicleInfo() {
        System.out.println(this);
    }

}
