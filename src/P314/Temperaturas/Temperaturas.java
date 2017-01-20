/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P314.Temperaturas;

import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int picos=0,valles=0;
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int cc = sc.nextInt();
            int ant = 1000, pos = 1000;
            int num = 0;
            for (int j = 0; j < cc; j++) {
                if(j>0){
                    ant = num;
                }
                num = sc.nextInt();
                if ( j+1 != cc) {
                    pos = sc.nextInt();
                }else{
                    pos = 1000;
                }
                if (j > 0 && pos !=1000) {
                    if(compPico(ant,num,pos)){
                        picos++;
                    }
                    if(compValle(ant,num,pos)){
                        valles++;
                    }
                }
            }
            System.out.println(picos+" "+valles);
        }
    }
    
    public static boolean compPico(int ant,int med,int pos){
        return med > ant && med > pos;
    }
    
    public static boolean compValle(int ant,int med,int pos){
        return med < ant && med < pos;
    }
}
