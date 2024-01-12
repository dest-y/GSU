package org.zagvladimir.lab2.task2;

import java.util.Arrays;
import java.util.Scanner;


public class Task2 {
    private static final Scanner scanner = new Scanner(System.in);
    private static int[] vector = null;
    private static int n, m, a, b;

    public static void main(String[] args) {
        int[][] matrix = readMatrix();

        System.out.println("Исходная матрица:");
        printMatrix(matrix);
        System.out.println();

        vector = getVectorFromMatrix(matrix);
        System.out.println("Вектор B: " + Arrays.toString(vector) + "\n");

        showMenu();

        System.out.println("Отсортированный вектор B: " + Arrays.toString(vector));
    }

    private static void showMenu() {
        int menu = -1;
        while (!(menu > 0 && menu < 3)) {
            System.out.println("""
                    Выберите метод сортировки
                    1. sort()
                    2. пузырьком
                    """
            );
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> Arrays.sort(vector);
                case 2 -> sortBubble(vector);
                default -> System.out.println("Неверный выбор\n");
            }
        }
    }

    private static int[] getVectorFromMatrix(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 == 0 && matrix[i][j] >= a && matrix[i][j] <= b) {
                    count++;
                }
            }
        }

        int[] vectorB = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 == 0 && matrix[i][j] >= a && matrix[i][j] <= b) {
                    vectorB[index++] = matrix[i][j];
                }
            }
        }
        return vectorB;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void sortBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int n = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = n;
                }
            }
        }
    }


    public static int[][] readMatrix() {
        n = readPositiveInt("Введите количество строк матрицы (n): ");
        m = readPositiveInt("Введите количество столбцов матрицы (m): ");

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Неверный ввод. Пожалуйста, введите целое число.");
                    scanner.next();
                }
                matrix[i][j] = scanner.nextInt();
            }
        }

        a = readInt("Введите значение a: ");
        b = readInt("Введите значение b: ");

        return matrix;
    }

    private static int readPositiveInt(String message) {
        int input;
        do {
            System.out.print(message);
            while (!scanner.hasNextInt()) {
                System.out.println("Неверный ввод. Пожалуйста, введите целое число.");
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input <= 0);
        return input;
    }

    private static int readInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Неверный ввод. Пожалуйста, введите целое число.");
            scanner.next();
        }
        return scanner.nextInt();
    }

}