/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

/**
 * Escribe una función que tome un arreglo de palabras, las una en una oración y
 * la retorne. Puedes ignorar signos de puntuación, pero debes agregar espacios
 * en blanco entre cada palabra.
 *
 * Se cuidadoso, no debe haber espacios en blanco al principio ni al final de
 * una oración.
 *
 * Ejemplo: ["hello", "world", "this", "is", "great"] => "hello world this is
 * great"
 *
 * @author Eduardo Reyes Hernández
 */
public class ConstruirOraciones {

    public static void main(String[] args) {
        System.out.println(construirOracion(new String[]{"Estoy", "prácticando", "con", "Java"}));
        System.out.println(construirOracion(new String[]{}));
        System.out.println(construirOracion(new String[]{" Hay", "un", "espacio", "al", "inicio..."}));
        System.out.println(construirOracion(new String[]{"Hay", "un", "espacio", "al", "final... "}));
        System.out.println(construirOracion(new String[]{" Espacio", "en", "el", "inicio", "y", "fin "}));
        System.out.println(smash("Estoy", "prácticando", "con", "Java"));
    }

    public static String construirOracion(String[] palabras) {
        String oracion = "";
        int indiceUltimoElemento = palabras.length - 1;
        if (palabras.length > 0) {//Si el arreglo no está vacío.
            for (int i = 0; i < palabras.length; i++) {
                if (palabras[0].startsWith(" ") || palabras[indiceUltimoElemento].endsWith(" ")) {//Si inicia con espacio en blanco.
                    return oracion;
                } else {
                    if (i != indiceUltimoElemento) { //Si no es la última palabra concatena un espacio de separación.
                        oracion += palabras[i].concat(" ");
                    } else {
                        oracion += palabras[i];
                    }
                }
            }
        } else {
            return oracion;
        }
        return oracion;
    }
    
    public static String smash(String... words) {
    return String.join(" ", words);
  }
}
