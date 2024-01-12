package org.zagvladimir.lab1;

import java.util.Scanner;

public class Task1 {
    private static double x;
    private static int a, b;

    //3 5 5
    public static void main(String[] args) {
        inputValues();

        if (x < a) {
            func1();
        } else if (x >= a && x <= b) {
            func2();
        } else if (x > b) {
            func3();
        }
    }

    private static void func1() {
        System.out.println(Math.cos(x + Math.log(x)) + Math.exp(x));
    }

    private static void func2() {
        System.out.println(Math.pow(x, 3) + Math.pow(x, 2) - 15);
    }

    private static void func3() {
        System.out.println((x + 5) / Math.tan(Math.PI * x));
    }

    static void inputValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение переменной x: ");
        x = scanner.nextDouble();

        System.out.print("Введите значение переменной a: ");
        a = scanner.nextInt();

        System.out.print("Введите значение переменной b: ");
        b = scanner.nextInt();

        scanner.close();
    }
}
