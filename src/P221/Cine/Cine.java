/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P221.Cine;

import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int personas = sc.nextInt();
            if (personas > 0 && personas <= 10000) {
                boolean fin = false;
                int cuantos = 0;
                int[] asientos = new int[personas];
                for (int j = 0; j < asientos.length; j++) {
                    asientos[j] = sc.nextInt();
                }
                if (personas > 2) {
                    for (int j = personas - 1; j >= 0; j--) {
                        if (fin == false) {
                            if (asientos[j] % 2 != 0) {
                                cuantos++;
                                if( j == 0){
                                    System.out.println("SI "+cuantos);
                                }
                            } else {
                                fin = true;
                                if( j == 0 && cuantos > 0){
                                    System.out.println("SI "+cuantos);
                                }
                            }
                        } else if (asientos[j] % 2 != 0) {
                            System.out.println("NO");
                            j = 0;
                        } else if (j == 0 && cuantos > 0) {
                            System.out.println("SI " + cuantos);
                        } else if (j == 0 && cuantos == 0){
                            System.out.println("NO");
                        }

                    }
                } else if (personas == 1) {
                    if (asientos[0] % 2 == 0) {
                        System.out.println("NO");
                    } else {
                        System.out.println("SI 1");
                    }
                } else if (asientos[0] % 2 == 0 && asientos[1] % 2 != 0) {
                    System.out.println("SI 2");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
