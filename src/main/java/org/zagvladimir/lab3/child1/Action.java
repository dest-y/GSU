package org.zagvladimir.lab3.child1;

import org.zagvladimir.lab3.parent.GameTheme;

import java.util.Scanner;

public class Action extends GameTheme {
    private String actionType;

    public Action() {
    }

    public Action(String name, int difficultyLevel, String actionType) {
        super(name, difficultyLevel);
        this.actionType = actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionType() {
        return actionType;
    }

    @Override
    public void fillFromKeyboard() {
        super.fillFromKeyboard();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the action type: ");
        actionType = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Action{" +
                "name='" + super.getName() +
                ", difficultyLevel= " + super.getDifficultyLevel() +
                ", actionType='" + actionType + '\'' +
                '}';
    }
}