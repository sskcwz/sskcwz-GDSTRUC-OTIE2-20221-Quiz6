package org.gdstruc.module7;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        tree.traverseInOrder(); // traverse the tree (in ASCENDING order)
        System.out.println(" ");

        System.out.println(tree.get(22));  // search a node by value
        System.out.println(" ");

        tree.traverseInOrderDescending(); // traverse the tree (in DESCENDING order)
        System.out.println(" ");

        tree.getMin(); // get the MAXIMUM value from the tree
        System.out.println(" ");

        tree.getMax(); // get the MINIMUM value from the tree
    }
}