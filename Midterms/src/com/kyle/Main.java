package com.kyle;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CardStack cardDeck = new CardStack();
        CardStack playerCard = new CardStack();
        CardStack discardedPile = new CardStack();

        for(int i = 0; i < 3; i++){
            cardDeck.push(new Card(1,"Aggro Druid"));
            cardDeck.push(new Card(2,"Secret Paladin"));
            cardDeck.push(new Card(3,"Elemental Shaman"));
            cardDeck.push(new Card(4,"Quest Warrior"));
            cardDeck.push(new Card(5,"Face Hunter"));
            cardDeck.push(new Card(6,"Handbuff Paladin"));
            cardDeck.push(new Card(7,"Clown Druid"));
            cardDeck.push(new Card(8,"Libram Paladin"));
            cardDeck.push(new Card(9,"Big Warrior"));
            cardDeck.push(new Card(10,"Evolve Shaman"));
            cardDeck.push(new Card(11,"Quest Hunter"));
            cardDeck.push(new Card(12,"Quest Mage"));
            cardDeck.push(new Card(13,"Quest Rogue"));
            cardDeck.push(new Card(14,"Quest Shaman"));
            cardDeck.push(new Card(15,"Quest Warlock"));
            cardDeck.push(new Card(16,"Ping Mage"));
            cardDeck.push(new Card(17,"Poison Rogue"));
            cardDeck.push(new Card(18,"Fel Demon Hunter"));
            cardDeck.push(new Card(19,"Beast Hunter"));
            cardDeck.push(new Card(20,"Anacondra Druid"));
            cardDeck.push(new Card(21,"Quest Druid"));
            cardDeck.push(new Card(22,"Aggro Shadow Priest"));
            cardDeck.push(new Card(23,"Aggro Elemental Shaman"));
            cardDeck.push(new Card(24,"Deathrattle Demon Hunter"));
            cardDeck.push(new Card(25,"Quest Control Warrior"));
            cardDeck.push(new Card(26,"Quest Zoo Warlock"));
            cardDeck.push(new Card(27,"Control Warrior"));
            cardDeck.push(new Card(28,"Garrote Rogue"));
            cardDeck.push(new Card(29,"Miracle Druid"));
            cardDeck.push(new Card(30,"Quest Lifesteal Demon Hunter"));
        }

        Random result = new Random();
        int match = 1;
        while(true){
            System.out.println("============START OF MATCH " + match + "=============");
            match++;
           startMatch(cardDeck,playerCard, discardedPile, result);
            System.out.println("=============DECK UPDATE================");
           deckUpdate(cardDeck, playerCard, discardedPile);
            System.out.println("=============END OF MATCH================");
        }
    }


    static void startMatch(CardStack cardDeck, CardStack playerCard, CardStack discardedPile, Random result){
        int end =  result.nextInt(2);

        if(end == 0){
            System.out.println("DRAW CARD");
            end = result.nextInt(3);
            int size = playerCard.size();
            if(end < size){
                end = size;
            }

            for(int i = 0; i < end; i++){
              System.out.println("YOU HAVE DRAW: " + cardDeck.peek());
              Card got = cardDeck.peek();
              playerCard.push(got);
              cardDeck.pop();
            }

            if(playerCard.size() >= 30){
                System.out.println("****************GAME OVER******************");
                System.out.println("YOU HAVE TOO MUCH HEROES");
                System.exit(0);
            }
        }
        else if (end == 1){
            System.out.println("Discard a Hero");
            if(playerCard.isEmpty()){
                System.out.println("No Cards");
            }
            else{
                end = result.nextInt(3);
                int size = playerCard.size();
                if(end > size){
                    end = size;
                }

                for (int i = 0; i < end; i++){
                    System.out.println("YOU HAVE DISCARDED: " + playerCard.peek());
                    Card remove = playerCard.peek();
                    discardedPile.push(remove);
                    playerCard.pop();
                }

                if(cardDeck.isEmpty()){
                    System.out.println("****************GAME OVER******************");
                    System.out.println("DECK IS EMPTY");
                    System.exit(0);
                }
                else if(playerCard.isEmpty()){
                    System.out.println("****************GAME OVER******************");
                    System.out.println("YOU HAVE NO MORE HEROES");
                    System.exit(0);
                }

            }
        }
        else if(end == 2){
            System.out.println("Draw from the Discarded Pile");
            if(discardedPile.isEmpty()){
                System.out.println("The Discard Pile is Empty");
            }
            else{
                end = result.nextInt(3);
                int size = discardedPile.size();
                if(end > size){
                    end = size;
                }

                for (int i = 0; i < end; i++){
                    System.out.println("You have Draw: " + discardedPile.peek() + " from the Discarded Pile");
                    Card get = discardedPile.peek();
                    playerCard.push(get);
                    discardedPile.pop();
                }

                if(playerCard.size() >= 30){
                    System.out.println("****************GAME OVER******************");
                    System.out.println("YOU HAVE TOO MANY HEROES");
                    System.exit(0);
                    //System.out.println("For Continuing the Game, type 1 to Discard Heroes: ");
                    //Scanner Scan = new Scanner(System.in);
                    //int input = Scan.nextInt();
                    //int D = 1;
                    //if(input == D){
                        //System.out.println("Discarding Heroes...");
                        //for (int i = 1; i > playerCard.size(); i++){
                            //System.out.println("You have Draw: " + discardedPile.peek() + " from the Discarded Pile");
                            //Card get = discardedPile.peek();
                            //playerCard.push(get);
                            //discardedPile.pop();
                        //}
                    //}
                    //else{
                        //System.out.println("YOU ENDED THE GAME");
                        //System.exit(0);
                    //}
                }
            }
        }

    }

    static void deckUpdate(CardStack cardDeck, CardStack playerCard, CardStack discardedPile){
        System.out.print("Number of Heroes: ");
        System.out.println(playerCard.size());

        int hands = playerCard.size();
        if(hands == 0) {
            System.out.println("You have no Heroes");
        }
        else{
            System.out.println("You have have: ");
            playerCard.printCardStack();
        }

        int removed = discardedPile.size();
        if(removed == 0){
            System.out.println("There are no Heroes Discarded");
        }
        else{
            System.out.println("Discarded Heroes: " + discardedPile.size());
        }

    }


}

