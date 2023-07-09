package org.template;

import org.template.structure.FinancialDepartment;
import org.template.structure.HeadDepartment;
import org.template.structure.SalesDepartment;

/**
 * Example of Composite pattern design.
 * Credits to <a href="https://www.baeldung.com/java-composite-pattern">Baeldung</a> for the example.
 */
public class Main {

    public static void main(String[] args) {
        HeadDepartment headDepartment = new HeadDepartment(3, "Green archives");
        headDepartment.addDepartment(new SalesDepartment(1, "Red archives"));
        headDepartment.addDepartment(new FinancialDepartment(2, "Blue archives"));
        System.out.println("Head department info");
        headDepartment.printDepartmentName();

        HeadDepartment anotherHeadDepartment = new HeadDepartment(4, "New Green Archives");
        anotherHeadDepartment.addDepartment(headDepartment);
        anotherHeadDepartment.addDepartment(new FinancialDepartment(5, "Yellow archives"));
        System.out.println("Another head department info");
        anotherHeadDepartment.printDepartmentName();
    }
}
