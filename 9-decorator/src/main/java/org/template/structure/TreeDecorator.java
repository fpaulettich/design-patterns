package org.template.structure;

/**
 * Decorator, held a reference to the component and defines an interface that adjusts to it.
 */
public abstract class TreeDecorator implements ChristmasTree {
    private final ChristmasTree tree;

    protected TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    // standard constructors
    @Override
    public String decorate() {
        return tree.decorate();
    }
}
