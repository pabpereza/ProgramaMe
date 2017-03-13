/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P119.EscudosRomanos;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class EscudosRomanos {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int numCaso = 0;

        while ((numCaso = entrada.nextInt()) != 0) {
            calcular(numCaso);
        }

    }

    static void calcular(int soldados) {
        int escudos = 0;
        int cuadrado;

        do {

            cuadrado = (int) Math.sqrt(soldados);
            soldados -= cuadrado * cuadrado;
            escudos += contarEscudos(cuadrado);
        } while (soldados > 0);

        System.out.println(escudos);
    }

    static int contarEscudos(int soldados) {
        int escudos = 0;

        if (soldados != 1) {

            escudos = 12 + (soldados - 2) * 8 + (soldados - 2) * (soldados - 2);
            
        } else {
            escudos = 5;
        }

        return escudos;
    }

}
