package org.zagvladimir.lab2.task2;

import java.util.Arrays;
import java.util.Scanner;


public class Task2 {
    private static final Scanner scanner = new Scanner(System.in);
    private static int[] vector = null;

    public static void main(String[] args) {
        int[][] matrix = readMatrix();

        System.out.println("Исходная матрица:");
        printMatrix(matrix);
        System.out.println();

        transformMatrix(matrix);

        System.out.println("Матрица после изменения:");
        printMatrix(matrix);
        System.out.println();

        vector = createVector(matrix);
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
                case 1 -> sort2(vector);
                case 2 -> sort(vector);
                default -> System.out.println("Неверный выбор\n");
            }
        }
    }

    private static int[] createVector(int[][] matrix) {
        int maxDiagonalValue = Integer.MIN_VALUE;
        int rowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > maxDiagonalValue) {
                maxDiagonalValue = matrix[i][i];
                rowIndex = i;
            }
        }

        int[] vectorB = new int[matrix.length];
        for (int j = 0; j < matrix.length; j++) {
            vectorB[j] = matrix[rowIndex][j];
        }
        return vectorB;
    }

    private static void transformMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            matrix[i][i] = sum;
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] > array[j - 1]) {
                    int n = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = n;
                }
            }
        }
    }

    public static void sort2(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static int[][] readMatrix() {
        int size = 0;

        while (size <= 0) {
            System.out.print("Введите размер квадратной матрицы (целое положительное число): ");
            size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Размер матрицы должен быть положительным числом. Пожалуйста, повторите ввод.");
            }
        }

        int[][] matrix = new int[size][size];

        System.out.println("Введите элементы матрицы:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}