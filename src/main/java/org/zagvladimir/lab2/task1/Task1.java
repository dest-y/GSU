package org.zagvladimir.lab2.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = arrayInput();
        System.out.print("Исходный массив: ");
        printArray(array);
        sum(array);
    }

    private static void sum(int[] array) {
        int firstZeroIndex = -1;
        int secondZeroIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if (firstZeroIndex == -1) {
                    firstZeroIndex = i;
                } else {
                    secondZeroIndex = i;
                    break;
                }
            }
        }

        if (firstZeroIndex != -1 && secondZeroIndex != -1) {
            int sum = 0;
            int startIndex = Math.min(firstZeroIndex, secondZeroIndex) + 1;
            int endIndex = Math.max(firstZeroIndex, secondZeroIndex);

            for (int i = startIndex; i < endIndex; i++) {
                sum += Math.abs(array[i]);
            }
            System.out.println("Сумма модулей элементов между первым и вторым нулевыми элементами: " + sum);
        } else {
            System.out.println("В массиве не найдены два нулевых элемента");
        }

    }

    private static int[] arrayInput() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите размер массива больше 0: ");
            n = sc.nextInt();
        } while (n < 0);

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}