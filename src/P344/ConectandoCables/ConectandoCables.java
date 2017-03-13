/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P344.ConectandoCables;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class ConectandoCables {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int numCaso = entrada.nextInt();

        for (int i = 0; i < numCaso; i++) {
            calcular(entrada.nextInt());
        }

    }

    static void calcular(int numCables) {

        int machos = 0, hembras = 0;
        String aux;

        for (int i = 0; i < numCables; i++) {

            aux = entrada.next();
            if (aux.equals("MH") || aux.equals("HM") ) {
                machos++;
                hembras++;
            }else if( aux.equals("MM") ){
                machos += 2;
            }else{
                hembras += 2;
            }
                      
        }
        
        
        
        if(machos == hembras){
            System.out.println("POSIBLE");
        }else{
            System.out.println("IMPOSIBLE");
        }

    }

}
