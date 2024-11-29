/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author eduar
 */
public class YourOrderPlease {

    public static void main(String[] args) {
        String someString = "is2 Thi1s T4est 3a";
        System.out.println(orderComparator(someString));
    }

    /**
     * First solution with O(n*m) complecity.
     * 
     * @param words
     * @return 
     */
    public static String order(String words) {
        String[] arrayOfWords = words.split("\\s+");
        int arrayOfWordsSize = arrayOfWords.length;
        if (arrayOfWordsSize == 0 || words.isEmpty()) {
            return "";
        } else {
            if (arrayOfWords[0].isEmpty()) {
                arrayOfWordsSize -= 1;
            }
            String[] result = new String[arrayOfWordsSize];
            for (String word : arrayOfWords) {
                for (Character character : word.toCharArray()) {
                    if (Character.isDigit(character)) {
                        int digit = Integer.parseInt(character.toString());
                        result[digit - 1] = word;
                        break;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (String word : result) {
                sb.append(word);
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }

    /**
     * First checks if a String is emppty or if its 0 length after split the
     * spaces in an array.
     * 
     * Time Complexity: O(k * m log k)
     *
     * @param words
     * @return The String ordered according to the number in the word.
     */
    public static String orderComparator(String words) {
        String[] arrayOfWords = words.split("\\s+");
        int arrayOfWordsSize = arrayOfWords.length;
        if (arrayOfWordsSize == 0 || words.isEmpty()) {
            return "";
        } else {
            return sort(arrayOfWords);
        }
    }

    /**
     * Implementing a personalized Comparator of Strings. Extracts a numeric
     * digit for sort.
     *
     * @param arrayOfWords An array of unsorted words.
     * @return A String in its numeric order.
     */
    public static String sort(String[] arrayOfWords) {
        Arrays.sort(arrayOfWords, new Comparator<String>() {
            @Override
            public int compare(String word, String anotherWord) {
                return checkDigit(word, anotherWord);
            }

            /**
             * Extract a numeric digit in String word and anotherWord to use in
             * compare of Class Character.
             *
             * @param word
             * @param anotherWord
             * @return int value according to compare method of Character class.
             */
            public int checkDigit(String word, String anotherWord) {
                int i = 0;
                int j = 0;
                char digitA = 0;
                char digitB = 0;

                while (i < word.length()) {
                    if (Character.isDigit(word.charAt(i))) {
                        digitA = word.charAt(i);
                    }
                    i++;
                }

                while (j < anotherWord.length()) {
                    if (Character.isDigit(anotherWord.charAt(j))) {
                        digitB = anotherWord.charAt(j);
                    }
                    j++;
                }

                return Character.compare(digitA, digitB);
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (String word : arrayOfWords) {
            stringBuilder.append(word);
            stringBuilder.append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
