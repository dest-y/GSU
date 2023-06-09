package org.zagvladimir.lab2.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = arrayInput();
        System.out.print("Исходный массив: ");
        printArray(array);
        calculateProduct(array);
    }

    private static void calculateProduct(int[] array) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] >= array[maxIndex]) {
                maxIndex = i;
            }
        }

        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        int result = 1;
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result *= array[i];
        }
        System.out.println("Индекс минимального элемента = " + minIndex);
        System.out.println("Индекс максимального элемента = " + maxIndex);
        System.out.println("Произведение элементов = " + result);
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