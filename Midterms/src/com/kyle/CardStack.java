package com.kyle;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
private LinkedList<Card> stack;

    CardStack(){
      stack = new LinkedList<Card>();
    }
    void push(Card Hero){
      stack.push(Hero);
    }
    boolean isEmpty(){
        return stack.isEmpty();
    }
     Card pop(){
        return stack.pop();
    }
     Card peek(){
        return stack.peek();
    }
     int size(){
        return stack.size();
    }
     void printCardStack(){
         for (Card card : stack) {
             System.out.println(card);
         }
    }
}
