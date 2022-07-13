/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

/**
 * ¡Juguemos!
 *
 * Tendrás que retornar que jugador ganó.
 *
 * En caso de un empate, retorna ¡Empate!.
 *
 * Ejemplo (input1, input2 --> Output):
 *
 * "tijeras", "papel" --> "¡Jugador 1 ganó!"
 *
 * "tijeras", "piedra" --> "¡Jugador 2 ganó!"
 *
 * "papel", "papel" --> "¡Empate!"
 *
 * @author Eduardo Reyes Hernández
 */
public class PiedraPapelTijeras {

    public static void main(String[] args) {
        System.out.println("Prueba Jugador 1 Gana.");
        System.out.println();
        System.out.println(PiedraPapelTijeras.rps("piedra", "tijeras"));
        System.out.println(PiedraPapelTijeras.rps("tijeras", "papel"));
        System.out.println(PiedraPapelTijeras.rps("papel", "piedra"));
        System.out.println();
        System.out.println("Prueba Jugador 2 Gana.");
        System.out.println();
        System.out.println(PiedraPapelTijeras.rps("tijeras", "piedra"));
        System.out.println(PiedraPapelTijeras.rps("papel", "tijeras"));
        System.out.println(PiedraPapelTijeras.rps("piedra", "papel"));
        System.out.println();
        System.out.println("Prueba Empate.");
        System.out.println();
        System.out.println(PiedraPapelTijeras.rps("tijeras", "tijeras"));
        System.out.println(PiedraPapelTijeras.rps("papel", "papel"));
        System.out.println(PiedraPapelTijeras.rps("piedra", "piedra"));
    }

    public static String rps(String jugadorUno, String jugadorDos) {
        String ganador;
        String[] armas = {"papel", "tijeras", "piedra"};
        String[] status = {"¡Jugador 1 ganó!", "¡Jugador 2 ganó!", "¡Empate!"};
        ganador = status[0];
        if ((jugadorUno.equals(armas[0]) && jugadorDos.equals(armas[2]))) {
            return ganador;
        } else if (jugadorUno.equals(armas[1]) && jugadorDos.equals(armas[0])) {
            return ganador;
        } else if (jugadorUno.equals(armas[2]) && jugadorDos.equals(armas[1])) {
            return ganador;
        } else {
            ganador = status[1];
            if ((jugadorDos.equals(armas[0])) && jugadorUno.equals(armas[2])) {
                return ganador;
            } else if ((jugadorDos.equals(armas[1])) && jugadorUno.equals(armas[0])) {
                return ganador;
            } else if (jugadorDos.equals(armas[2]) && jugadorUno.equals(armas[1])) {
                return ganador;
            } else {
                ganador = status[2];
                return ganador;
            }
        }
    }
}
