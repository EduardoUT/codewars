package mx.com.codewars;


import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Escribe una función para convertir un nombre a sus iniciales. Este desafio
 * toma estrictamente dos palabras con un espacio entre ellas.
 *
 * La salida deberá ser dos letras mayúsculas separadas por un punto. Debería
 * verse así: Sam Harris => S.H patrick feeney => P.F
 *
 * @author Eduardo Reyes Hernández
 */
public class AbreviarDosPalabras {

    public static void main(String[] args) {
        String name = "eduardo reyes";
        System.out.println(abreviarNombre(name));
    }

    public static String abreviarNombre(String nombre) {
        String iniciales = "";
        for (int i = 0; i < nombre.length(); i++) {
            if (i == 0) {
                iniciales += nombre.charAt(i);
            }
            if (String.valueOf(nombre.charAt(i)).equals(" ")) {
                i++;
                iniciales += "." + nombre.charAt(i);
            }
        }
        return iniciales.toUpperCase();
    }
}
