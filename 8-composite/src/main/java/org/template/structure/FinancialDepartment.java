package org.template.structure;

/**
 * A leaf component of the tree.
 */
public class FinancialDepartment implements Department {

    private Integer id;
    private String name;

    public FinancialDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Name of this financial department: " + this.name);
    }

}
