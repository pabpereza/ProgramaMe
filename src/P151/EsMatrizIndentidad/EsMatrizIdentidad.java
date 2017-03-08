/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P151.EsMatrizIndentidad;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class EsMatrizIdentidad {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int tamanoMatriz = 0;
        while ((tamanoMatriz = entrada.nextInt()) != 0) {
            calcular(tamanoMatriz);
        }

    }
    
    static void calcular(int tamanoMatriz){
        
        int valorTemp = 0;
        String resultado = "SI";
        
        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                valorTemp = entrada.nextInt();
                if( i == j ){
                    if(valorTemp != 1){
                        resultado = "NO";
                    }
                }else{
                    if(valorTemp != 0){
                        resultado = "NO";
                    }
                }
            }
        }        
        System.out.println(resultado);        
    }

}
