/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P116.HolaMundo;

import java.util.Scanner;
public class Holamundo2 {
    public static void main(String[] args) {
        int numeroSout, i = 0;
        Scanner entrada = new Scanner(System.in);
        numeroSout = entrada.nextInt();        
        while (i < numeroSout) {
            System.out.println("Hola mundo.");
            i ++;
        }
    }
}

