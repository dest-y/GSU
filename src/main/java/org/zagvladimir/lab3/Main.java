package org.zagvladimir.lab3;

public class Main {
    public static void main(String[] args) {
        GameTheme gameTheme = new GameTheme();
        gameTheme.fillFromKeyboard();

        Action action = new Action("Action Game", 5, "Shooter");

        Puzzle puzzle = new Puzzle();
        puzzle.fillFromKeyboard();

        System.out.println("Game Theme:");
        System.out.println(gameTheme.toString());
        System.out.println();

        System.out.println("Action Game Theme:");
        System.out.println(action.toString());
        System.out.println();

        System.out.println("Puzzle Game Theme:");
        System.out.println(puzzle.toString());
    }
}
