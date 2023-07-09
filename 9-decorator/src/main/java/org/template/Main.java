package org.template;

import org.template.structure.BubbleLights;
import org.template.structure.ChristmasTree;
import org.template.structure.ChristmasTreeImpl;
import org.template.structure.Garland;
import org.template.structure.TreeDecorator;

/**
 * Example of Decorator pattern design.
 * Credits to <a href="https://www.baeldung.com/java-decorator-pattern">Baeldung</a> for the example.
 */
public class Main {

    public static void main(String[] args) {
        ChristmasTree tree = new ChristmasTreeImpl();
        System.out.println(tree.decorate());

        TreeDecorator treeWithBubbleLights = new BubbleLights(tree);
        System.out.println(treeWithBubbleLights.decorate());

        TreeDecorator treeWithGarland = new Garland(tree);
        System.out.println(treeWithGarland.decorate());

        TreeDecorator completeTree = new Garland(treeWithBubbleLights);
        System.out.println(completeTree.decorate());
    }
}
