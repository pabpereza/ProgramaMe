/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P340.Cerillas;

import java.util.Scanner;

/**
 *
 * @author strike
 */
public class Cerillas {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int vueltas = sc.nextInt();        
        for (int i = 0; i < vueltas; i++) {
            calcular(sc.nextInt(),sc.nextInt());            
        }        
    }
    
    public static void calcular(int filas, int columnas){
        System.out.println((filas+1) * columnas + (columnas+1)*filas);
    }
}
