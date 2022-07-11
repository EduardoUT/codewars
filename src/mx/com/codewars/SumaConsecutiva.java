package mx.com.codewars;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Escribe un programa que cálcule la suma de un número dado,
 * comenzando desde 1 hasta el número ingresado en la función,
 * el número siempre debe ser un número positivo mayor a 0.
 *
 * summation(2) -> 3
 * 1 + 2.
 *
 * summation(8) -> 36
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
 *
 * @author Eduardo Reyes Hernández
 */
public class SumaConsecutiva {

    public static void main(String[] args) {
        System.out.println(summation(1));
    }

    public static int summation(int n) {
        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        } else {
            throw new ArithmeticException(
                    "Debe ser un número positivo mayor que cero."
            );
        }
    }
}
