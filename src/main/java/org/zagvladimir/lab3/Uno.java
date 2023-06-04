package org.zagvladimir.lab3;

public class Uno extends CardGame{
    private int deckSize;
    public Uno(String title, int year, int deckSize) {
        super(title, year);
        this.deckSize = deckSize;
    }

    public int getDeckSize() {
        return deckSize;
    }

    @Override
    public void play() {
        System.out.println("Игра Uno начата!");
        System.out.println("Размер колоды: " + deckSize);
    }

    @Override
    public String toString() {
        return "Uno{" +
                "deckSize=" + deckSize +
                '}';
    }
}
