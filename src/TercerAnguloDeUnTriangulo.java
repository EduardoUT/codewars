/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Recibirás dos ángulos interiores en grados de un triángulo.
 *
 * Escribe una función que retorne el tercer ángulo.
 *
 * Sólo números positivos serán probados.
 *
 * @author Eduardo Reyes Hernández
 */
public class TercerAnguloDeUnTriangulo {

    public static void main(String[] args) {
        int a = 55;
        int b = 25;
        System.out.println(anguloMisterioso(a, b));
    }

    public static int anguloMisterioso(int anguloUno, int anguloDos) {
        return 180 - (anguloUno + anguloDos);
    }
}
