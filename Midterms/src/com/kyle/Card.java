package com.kyle;

import java.util.Objects;

public class Card {

    private  int id;
    private String Hero;

    Card(int id, String Hero){
        this.id = id;
        this.Hero = Hero;
    }
    int getId(){
        return id;
    }
    String Hero(){
        return Hero;
    }
    void setCardTitle(String Hero){
        this.Hero = Hero;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Hero='" + Hero + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(Hero, card.Hero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Hero);
    }
}
