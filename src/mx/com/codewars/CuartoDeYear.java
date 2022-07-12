/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

/**
 * Dado un mes entero del 1 al 12, retorna a que cuarto del año pertenece como
 * número entero.
 *
 * Por ejemplo:
 *
 * mes 2 (Febrero), es parte del primer cuarto;
 *
 * mes 6 (Junio), es parte del segundo cuarto;
 *
 * mes 11 (Noviembre), es parte del cuarto cuarto de año.
 *
 * @author Eduardo Reyes Hernández
 */
public class CuartoDeYear {

    public static void main(String[] args) {
        System.out.println(cuartoDe(3));
        System.out.println(cuartoDe(8));
        System.out.println(cuartoDe(11));
    }

    public static int cuartoDe(int mes) {
        if ((mes >= 1) && (mes <= 3)) {
            return 1;
        } else if ((mes > 3) && (mes <= 6)) {
            return 2;
        } else if ((mes > 6) && (mes <= 9)) {
            return 3;
        } else if ((mes > 9) && (mes <= 12)) {
            return 4;
        } else {
            return 0;
        }
    }
}
