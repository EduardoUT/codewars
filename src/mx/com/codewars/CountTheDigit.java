/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

/**
 * Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.
 *
 * Square all numbers k (0 <= k <= n) between 0 and n.
 *
 * Count the numbers of digits d used in the writing of all the k**2.
 *
 * Implement the function taking n and d as parameters and returning this count.
 * 
 * @author eduar
 */
public class CountTheDigit {

    public static int nbDig(int n, int d) {
        int counter = 0;
        int k;
        int lastDigit;
        for (int i = 0; i <= n; i++) {
            k = i * i;
            do {
                lastDigit = k % 10;
                if (lastDigit == d) {
                    counter++;
                }
                k = k / 10;
            } while (k > 0);
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(nbDig(10, 0));
    }
}
