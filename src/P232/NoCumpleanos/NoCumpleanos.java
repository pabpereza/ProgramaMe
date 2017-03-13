/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P232.NoCumpleanos;

import java.util.Scanner;

public class NoCumpleanos {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String c = "0 0 0 0 0 0", a = "";
        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (!(a = entrada.nextLine()).equals(c)) {
            String[] fechas = a.split(" ");
            calcular(fechas, diasMeses);
        }
    }

    static void calcular(String[] fechasS, int[] diasMeses) {

        int diasTotales = 0;

        int diaNac = Integer.parseInt(fechasS[0]);
        int mesNac = Integer.parseInt(fechasS[1]);
        int anoNac = Integer.parseInt(fechasS[2]);

        int diaAct = Integer.parseInt(fechasS[3]);
        int mesAct = Integer.parseInt(fechasS[4]);
        int anoAct = Integer.parseInt(fechasS[5]);
        
    
        //Si ya ha pasado un ano
        if (diaNac == diaAct && mesAct == mesNac) {
            
        } else if (anoAct > anoNac) {

            //Dias de su primer año de vida
            int diasAux = 0;
            for (int i = 0; i < mesNac - 1; i++) {
                diasAux += diasMeses[i];
            }
            diasAux += diaNac;
            diasTotales += 365 - diasAux;

            //Años entremedio
            diasTotales += (anoAct - anoNac - 1) * 364;

            //Dias del ano final
            for (int i = 0; i < mesAct - 1; i++) {
                diasTotales += diasMeses[i];
            }
            diasTotales += diaAct;

            //Si estamos en el mismo año en el que ha nacido         
        } else {

            //Si no ha pasado ni un mes
            if (mesAct == mesNac) {
                diasTotales += diaAct - diaNac;

                //Si no...
            } else {

                //Dias del primer mes
                diasTotales += diasMeses[mesNac - 1] - diaNac;

                //Dias de entremedio
                for (int i = mesNac; i < mesAct - 1; i++) {
                    diasTotales += diasMeses[i];
                }

                //Dias finales
                diasTotales += diaAct;

            }

        }
        
        System.out.println(diasTotales);
    }

}
