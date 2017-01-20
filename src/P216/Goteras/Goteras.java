/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P216.Goteras;

import java.util.Scanner;

/**
 *
 * @author Strike
 */
public class Goteras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            op(sc.nextInt());
        }
    }
    
    public static void op(int num){
        int horas,minutos,segundos;
        minutos = num/60;
        segundos = num%60;
        horas = minutos/60;
        minutos = minutos%60;
        String tiempo = "";
        if(horas<10){
            tiempo = "0"+horas+":";
        }else{
            tiempo = ""+horas+":";
        }
        if(minutos<10){
            tiempo += "0"+minutos+":";
        }else{
            tiempo += ""+minutos+":";
        }
        if(segundos<10){
            tiempo += "0"+segundos;
        }else{
            tiempo += ""+segundos;
        }
        System.out.println(tiempo);
    }
}
