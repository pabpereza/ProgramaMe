/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P245.LosDalton;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class LosDalton {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        long numHermanos;
        while ((numHermanos = entrada.nextLong()) != 0) {
            calcular(numHermanos);
        }

    }

    static void calcular(double numHermanos) {

        boolean daltonA = true, daltonD = true;
        long anterior = entrada.nextLong();
        long actual;       

        for (double i = 1; i < numHermanos; i++) {
            actual = entrada.nextLong();
            
            if (anterior >= actual) {
                daltonA = false;
            }
            if (anterior <= actual) {
                daltonD = false;
            }
            anterior = actual;

        }

        if (daltonA || daltonD) {
            System.out.println("DALTON");
        } else {
            System.out.println("DESCONOCIDOS");
        }

    }
}
