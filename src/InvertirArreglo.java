
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Dado un número aleatorio no negativo, debes retornar los digitos de este
 * número dentro de un arreglo en orden inverso.
 *
 * @author Eduardo Reyes Hernández
 */
public class InvertirArreglo {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(InvertirArreglo.digitize(35231)));
    }

    /**
     *
     * @param n Número a ser invertido a través de un arreglo.
     * @return Número ingresado en un arreglo en orden inverso.
     */
    public static int[] digitize(long n) {
        String numberToString = String.valueOf(n);
        int numberLength = numberToString.length();
        int[] inversoOutput = new int[numberLength];
        int count = 0;
        for (int i = numberLength - 1; i >= 0; i--) {
            inversoOutput[count] = Integer.parseInt(String.valueOf(numberToString.charAt(i)));
            count++;
        }
        return inversoOutput;
    }
}
