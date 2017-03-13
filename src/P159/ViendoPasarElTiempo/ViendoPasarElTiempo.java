/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P159.ViendoPasarElTiempo;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class ViendoPasarElTiempo {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String horaInicial, horaFinal, num;

        String[] linea = entrada.nextLine().split(" ");
        horaInicial = linea[0];
        horaFinal = linea[1];
        num = linea[2];

        while (!horaFinal.equals("24:00") && !horaInicial.equals("24:00")) {

            calcular(horaInicial, horaFinal, num);

            linea = entrada.nextLine().split(" ");
            horaInicial = linea[0];
            horaFinal = linea[1];
            num = linea[2];
        }

    }

    static void calcular(String horaInicial, String horaFinal, String num) {

        int iniHoras, iniMinutos, finHoras, finMinutos;
        int minutosTotales = 0;

        String[] tiempoInicial = horaInicial.split(":");
        iniHoras = Integer.parseInt(tiempoInicial[0]);
        iniMinutos = Integer.parseInt(tiempoInicial[1]);

        String[] tiempoFinal = horaFinal.split(":");
        finHoras = Integer.parseInt(tiempoFinal[0]);
        finMinutos = Integer.parseInt(tiempoFinal[1]);

        //Si las horas son iguales
        if (iniHoras == finHoras) {

            if (("" + iniHoras).contains(num)) {
                minutosTotales = finMinutos - iniMinutos +1;
            } else {
                if (iniMinutos < 10 && num.contains("0")) {
                    minutosTotales += 10 - iniMinutos;
                }
                for (int i = iniMinutos; i <= finMinutos; i++) {
                    if (("" + i).contains(num)) {
                        minutosTotales++;
                    }
                }

            }

        } else {
            //Si no son iguales

            //Minutos iniciales
            if (("" + iniHoras).contains(num)) {
                minutosTotales += 60 - iniMinutos;
            } else {
                if (iniMinutos < 10 && num.contains("0")) {
                    minutosTotales += 10 - iniMinutos;
                }
                for (int i = iniMinutos; i < 60; i++) {
                    if (("" + i).contains(num)) {
                        minutosTotales++;
                    }
                }
            }

            //Horas intermedias            
            for (int i = iniHoras + 1; i <= finHoras - 1; i++) {

                if (("" + i).contains(num)) {
                    minutosTotales += 60;
                } else {
                    if( num.contains("0")){
                        minutosTotales+=10;
                    }
                    for (int j = 0; j < 60; j++) {
                        if (("" + j).contains(num)) {
                            minutosTotales++;
                        }
                    }
                }

            }

            //Minutos finales
            if (("" + finHoras).contains(num)) {
                minutosTotales += finMinutos;
            } else {
                if ( finMinutos < 10 && num.contains("0")) {
                    minutosTotales += finMinutos;
                }
                for (int i = 0; i <= finMinutos; i++) {
                    if (("" + i).contains(num)) {
                        minutosTotales++;
                    }
                }
            }

        }

        System.out.println(minutosTotales);

    }

}
