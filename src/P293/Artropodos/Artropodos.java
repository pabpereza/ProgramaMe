/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P293.Artropodos;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class Artropodos {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int numCasos = entrada.nextInt();
        
        for (int i = 0; i < numCasos; i++) {
            int patasTotales = entrada.nextInt() * 6 + entrada.nextInt() * 8 + entrada.nextInt() * 10 + entrada.nextInt() * (entrada.nextInt()* 2);
            System.out.println(patasTotales);
        }
        
    }

}
