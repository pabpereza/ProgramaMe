/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P217.Calles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Strike
 */
public class Calles {
    public static void main(String[] args) throws IOException {
        int aux;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while( (aux = Integer.parseInt(bf.readLine())) != 0){
            comp(aux);
        }
    }
    
    public static void comp(int num){
        if(num%2 == 0){
            System.out.println("DERECHA");
        }else{
            System.out.println("IZQUIERDA");
        }
    }
}
