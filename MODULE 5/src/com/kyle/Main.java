package com.kyle;

public class Main {

    public static void main(String[] args) {

        Player jackDaniels = new Player(80, "jackDaniels", 145);
        Player yangnyeom = new Player(98, "yangnyeom", 115);
        Player spicyBbq = new Player(88, "spicyBbq", 220);
        Player snowCheese = new Player(90, "snowCheese", 120);
        Player lemonGlazed = new Player(86, "lemonGlazed", 420);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(jackDaniels.getUserName(), jackDaniels);
        hashtable.put(yangnyeom.getUserName(), yangnyeom);
        hashtable.put(spicyBbq.getUserName(), spicyBbq);
        hashtable.put(snowCheese.getUserName(), snowCheese);
        hashtable.put(lemonGlazed.getUserName(), lemonGlazed);


        System.out.println("The Get Function: ");
        System.out.println(hashtable.get("lemonGlazed"));

        System.out.println(hashtable.remove("spicyBbq"));
        System.out.println("\n\nThe Remove Function: ");
        hashtable.printHashtable();


    }
}
