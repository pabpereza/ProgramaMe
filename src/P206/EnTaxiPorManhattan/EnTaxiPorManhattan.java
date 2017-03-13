/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P206.EnTaxiPorManhattan;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class EnTaxiPorManhattan {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int numCasos = entrada.nextInt();

        for (int i = 0; i < numCasos; i++) {
            calcular(entrada.nextInt());
        }

    }

    static void calcular(int hipotenusa) {

        boolean correcto = false;
        int resultado = 0;

        for (int i = hipotenusa - 1; i > 0 && !correcto; i--) {

            double cateto = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(i, 2));

            if (cateto % 1 == 0 && hipotenusa < i + cateto && Math.pow(hipotenusa, 2) == Math.pow(cateto, 2) + Math.pow(i, 2) ) {

                resultado = i + (int) Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(i, 2));
                System.out.println(resultado);
                correcto = true;

            }

        }

    }

}
