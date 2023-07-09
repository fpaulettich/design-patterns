package org.template.structure;

/**
 * ConcreteDecoratorA, adds responsibility to the Component.
 */
public class BubbleLights extends TreeDecorator {

    private static final String WITH_BUBBLE_LIGHTS = ", with Bubble Lights";

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return WITH_BUBBLE_LIGHTS;
    }
}
