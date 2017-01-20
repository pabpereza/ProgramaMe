/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P369.BaseUno;

import java.util.Scanner;

/**
 *
 * @author strike
 */
public class BaseUno {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true) {
            num = sc.nextInt();
            if (num != 0) {
                String cadena = "";
                for (int i = 0; i < num; i++) {
                    cadena += "1";
                }
                System.out.println(cadena);
            }else{
                break;
            }
        }
    }
}
