/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P214.AbdicacionDeUnRey;

import java.util.HashMap;
import java.util.Scanner;

public class Reyes {

    static Scanner entrada = new Scanner(System.in);
    static HashMap<String, Integer> nombres;

    public static void main(String[] args) {
        nombres = new HashMap<>();
        int numeroReyes;
        while ((numeroReyes = entrada.nextInt()) != 0) {
            calcular(numeroReyes);
        }
    }

    static void calcular(int numReyes) {
        nombres.clear();
        
        String nombreTemp;
        for (int i = 0; i < numReyes; i++) {
            nombreTemp = entrada.next();
            if(nombres.containsKey(nombreTemp)){
                nombres.put(nombreTemp, nombres.get(nombreTemp)+1 );
            }else{
                nombres.put(nombreTemp, 1);
            }
        }
        
        
        int numSucesores = entrada.nextInt();
        String tempSucesor;
        for (int i = 0; i < numSucesores; i++) {
            tempSucesor = entrada.next();
            if ( nombres.get(tempSucesor) == null){
                nombres.put(tempSucesor, 1);
                System.out.println(1);
            }else{
                System.out.println(nombres.get(tempSucesor)+1);
                nombres.put(tempSucesor, nombres.get(tempSucesor)+1);
            }
        }
        System.out.println("");
    }

}