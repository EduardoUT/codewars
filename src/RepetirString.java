/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Escribe una función que acepte un entero y un String como parámetros,
 * y retorne un String repetido la cantidad de veces indicadas por
 * el número entero ingresado.
 *
 * @author Eduardo Reyes Hernández
 */
public class RepetirString {

    public static void main(String[] args) {
        System.out.println(repetirString(4, "a"));
        System.out.println(repetirString(3, "Hello"));
        System.out.println(repetirString(5, ""));
        System.out.println(repetirString(0, "kata"));
    }

    public static String repetirString(final int repeticion, final String string) {
        StringBuilder stringRepetido = new StringBuilder();
        if (!string.isEmpty()) {
            for (int i = 0; i < repeticion; i++) {
                stringRepetido.append(string);
            }
            return String.valueOf(stringRepetido);
        } else {
            return String.valueOf(stringRepetido);
        }

    }
}
