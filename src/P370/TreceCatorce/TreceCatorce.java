package P370.TreceCatorce;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class TreceCatorce {
   
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int numCasos = entrada.nextInt();
        
        for (int i = 0; i < numCasos; i++) {
            calcular(entrada.next());
        }
        
    }
    
    static void calcular(String llave){
        
        int num1,num2;
        num1 = Integer.parseInt(llave.split("-")[0]);
        num2 = Integer.parseInt(llave.split("-")[1]);
        
        if( num1 > num2 ){
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        
        if( num1 % 2 == 0 && num1 +1 == num2 ){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        
    }
}
