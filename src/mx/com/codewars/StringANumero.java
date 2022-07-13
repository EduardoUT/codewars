/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

/**
 * Necesitamos una función que pueda transformar un String a un número.
 *
 * Nota: Descuida, todo valor ingresado será String, y cada String es una
 * perfecta representación valida de un número entero.
 *
 * @author Eduardo Reyes Hernández
 */
public class StringANumero {

    public static void main(String[] args) {
        System.out.println(StringANumero.stringToNumber("1234"));
        System.out.println(StringANumero.stringToNumber("605"));
        System.out.println(StringANumero.stringToNumber("1405"));
        System.out.println(StringANumero.stringToNumber("-7"));
    }
    
    public static int stringToNumber(String str) {
        return Integer.valueOf(str);
    }
}
