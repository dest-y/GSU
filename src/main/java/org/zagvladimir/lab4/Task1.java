package org.zagvladimir.lab4;

import java.util.Scanner;

public class Task1 {
    private static String[] dictionary = new String[]{
            "ноль",
            "один",
            "два",
            "три",
            "четыре",
            "пять",
            "шесть",
            "семь",
            "восемь",
            "девять"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //abc.example.com
        System.out.println("Введите текст для задания 1: ");
        System.out.println(replaceSymbols(sc.nextLine()));

        //это 1 просто 2 текст 3 с 4 цифрами 5 6 7 8 9 0
        System.out.println("Введите текст для задания 2: ");
        System.out.println(replaceNumber(sc.nextLine()));

        //ababaacb
        System.out.println("Введите текст для задания 3: ");
        System.out.println(countCombinations(sc.nextLine()));
    }

    private static String replaceNumber(String text) {
        StringBuilder resultString = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) {
                int indexOfNumber = Character.getNumericValue(ch);
                resultString.append(dictionary[indexOfNumber]);
            } else {
                resultString.append(ch);
            }
        }
        return resultString.toString();
    }

    public static String countCombinations(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length() - 1; i++) {
            String combination = text.substring(i, i + 2);
            int count = 0;


            for (int j = i; j < text.length() - 1; j++) {
                if (text.substring(j, j + 2).equals(combination)) {
                    count++;
                }
            }

            result.append(combination).append(": ").append(count).append(" ");
        }

        return result.toString();
    }

    private static String replaceSymbols(String input) {
        if (input.startsWith("abc")) {
            return "www" + input.substring(3);
        } else {
            return input + "zzz";
        }
    }
}
