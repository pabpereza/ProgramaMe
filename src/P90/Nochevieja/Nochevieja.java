/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P90.Nochevieja;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Strike
 */
public class Nochevieja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {

            String gh = "" + sc.next() + sc.nextLine();
            System.out.println(gh);
            String[] st = gh.split(" ");
            if (st.length == 2) {
                try {
                    int dia = Integer.parseInt(st[0]);
                    int mes = Integer.parseInt(st[1]);

                    comp(dia, mes);
                } catch (Exception e) {
                    System.out.println("DATOS NO ENTEROS");
                }

            } else {
                System.out.println("ENTRADA INCORRECTA");
            }
        }

    }

    public static void comp(int dia, int mes) {
        int[] cal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (dia <= cal[mes - 1] && mes <= 12) {
            GregorianCalendar gc = new GregorianCalendar(2017, mes, dia);
            System.out.println(gc.getTimeInMillis());
        } else {
            System.out.println("ERROR DE FECHA");
        }

    }
}
