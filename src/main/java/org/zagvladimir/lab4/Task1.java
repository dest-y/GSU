package org.zagvladimir.lab4;

public class Task1 {
    private static String[] dictionary = new String[]{
            "ноль",
            "один",
            "два",
            "три",
            "четыре",
            "пять",
            "шесть",
            "семь",
            "восемь",
            "девять"
    };

    public static void main(String[] args) {
        System.out.println(replaceNumber("Это 1, просто 2, текст 3, с цифрами 4."));
        System.out.println(countAdjacentPairs("ababaacbcbccababaabccccab"));
    }

    private static String replaceNumber(String text) {
        StringBuilder resultString = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) {
                int indexOfNumber = Character.getNumericValue(ch);
                resultString.append(dictionary[indexOfNumber]);
            } else {
                resultString.append(ch);
            }
        }
        return resultString.toString();
    }

    public static String countAdjacentPairs(String text) {
        StringBuilder result = new StringBuilder();
        int[] counts = new int[26 * 26];

        for (int i = 0; i < text.length() - 1; i++) {
            char first = Character.toLowerCase(text.charAt(i));
            char second = Character.toLowerCase(text.charAt(i + 1));

            if (Character.isLetter(first) && Character.isLetter(second)) {
                int index = (first - 'a') * 26 + (second - 'a');
                counts[index]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                int index = i * 26 + j;
                char first = (char) (i + 'a');
                char second = (char) (j + 'a');
                int count = counts[index];

                if (count > 0) {
                    result.append(first).append(second).append(": ").append(count).append(" ");
                }
            }
        }
        return result.toString();
    }
}
