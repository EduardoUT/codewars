package mx.com.codewars;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Completa la función de suma al cuadrado, cada número
 * debe elevarse al cuadrado y despuúes sume los resultados
 * de casa cuadrado.
 *
 * Por ejemplo:
 * [1, 2, 2] debería retornar 9 porque, 1^2 + 2^2 + 2^2= 9.
 *
 * @author Eduardo Reyes Hernández
 */
public class SumaAlCuadrado {

    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, 2, 2}));
        System.out.println(squareSum(new int[]{1, 2}));
        System.out.println(squareSum(new int[]{5, -3, 4}));
        System.out.println(squareSum(new int[]{}));
    }

    public static int squareSum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += (int) Math.pow(number, 2);
        }
        return result;
    }
}
