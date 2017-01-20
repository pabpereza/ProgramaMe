/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P313.FinDeMes;

import java.util.Scanner;
public class FinDeMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {            
            System.out.println(((sc.nextInt() + sc.nextInt()) >= 0) ? "SI" : "NO" );
        }
    }
}
