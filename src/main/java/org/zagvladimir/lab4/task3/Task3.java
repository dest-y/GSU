package org.zagvladimir.lab4.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ababaacb
        System.out.println("Введите текст для задания 3: ");
        System.out.println(countCombinations(sc.nextLine()));
    }

    public static String countCombinations(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length() - 1; i++) {
            String combination = text.substring(i, i + 2);
            int count = 0;

            for (int j = i; j < text.length() - 1; j++) {
                if (text.substring(j, j + 2).equals(combination) && !result.toString().contains(combination)) {
                    count++;
                }
            }
            if (count == 0) continue;
            result.append(combination).append(": ").append(count).append(" ");
        }
        return result.toString();
    }
}
