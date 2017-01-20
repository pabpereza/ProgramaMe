/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P219.LoteriaPena;

import java.util.Scanner;
public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {  
            int contador= 0;
            int j = sc.nextInt();                  
            for (int h = 0; h < j; h++) {            
                int decimo = sc.nextInt();
                if(decimo % 2 ==0){
                    contador++;
                }
                
            }
            System.out.println(contador);
        }
    }
}
