package org.zagvladimir.lab3.parent;

import java.util.Scanner;

public class GameTheme {
    private String name;
    private int difficultyLevel;

    public GameTheme() {
    }

    public GameTheme(String name, int difficultyLevel) {
        this.name = name;
        this.difficultyLevel = difficultyLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getName() {
        return name;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    @Override
    public String toString() {
        return "GameTheme{" +
                "name='" + name + '\'' +
                ", difficultyLevel=" + difficultyLevel +
                '}';
    }

    public void fillFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = scanner.nextLine();
        System.out.print("Enter the difficulty level: ");
        difficultyLevel = scanner.nextInt();
    }
}