/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

/**
 *
 * @author eduar
 */
public class BinaryAddition {

    private BinaryAddition() {
        throw new IllegalStateException("Utility class.");
    }

    public static String binaryAddition(int a, int b) {
        return sum(decimalToBinary(a), decimalToBinary(b));
    }

    /**
     * Method to convert decimal to binary according to the remainder.
     *
     * @param value
     * @return
     */
    public static String decimalToBinary(int value) {
        StringBuilder sb = new StringBuilder();
        switch (value) {
            case 0:
                sb.append(value);
                break;
            case 1:
                sb.append(value);
                break;
            default:
                int remainder;
                do {
                    remainder = value % 2;
                    value = value / 2;
                    if (remainder == 0) {
                        sb.append(0);
                    } else if (remainder == 1) {
                        sb.append(1);
                    }
                } while (value != 0);
                break;
        }
        return sb.toString();
    }

    /**
     * In case both strings are of the same length() appends the result in
     * StringBuilder. Otherwise appends the remainder elements of the strings a
     * or b with aux respectively and keep adding the values, at last if aux its
     * 1 appends the value to the StringBuilder and return the reverse result.
     *
     * @param a
     * @param b
     * @return
     */
    public static String sum(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aSize = a.length();
        int bSize = b.length();
        int i = 0;
        int j = 0;
        int aux = 0;
        int res;
        String charOfA;
        String charOfB;
        while (i < aSize && j < bSize) {
            charOfA = a.substring(i, ++i);
            charOfB = b.substring(j, ++j);
            res = Integer.valueOf(charOfA) + Integer.valueOf(charOfB) + aux;
            switch (res) {
                case 0:
                    sb.append(0);
                    aux = 0;
                    break;
                case 1:
                    sb.append(1);
                    aux = 0;
                    break;
                case 2:
                    sb.append(0);
                    aux = 1;
                    break;
                default:
                    sb.append(1);
                    aux = 1;
                    break;
            }
        }

        while (i < aSize) {
            charOfA = a.substring(i, ++i);
            res = Integer.parseInt(charOfA) + aux;
            if (res == 2) {
                sb.append(0);
                aux = 1;
            } else {
                sb.append(res);
                aux = 0;
            }
        }

        while (j < bSize) {
            charOfB = b.substring(j, ++j);
            res = Integer.parseInt(charOfB) + aux;
            if (res == 2) {
                sb.append(0);
                aux = 1;
            } else {
                sb.append(res);
                aux = 0;
            }
        }

        if (aux == 1) {
            sb.append(aux);
        }
        return sb.reverse().toString();
    }
}
