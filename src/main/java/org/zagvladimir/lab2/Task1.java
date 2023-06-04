package org.zagvladimir.lab2;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {5, 1, 1, 2, 4, 3, 4, 5};

        System.out.println(sum(array));
    }
    private static int sum(int[] array){
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

        return result;
    }
}