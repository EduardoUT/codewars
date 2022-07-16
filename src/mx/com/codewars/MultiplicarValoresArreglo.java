/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

/**
 * Dado un arreglo no vacío, retorna el resultado multiplicando los valores en
 * orden.
 *
 * Ejemplo:
 *
 * [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 *
 * @author Eduardo Reyes Hernández
 */
public class MultiplicarValoresArreglo {

    public static void main(String[] args) {
        System.out.println(grow(new int[]{1, 2, 3}));
        System.out.println(grow(new int[]{4, 1, 1, 1, 4}));
        System.out.println(grow(new int[]{2, 2, 2, 2, 2, 2}));
    }

    public static int grow(int[] numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }
}
