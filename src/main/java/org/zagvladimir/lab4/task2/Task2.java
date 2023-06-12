package org.zagvladimir.lab4.task2;

import java.util.Scanner;

public class Task2 {
    private static final String[] dictionary = new String[]{
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

        //это 1 просто 2 текст 3 с 4 цифрами 5 6 7 8 9 0
        System.out.println("Введите текст для задания 2: ");
        System.out.println(replaceNumber(sc.nextLine()));
    }

    private static String replaceNumber(String text) {
        StringBuilder resultString = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) {
                resultString.append(dictionary[Character.getNumericValue(ch)]);
            } else {
                resultString.append(ch);
            }
        }
        return resultString.toString();
    }
}
