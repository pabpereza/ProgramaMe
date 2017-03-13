/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P241.MeQuiereNoMeQuiere;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class MeQuiereNoMeQuiere {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int numCasos = entrada.nextInt();

        for (int i = 0; i < numCasos; i++) {
            calcular(entrada.nextInt());
        }

    }

    static void calcular(int numHojas) {

        if (numHojas < 3 || numHojas == 5) {
            System.out.println("IMPOSIBLE");
        } else if (numHojas == 3 || numHojas == 6) {
            System.out.println("0");
        } else {

            switch (numHojas % 3) {
                case 0:
                    System.out.println("0");
                    break;
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
            }

        }

    }

}
