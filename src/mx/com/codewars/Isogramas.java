/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * Un isograma es una palabra que no posee letras repetidas, consecutiva o no
 * consecutivamente.
 *
 * Implementa una función que determine si un String que contiene sólo letras es
 * un isograma. Asumiento también a un String vacío como un isograma también.
 *
 * Ignora si posee mayúsculas o minúsculas.
 *
 * @author Eduardo Reyes Hernández
 */
public class Isogramas {

    public static void main(String[] args) {
        System.out.println(Isogramas.esIsograma("Dermatoglyphics"));
        System.out.println(Isogramas.esIsograma("isogram"));
        System.out.println(Isogramas.esIsograma("moose"));
        System.out.println(Isogramas.esIsograma("isIsogram"));
        System.out.println(Isogramas.esIsograma("aba"));
        System.out.println(Isogramas.esIsograma("moOse"));
        System.out.println(Isogramas.esIsograma("polinomiomo"));
        System.out.println(Isogramas.esIsograma("thumbscrewjapingly"));
        System.out.println(Isogramas.esIsograma(""));
    }

    public static boolean esIsograma(String word) {
        boolean esIsograma;
        int numberOfRepetitions = 0;
        int wordLength = word.length();
        //char mostRepeatedLetter = 0;
        if (word.isEmpty()) {
            esIsograma = true;
            return esIsograma;
        } else {
            String lowerCaseWord = word.toLowerCase();
            for (int i = 0; i < wordLength; i++) {
                int counter = 0;
                Character actualLetter = lowerCaseWord.charAt(i);
                for (int j = 0; j < wordLength; j++) {
                    Character letter = lowerCaseWord.charAt(j);
                    if (letter.equals(actualLetter)) {
                        counter++;
                    }
                }

                if (numberOfRepetitions < counter) {
                    numberOfRepetitions = counter;
                    //mostRepeatedLetter = actualLetter;
                }
            }

            esIsograma = numberOfRepetitions <= 1;
            //System.out.println(mostRepeatedLetter + ": se repite: " + numberOfRepetitions);
            return esIsograma;
        }
    }
}
