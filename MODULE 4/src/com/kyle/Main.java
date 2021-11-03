package com.kyle;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	   arrayQueue queue = new arrayQueue(6);
        arrayQueue dequeue = new arrayQueue(6);

        //for(int i = 0; i < 1; i++) {
        queue.add(new Player(1, "Charizard", 64));
        queue.add(new Player(2, "Arceus", 100));
        queue.add(new Player(3, "Venasaur", 69));
        queue.add(new Player(4, "Blastoise", 45));
        queue.add(new Player(5, "Lucario", 55));
        queue.add(new Player(6, "Mewtwo",86));
        queue.add(new Player(7, "Mew",90));
        queue.add(new Player(8, "Dragonite",78));
        queue.add(new Player(9, "Metagross",52));
        queue.add(new Player(10, "Garchomp",67));
        queue.add(new Player(11, "Charizard", 64));
        queue.add(new Player(12, "Arceus", 100));
        queue.add(new Player(13, "Venasaur", 69));
        queue.add(new Player(14, "Blastoise", 45));
        queue.add(new Player(15, "Lucario", 55));
        queue.add(new Player(16, "Mewtwo",86));
        queue.add(new Player(17, "Mew",90));
        queue.add(new Player(18, "Dragonite",78));
        queue.add(new Player(19, "Metagross",52));
        queue.add(new Player(20, "Garchomp",67));
        queue.add(new Player(21, "Empoleon", 64));
        queue.add(new Player(22, "Gengar", 100));
        queue.add(new Player(23, "Greeninja", 69));
        queue.add(new Player(24, "Yamask", 45));
        queue.add(new Player(25, "Togetic", 55));
        queue.add(new Player(26, "Gardevoir",86));
        queue.add(new Player(27, "Gallade",90));
        queue.add(new Player(28, "Meowth",78));
        queue.add(new Player(29, "Swampert",52));
        queue.add(new Player(30, "Sceptile",67));
        queue.add(new Player(31, "Blaiziken", 64));
        queue.add(new Player(32, "Infernape", 100));
        queue.add(new Player(33, "Pikachu", 69));
        queue.add(new Player(34, "Electebuzz", 45));
        queue.add(new Player(35, "Magmortar", 55));
        queue.add(new Player(36, "Snowrunt",86));
        queue.add(new Player(37, "Palkia",90));
        queue.add(new Player(38, "Dialga",78));
        queue.add(new Player(39, "Giratina",52));
        queue.add(new Player(40, "Torcoal",67));
        queue.add(new Player(41, "Snorlax", 64));
        queue.add(new Player(42, "Cubone", 100));
        queue.add(new Player(43, "Ditto", 69));
        queue.add(new Player(44, "Eevee", 45));
        queue.add(new Player(45, "Jolteon", 55));
        queue.add(new Player(46, "Vaporeon",86));
        queue.add(new Player(47, "Umbreon",90));
        queue.add(new Player(48, "Flareon",78));
        queue.add(new Player(49, "Sylveon",52));
        queue.add(new Player(50, "Espeon",67));

        //}
        //queue.printQueue();
        //queue.remove();

        //System.out.println("AFTER REMOVE PLAYER:\n");
        //queue.printQueue();

        Random ran = new Random();
        int round = 1;
        int Size = dequeue.size();
        int Pokemon = 5;
        while (round <= 10){

            System.out.println("============START OF ROUND " + round + "=============");

            push(queue, dequeue, ran);

            System.out.println("Press Enter to START GAME... ");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if (input == ("")) {
                pop(queue, dequeue, ran);
            }
            System.out.println("Press Enter to START NEXT ROUND... ");
            Scanner scann = new Scanner(System.in);
            String inputs = scann.nextLine();
            if (inputs == ("")) {
                round++;
            }

        }

    }

    static void push(arrayQueue queue, arrayQueue dequeue, Random ran){

        //int end =  ran.nextInt(6);
        //int size = queue.size();
        //if(end > size){
            //end = size;
        //}

        System.out.println( "**********QUEUEING***********");
        for(int i = 0; i < 1; i++){
            queue.printQueue();
        }


    }

    static void pop(arrayQueue queue, arrayQueue dequeue, Random ran ){


        int add = 1 + ran.nextInt(7);
        int size = queue.size();
        if(add <= 5 ){
            add = size ;
        }


        System.out.println( "**********GAME STARTS***********");
        for(int i = 0; i < 5; i++){
            Player added  = queue.peek();
            queue.remove();
            dequeue.add(added);
        }
        dequeue.printQueue();
        for(int i = 0; i < 5; i++) {
            dequeue.remove();
        }

    }

}
