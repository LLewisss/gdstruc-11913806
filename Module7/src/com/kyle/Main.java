package com.kyle;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.ins(25);
        tree.ins(17);
        tree.ins(29);
        tree.ins(10);
        tree.ins(16);
        tree.ins(-5);
        tree.ins(60);
        tree.ins(55);

        System.out.println("In Descemdimg Order: ");
        tree.traverseInOrder();

        System.out.println("Excluded Value: " +tree.get(9999));

        System.out.println("MIN VALUE: " +tree.getMin());

        System.out.println("MAX VALUE: " + tree.getMax());

    }
}
