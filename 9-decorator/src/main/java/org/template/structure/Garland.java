package org.template.structure;

/**
 * ConcreteDecoratorB, adds responsibility to the Component.
 */
public class Garland extends TreeDecorator {

    private static final String WITH_GARLAND = ", with Garland";

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return WITH_GARLAND;
    }
}
