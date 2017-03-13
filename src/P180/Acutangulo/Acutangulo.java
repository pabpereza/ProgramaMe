/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P180.Acutangulo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author striker
 */
public class Acutangulo {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int numCasos = entrada.nextInt();
        
        for (int i = 0; i < numCasos; i++) {
            calcular();
        }
        
    }
    
    static void calcular(){
        
        double[] lados = new double[3];
        
        lados[0] = entrada.nextDouble();
        lados[1] = entrada.nextDouble();
        lados[2] = entrada.nextDouble();
        
        Arrays.sort(lados);
        
        if( lados[2] >= lados[1] + lados[0]  ){
            System.out.println("IMPOSIBLE");
        }else if(  Math.pow(lados[2], 2) < Math.pow(lados[0], 2) + Math.pow(lados[1], 2)){
            System.out.println("ACUTANGULO");
        }else if( Math.pow(lados[2], 2) == Math.pow(lados[0], 2) + Math.pow(lados[1], 2)){
            System.out.println("RECTANGULO");
        }else{
            System.out.println("OBTUSANGULO");
        }
                
    }
    
}
