package org.zagvladimir.lab3;

import org.zagvladimir.lab3.child1.Action;
import org.zagvladimir.lab3.child2.Puzzle;
import org.zagvladimir.lab3.parent.GameTheme;

public class Main {
    public static void main(String[] args) {
        GameTheme gameTheme = new GameTheme();
        gameTheme.fillFromKeyboard();

        Puzzle puzzle = new Puzzle();
        puzzle.fillFromKeyboard();

        Action action = new Action("Action Game", 5, "Shooter");

        System.out.println("Game Theme:");
        System.out.println(gameTheme);
        System.out.println();

        System.out.println("Action Game Theme:");
        System.out.println(action);
        System.out.println();

        System.out.println("Puzzle Game Theme:");
        System.out.println(puzzle);
    }
}
