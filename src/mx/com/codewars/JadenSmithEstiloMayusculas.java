/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

import java.util.Arrays;

/**
 * Jaden Smith actor de El Karate Kid (2010), es también conocido por algunas de
 * sus publicaciones en Twitter https://twitter.com/jaden
 *
 * Cuando escribe las palabras inician con mayúscua.
 *
 * Por simplicidad, deberás capitalizar cada palabra, observa como las
 * contracciones deben retornarse en el ejemplo de abajo.
 *
 * Tu tarea es convertir Strings al estilo de Jaden Smith. Ejemplo:
 *
 * No Capitalizadas: "How can mirrors be real if our eyes aren't real"
 * Capitalizadas: "How Can Mirrors Be Real If Our Eyes Aren't Real"
 *
 * Nota que la versión en Java espera un valor nulo para un string vacío o nulo.
 *
 * @author Eduardo Reyes Hernández
 */
public class JadenSmithEstiloMayusculas {

    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
        System.out.println(toJadenCase(""));
        System.out.println(toJadenCase(null));
        System.out.println(toJadenCase("esta es una frase con iniciales en mayúsculas"));
    }

    public static String toJadenCase(String frase) {
        if ((frase == null) || (frase.equals(""))) {
            return null;
        } else {
            char[] arr = frase.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if(i == 0) {
                    arr[i] = Character.toUpperCase(arr[i]);
                } else if (arr[i] == ' ') {
                    arr[i + 1] = Character.toUpperCase(arr[i + 1]);
                }
            }
            frase = String.valueOf(arr);
            return frase;
        }
    }
}
