package com.kyle;

import java.util.NoSuchElementException;

public class arrayQueue {

    private Player[] queue;
    private int front;
    private int back;

    arrayQueue(int capacity){
        queue = new Player[capacity];
    }

    void add(Player player){
        if (back == queue.length) {

            Player[] newArray = new Player[queue.length * 2];
            System.arraycopy(queue,0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = player;
        back++;
    }

     Player remove(){
        if(size() == 0){
            throw new NoSuchElementException();
        }

        Player removedPlayer = queue[front];
        queue[front] = null;
        front++;

        if(size() == 0){
            front = 0;
            back = 0;
        }
         return removedPlayer;
     }

    Player peek(){
        if(size() == 0){
            throw new NoSuchElementException();

        }
        return queue[front];
    }

    int size(){
        return back - front;
    }

    void printQueue(){
        for (int i = front; i < back; i++){
            System.out.println(queue[i]);
        }
    }

}
