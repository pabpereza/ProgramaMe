/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P190.DividirFactoriales;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class DividirFactoriales {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        long num1, num2;

        while ((num1 = entrada.nextInt()) >= (num2 = entrada.nextInt())) {
            calcular(num1, num2);
        }

    }

    static void calcular(long num1, long num2) {

        long fNum1 = 1;

        if (num1 == num2) {
            System.out.println("1");
        } else {

            for (long i = num2+1; i <= num1; i++) {
                fNum1 = fNum1 * i;
            }

            
            System.out.println(fNum1);
        }

    }
}
