package org.template.structure;

/**
 * ConcreteComponent, defines an object to which additional responsibility could be added.
 */
public class ChristmasTreeImpl implements ChristmasTree {
    @Override
    public String decorate() {
        return "Christmas tree";
    }
}
