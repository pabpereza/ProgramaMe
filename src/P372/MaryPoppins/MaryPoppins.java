/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P372.MaryPoppins;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class MaryPoppins {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String args[]) {

        int numCasos = entrada.nextInt();

        for (int i = 0; i < numCasos; i++) {
            calcular(entrada.next());
        }

    }

    static void calcular(String palabra) {

        char[] palabraChars = palabra.toCharArray();
        palabra = "";
        
        if( Character.isUpperCase(palabraChars[0]) ){
            palabraChars[0] = Character.toLowerCase(palabraChars[0]);
            palabraChars[palabraChars.length-1] = Character.toUpperCase(palabraChars[palabraChars.length-1]);
        }

        for (int j = palabraChars.length - 1; j >= 0; j--) {
            palabra += palabraChars[j];            
        }
                
        System.out.println(palabra);
        
    }
   

}
