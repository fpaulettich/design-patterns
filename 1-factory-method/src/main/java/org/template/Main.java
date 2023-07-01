package org.template;

import org.template.structure.ConcreteCreator;
import org.template.structure.Creator;
import org.template.structure.Product;
import org.template.structure.ProductType;

public class Main {

    public static void main(String[] args) {
        final Creator factory = new ConcreteCreator();
        final Product objectA = factory.createProduct(ProductType.TYPE_A, "object A");
        printLog(objectA);
        final Product objectB = factory.createProduct(ProductType.TYPE_B, "object B");
        printLog(objectB);
        final Product objectC = factory.createProduct(null, "object C");
        printLog(objectC);
    }

    static void printLog(Product product) {
        try {
            System.out.println(product.name() + " of type: " + product.getProductType());
        } catch (NullPointerException e) {
            System.out.println("Product is null!");
        }
    }

}