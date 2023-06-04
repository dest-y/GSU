package org.zagvladimir.lab3.child2;

import org.zagvladimir.lab3.parent.GameTheme;

import java.util.Scanner;

public class Puzzle extends GameTheme {
    private PuzzleDifficulty difficulty;

    public Puzzle() {
    }

    public Puzzle(String name, int difficultyLevel, PuzzleDifficulty difficulty) {
        super(name, difficultyLevel);
        this.difficulty = difficulty;
    }

    public void setDifficulty(PuzzleDifficulty difficulty) {
        this.difficulty = difficulty;
    }

    public PuzzleDifficulty getDifficulty() {
        return difficulty;
    }


    public enum PuzzleDifficulty {
        EASY, MEDIUM, HARD
    }

    @Override
    public void fillFromKeyboard() {
        super.fillFromKeyboard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the puzzle difficulty:");
        System.out.println("1. EASY");
        System.out.println("2. MEDIUM");
        System.out.println("3. HARD");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                difficulty = PuzzleDifficulty.EASY;
                break;
            case 2:
                difficulty = PuzzleDifficulty.MEDIUM;
                break;
            case 3:
                difficulty = PuzzleDifficulty.HARD;
                break;
            default:
                System.out.println("Invalid option. Setting difficulty to EASY.");
                difficulty = PuzzleDifficulty.EASY;
                break;
        }
    }
    @Override
    public String toString() {
        return "Puzzle{" +
                "name='" + super.getName() +
                ", difficultyLevel= " + super.getDifficultyLevel() +
                " difficulty=" + difficulty +
                '}';
    }
}