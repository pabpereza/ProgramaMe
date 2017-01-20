/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P205.Lychrel;

import java.util.Scanner;

public class Lychrel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int num = sc.nextInt();
            int contador = 0;
            boolean candado = true;
            while (num <1000000000) {
                contador++;
                num += getCapicua(num);
                if(capicua(num)){
                    System.out.println(""+contador+" "+num);
                    candado = false;
                    break;
                }
            }
            if(candado==true){
                System.out.println("Lychrel?");
            }
        }
    }

    public static boolean capicua(int num) {
        String aux = num + "";
        String segunda = "";
        for (int x = aux.length() - 1; x >= 0; x--) {
            segunda = segunda+ aux.charAt(x);
        }        
        return (segunda.compareTo(num+"")) ==0;
    }
    public static int getCapicua(int num) {
        String aux = num + "";
        String segunda = "";
        for (int x = aux.length() - 1; x >= 0; x--) {
            segunda = segunda+ aux.charAt(x);
        }        
        return Integer.parseInt(segunda);
    }
}
