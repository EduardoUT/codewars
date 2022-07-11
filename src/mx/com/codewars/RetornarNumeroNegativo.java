/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

/**
 * En esta asignación simple, la función recibirá un número y deberá convertirlo
 * a negativo.
 *
 * ¿Pero si el número ya es negativo? Kata.makeNegative(1); return -1
 * Kata.makeNegative(-5); return -5 Kata.makeNegative(0); return 0
 *
 * El número puede ya ser negativo, en cuyo caso ningún cambio es requerido.
 *
 * Cero (0) no será evaluado.
 *
 * @author Eduardo Reyes Hernández
 */
public class RetornarNumeroNegativo {

    public static void main(String[] args) {
        System.out.println(makeNegative(4));
        System.out.println(makeNegative(42));
        System.out.println(hacerNegativo(0));
        System.out.println(hacerNegativo(-2500));
        System.out.println(hacerNegativo(23));
    }

    //Sin API Math de Java.
    public static int hacerNegativo(final int x) {
        int negative;
        if (x > 0) {
            negative = -x;
            return negative;
        } else {
            return x;
        }
    }

    //Con API Math de Java.
    public static int makeNegative(final int x) {
        if (x > 0) {
            return Math.negateExact(x);
        } else {
            return x;
        }
    }
}
