package org.zagvladimir.lab4.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //а луна канула
        System.out.println("Введите текст для задания 1: ");
        System.out.println(replaceSymbols(sc.nextLine()));
    }

    private static String replaceSymbols(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                result.append(ch);
            }
        }

        return result.toString().contentEquals(result.reverse())
                ?
                "Palindrome" :
                "Not Palindrome";
    }
}
