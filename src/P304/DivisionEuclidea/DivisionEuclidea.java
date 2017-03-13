/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P304.DivisionEuclidea;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class DivisionEuclidea {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int numCasos = entrada.nextInt();

        for (int i = 0; i < numCasos; i++) {
            calcular();
        }
    }

    static void calcular() {

        int dividendo = entrada.nextInt();
        int divisor = entrada.nextInt();
        int cociente = 0, resto = 0;

        if (divisor != 0) {

            cociente = dividendo / divisor;

            if (dividendo < 0) {
                if (cociente < 0) {
                    cociente -= 1;
                } else {
                    cociente += 1;
                }

            }
            
            if (dividendo < divisor && dividendo < 0) {
                                
                
            }else{
                resto = dividendo - divisor * cociente;                
            }
     

            System.out.println(cociente + " " + resto);
        } else {
            System.out.println("DIV0");
        }

    }
}
