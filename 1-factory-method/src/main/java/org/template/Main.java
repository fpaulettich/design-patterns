package org.template;

import org.template.structure.creator.AudiCreator;
import org.template.structure.creator.Creator;
import org.template.structure.creator.ProductType;
import org.template.structure.product.Product;

/**
 * Example of Factory Method pattern design.
 * Credits to <a href="https://refactoring.guru/design-patterns/factory-method/java/example">Refactor Guru</a> for the example.
 */
public class Main {

    public static void main(String[] args) {
        final Creator creator = new AudiCreator();
        final Product car = creator.createProduct(ProductType.CAR, "blue");
        printLog(car);
        final Product motorbike = creator.createProduct(ProductType.MOTORBIKE, "red");
        printLog(motorbike);
        final Product unknown = creator.createProduct(null, "green");
        printLog(unknown);
    }

    static void printLog(Product product) {
        try {
            System.out.println(product.getProductType() + " of " + product.color() + " color");
        } catch (NullPointerException e) {
            System.out.println("Product does not exist!");
        }
    }
}