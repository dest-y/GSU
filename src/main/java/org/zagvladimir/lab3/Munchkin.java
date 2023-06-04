package org.zagvladimir.lab3;

public class Munchkin extends CardGame{
    private int playerCount;
    private MunchkinCardType cardType;

    public Munchkin(String title, int year, int playerCount, MunchkinCardType cardType) {
        super(title, year);
        this.playerCount = playerCount;
        this.cardType = cardType;
    }

    public Munchkin(String title, int year) {
        super(title, year);
    }

    public Munchkin() {
    }

    public int getPlayerCount() {
        return playerCount;
    }



    @Override
    public void play() {
        System.out.println("Игра Munchkin начата!");
        System.out.println("Количество игроков: " + playerCount);
    }

    @Override
    public String toString() {
        return "Munchkin{" +
                "playerCount=" + playerCount +
                ", cardType=" + cardType +
                '}';
    }
}
