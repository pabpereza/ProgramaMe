/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P332.PesandoCarretas;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class PesandoCarretas {

    static Scanner entrada = new Scanner(System.in);
    static int[] pesosParejasCarros;
    static int[] pesosCarros;
    
    public static void main(String[] args) {
        
        int numCasos = entrada.nextInt();
        
        for (int i = 0; i < numCasos; i++) {
            calcular();
        }
        
    }
    
    static void calcular(){
        
        pesosParejasCarros = new int[10];
        pesosCarros = new int[5];
        
        for (int i = 0; i < 10; i++) {
            pesosParejasCarros[i] = entrada.nextInt();
        }        
                
        pesosCarros[3] = ((pesosParejasCarros[1] - pesosParejasCarros[0]) - pesosParejasCarros[7] + pesosParejasCarros[1] -pesosParejasCarros[0] - pesosParejasCarros[8] + pesosParejasCarros[9])/-2 ;
        
        pesosCarros[4] =  pesosParejasCarros[0] - pesosCarros[3];
        pesosCarros[2] = pesosParejasCarros[1] - pesosCarros[4];
        
        pesosCarros[0] = pesosParejasCarros[8] - pesosCarros[2];
        pesosCarros[1] = pesosParejasCarros[9] - pesosCarros[0];
               
        
        System.out.println(pesosCarros[0] + " " + pesosCarros[1] + " " + pesosCarros[2] + " " + pesosCarros[3] + " " + pesosCarros[4]);      
    }
}


