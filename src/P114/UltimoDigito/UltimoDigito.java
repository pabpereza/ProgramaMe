/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P114.UltimoDigito;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UltimoDigito {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bf.readLine());
        while(i>0){
            comp(Integer.parseInt(bf.readLine()));
            i--;
        }
    }

    public static void comp(int aux) {
        switch (aux) {
            case 0:
               System.out.println("1");
               break;

            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("6");
                break;

            case 4:
                System.out.println("4");
                break;
                
            default:
                System.out.println("0");
                break;
        }
    }
}
