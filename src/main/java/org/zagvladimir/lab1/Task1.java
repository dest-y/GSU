package org.zagvladimir.lab1;

import java.util.Scanner;

public class Task1 {
    private static double x;
    private static int a, b;
    private static double u;

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
        System.out.println(Math.pow(x, 4) * Math.sin(x));
    }

    private static void func2() {
        double temp = u - Math.pow(x, 2);
        if (temp >= 0) {
            System.out.println(Math.sqrt(temp));
        } else {
            System.out.println("Ошибка: Недопустимый аргумент для вычисления квадратного корня.");
        }
    }

    private static void func3() {
        double temp = x - 1;
        if (temp != 0) {
            System.out.println(x - 1 + (1 / temp));
        } else {
            System.out.println("Ошибка: Деление на ноль.");
        }
    }

    static void inputValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение переменной x: ");
        x = scanner.nextDouble();

        System.out.print("Введите значение переменной a: ");
        a = scanner.nextInt();

        System.out.print("Введите значение переменной b: ");
        b = scanner.nextInt();

        System.out.print("Введите значение переменной u: ");
        u = scanner.nextDouble();

        scanner.close();
    }
}
