package org.zagvladimir.lab3;

import java.util.Scanner;

public class CardGame {
    private String title;
    private int year;

    public CardGame() {
    }

    public CardGame(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void play() {
        System.out.println("Игра начата!");
    }

    public static CardGame initializeFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название игры: ");
        String title = scanner.nextLine();
        System.out.print("Введите год выпуска игры: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        return new CardGame(title, year);
    }

    @Override
    public String toString() {
        return "CardGame{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
