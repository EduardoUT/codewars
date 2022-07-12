/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

/**
 * En este desafío se te solicita obtener el cuadrado de cada digito de un
 * número y concatenarlo.
 *
 * Por ejemplo, si pasamos 9119 en la función, 811181 será el retorno, porque
 * 9^2 es 81 y 1^2 es 1.
 *
 * Nota: La función acepta un entero y retorna un entero.
 *
 * @author Eduardo Reyes Hernández
 */
public class CuadradoDeCadaDigito {

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
        System.out.println(squareDigits(0));
        System.out.println(squareDigits(24));
        System.out.println(squareDigits(234));
    }

    public static int squareDigits(int n) {
        String squaredDigits = "";
        int numberLength = String.valueOf(n).length();
        int squaredDigit;
        for (int i = 0; i < numberLength; i++) {
            char digitValue = String.valueOf(n).charAt(i);
            double digitValueToDouble = Double.parseDouble(String.valueOf(digitValue));
            squaredDigit = (int) Math.pow(digitValueToDouble, 2);
            squaredDigits = squaredDigits.concat(String.valueOf(squaredDigit));
        }
        return Integer.valueOf(squaredDigits);
    }
}
