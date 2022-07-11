/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Completa la función que cálcule el promedio de tres calificaciones
 * ingresadas, y retorne el valor de la letra asociada a ese grado.
 * +--------------------+-----------------+
 * | Promedio numérico  | Grado en Letra. |
 * +--------------------+-----------------+
 * |90 <= promedio <=100|'A'              |
 * +--------------------+-----------------+
 * |80 <= promedio < 90 |'B'              |
 * +--------------------+-----------------+
 * |70 <= promedio < 80 |'C'              |
 * +--------------------+-----------------+
 * |60 <= promedio < 70 |'D'              |
 * +--------------------+-----------------+
 * |0 <= promedio < 60  |'F'              |
 * +--------------------+-----------------+
 *
 * @author Eduardo Reyes Hernández
 */
public class LibroDeCalificaciones {

    public static void main(String[] args) {
        System.out.println(obtenerGrado(70, 70, 100));
        System.out.println(obtenerGrado(82, 85, 87));
        System.out.println(obtenerGrado(84, 79, 85));
        System.out.println(obtenerGrado(44, 55, 52));
        System.out.println(obtenerGrado(66, 62, 68));
        System.out.println(obtenerGrado(70, 70, 70));
        System.out.println(obtenerGrado(95, 90, 93));
    }

    public static char obtenerGrado(int promedioUno, int promedioDos, int promedioTres) {
        int promedioTotal = (promedioUno + promedioDos + promedioTres) / 3;
        if ((promedioTotal >= 90) && (promedioTotal <= 100)) {
            return 'A';
        } else if ((promedioTotal >= 80) && (promedioTotal < 90)) {
            return 'B';
        } else if ((promedioTotal >= 70) && (promedioTotal < 80)) {
            return 'C';
        } else if ((promedioTotal >= 60) && (promedioTotal < 70)) {
            return 'D';
        } else if ((promedioTotal >= 0) && (promedioTotal < 60)) {
            return 'F';
        } else {
            return 0;
        }
    }
}
