/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

/**
 * Dado un String de digitos, deberás reemplazar cada dígito menor que 5 con un
 * '0' y cada digito mayor que 5 con '1'. Retorna el resultado en un String.
 *
 * Nota: En la entrada núnca debe haber un string vacío.
 *
 * @author Eduardo Reyes Hernández
 */
public class FalsosBinarios {

    public static void main(String[] args) {
        //System.out.println(FalsosBinarios.obtenerBinarioFalso(null));
        //System.out.println(FalsosBinarios.obtenerBinarioFalso(""));
        System.out.println(FalsosBinarios.obtenerBinarioFalso("45385593107843568"));
        System.out.println(FalsosBinarios.obtenerBinarioFalso("509321967506747"));
        System.out.println(FalsosBinarios.obtenerBinarioFalso("366058562030849490134388085"));
    }

    public static String obtenerBinarioFalso(String numberString) {
        StringBuilder fakeBinaryNumber = new StringBuilder();
        if (numberString == null) {
            return String.valueOf(fakeBinaryNumber);
            //throw new NullPointerException("Ningún valor encontrado.");
        } else if(numberString.isEmpty()) {
            return String.valueOf(fakeBinaryNumber);
            //throw new RuntimeException("El valor no puede estar vacío.");
        } else {
            for (int i = 0; i < numberString.length(); i++) {
                String digitValue = String.valueOf(numberString.charAt(i));
                int digitInteger = Integer.valueOf(digitValue);
                if (digitInteger < 5) {
                    digitInteger = 0;
                    fakeBinaryNumber.append(String.valueOf(digitInteger));
                } else {
                    digitInteger = 1;
                    fakeBinaryNumber.append(String.valueOf(digitInteger));
                }
            }
        }
        return String.valueOf(fakeBinaryNumber);
    }
    
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
