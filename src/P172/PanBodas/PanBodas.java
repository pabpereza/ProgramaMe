/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P172.PanBodas;

import java.util.Scanner;

public class PanBodas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aux = 0;
        while ((aux = sc.nextInt()) != 0) {
           comp(aux, sc.nextLine());

        }
    }
    

    public static void comp(int aux, String linea){ 
        if(linea.indexOf("D")!= -1 &&  linea.indexOf("I")!=-1){
            System.out.println("ALGUNO NO COME");
        }else{
            System.out.println("TODOS COMEN");
        }
    }
 
}