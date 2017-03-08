/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P149.SanFermines;

import java.util.Scanner;

/**
 *
 * @author striker
 */

public class SanFermines {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        while(entrada.hasNext()){
            
            int numToros = entrada.nextInt();
            int toroMasRapido = 0;
            int velocidadToroTemp = 0;
            
            for (int i = 0; i < numToros; i++) {
                if(  (velocidadToroTemp = entrada.nextInt() ) > toroMasRapido ){
                    toroMasRapido = velocidadToroTemp;
                }
            }
            
            System.out.println(toroMasRapido);
            
        }
        
    }
   
}
