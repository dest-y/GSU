package org.zagvladimir.lab4.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ААА ббб ВВВ гГг
        System.out.println("Введите текст для задания 2: ");
        System.out.println(convertToUpperCase(sc.nextLine()));
        System.out.println(convertToUpperCase2(sc.nextLine()));
    }

    public static String convertToUpperCase(String input) {
        return input.toUpperCase();
    }

    public static String convertToUpperCase2(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch: input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append((char) (ch & ~32));
            } else  result.append(ch);
        }

        return result.toString();
    }
}
