package org.zagvladimir.lab2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        transformMatrix(matrix);
        print(matrix);
        int[] vector = createVector(matrix);
        System.out.println(Arrays.toString(vector));
        sort(vector);
        System.out.println(Arrays.toString(vector));


    }
    private static int[] createVector(int[][] A){
        int maxDiagonalValue = Integer.MIN_VALUE;
        int rowIndex = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i][i] > maxDiagonalValue) {
                maxDiagonalValue = A[i][i];
                rowIndex = i;
            }
        }

        int[] B = new int[A.length];
        for (int j = 0; j < A.length; j++) {
            B[j] = A[rowIndex][j];
        }
        return B;
    }

    private static void transformMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                sum += A[j][i];
            }
            A[i][i] = sum;
        }
    }

    private static void print(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i ; j--) {
                if (array[j] > array[j -1]){
                    int n = array[j];
                    array[j] = array[j-1];
                    array[j-1] = n;
                }
            }
        }
    }
}