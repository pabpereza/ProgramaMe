/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P373.CubosVisibles;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class CubosVisibles {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int numCasos = entrada.nextInt();

        for (int i = 0; i < numCasos; i++) {

            int dimension = entrada.nextInt();
            
            //               Cubos en la base y en la cabeza  + aristas           + interior caras laterales 
            long resultado = (long) Math.pow(dimension, 2) * 2 + 4 *(dimension-2)  + (long)Math.pow(dimension-2,2) * 4 ;
            System.out.println(resultado);

        }

    }
}
