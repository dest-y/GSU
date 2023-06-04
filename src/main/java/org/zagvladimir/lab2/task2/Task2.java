package org.zagvladimir.lab2.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = readMatrix();

        System.out.println("Исходная матрица:");
        printMatrix(matrix);
        System.out.println();

        transformMatrix(matrix);

        System.out.println("Матрица после изменения:");
        printMatrix(matrix);
        System.out.println();

        int[] vector = createVector(matrix);
        System.out.println("Вектор B: " + Arrays.toString(vector) + "\n");

        sort(vector);
        System.out.println("Отсортированный вектор B: " + Arrays.toString(vector));
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

    public static int[][] readMatrix() {
        Scanner scanner = new Scanner(System.in);

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
                System.out.print("Элемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}