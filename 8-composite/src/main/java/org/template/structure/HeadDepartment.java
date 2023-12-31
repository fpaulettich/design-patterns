package org.template.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite object.
 */
public class HeadDepartment implements Department {
    private Integer id;
    private String name;

    private final List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        this.childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        this.childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        this.childDepartments.remove(department);
    }

}
