package com.kyle;

public class Main {

    public static void main(String[] args) {



              Player BK = new Player (1, "BK", 100);
              Player Doomsdale = new Player (2, "Doomsdale", 68);
              Player Sphinx = new Player (3, "Sphinx", 49);
              //Player Sushi = new Player (4, "Sushi", 99);

              PlayerLinkedList playerLinkedList = new PlayerLinkedList();

              playerLinkedList.addToFront(BK);
              playerLinkedList.addToFront(Doomsdale);
              playerLinkedList.addToFront(Sphinx);
              //playerLinkedList.addToFront(Sushi);

              // Prints linkedlist
              playerLinkedList.printList();

              // Prints remove first element function
              //playerLinkedList.removeFirst();
              //playerLinkedList.printList();

              //Prints IndexOf function
              playerLinkedList.index0f(BK);

              //Prints Counter
              System.out.println(playerLinkedList.sizeCount());

              //Prints contains function
              playerLinkedList.contains(BK);


              //NOTES:

              //getting a single element
              //System.out.println(playerList.get(0));

              //adding a new element
              //playerList.add(2, new Player (4, "Sushi", 34));

              //removing an element
              //playerList.remove(2);

              //Contain function
              //System.out.println(playerList.contains(new Player(2, "Doomsdale", 68)));

              //System.out.println(playerList.indexOf(new Player(2, "Doomsdale", 68)));

              // simplified for-loop
              // for new java
              //playerList.forEach(player -> System.out.println(player));

              //for (Player p : playerList)
              //{
                // System.out.println(p);
              //}

    }
}
