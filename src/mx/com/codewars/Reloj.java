/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

/**
 * El reloj muestra h horas, m minutos y s segundos despiés de media noche.
 *
 * Tú tarea es escribir una función que retorna el tiempo desde media noche en
 * millisegundos.
 *
 * Ejemplo: h = 0 m = 1 s = 1
 *
 * result = 61000
 *
 * Restricciones de ingreso:
 *
 * 0 <= h <= 23 0 <= m <= 59 0 <= s <= 59
 * @
 *
 * author Eduardo Reyes Hernández
 */
public class Reloj {

    public static void main(String[] args) {
        System.out.println(Reloj.calcularMilisegundos(0, 1, 1));
    }

    public static int calcularMilisegundos(int h, int m, int s) {
        int milisegundo = 1000;
        int segundos = milisegundo * 60;
        int minutos = segundos * 60;
        int totalMiliseconds = 0;
        if ((h >= 0 && h <= 23) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59)) {
            totalMiliseconds = (h * minutos) + (m * segundos) + (s * milisegundo);
            return totalMiliseconds;
        } else {
            return totalMiliseconds;
        }
    }
}
