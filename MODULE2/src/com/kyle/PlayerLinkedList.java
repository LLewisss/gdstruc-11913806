package com.kyle;

import java.util.Objects;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }


    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        //while (current != null) {
        //System.out.print(current);
        //System.out.print(" -> ");
        //current = current.getNextPlayer();

        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();


        }
        System.out.println("null");
    }


    public void removeFirst() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while(head != null) {
            current= current.getNextPlayer();
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
        }
        System.out.println("null");
    }


    public int sizeCount() {
        PlayerNode current = head;
        int count = 0;
        System.out.print(" Element Count: ");
        while (current != null) {
            count++;
            current = current.getNextPlayer();
        }
        return count;
    }


    public int index0f(Player name) {
        System.out.print("Index of ");
        for ( int i = 0; i < name.getId() ; i++) {
         System.out.print(i);
        }
        return name.getId();
    }

    public void contains(Player name){
        if (name != null)
        {
            System.out.println("Contain : true");
        }
        else {
            System.out.println("Contain : false");
      }
    }

}



