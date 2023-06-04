package org.zagvladimir.lab4.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //abc.example.com
        System.out.println("Введите текст для задания 1: ");
        System.out.println(replaceSymbols(sc.nextLine()));
    }

    private static String replaceSymbols(String input) {
        if (input.startsWith("abc")) {
            return "www" + input.substring(3);
        } else {
            return input + "zzz";
        }
    }
}
