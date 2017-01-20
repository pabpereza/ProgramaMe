/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P193.NumerosReversibles;

import java.util.Scanner;

public class NumerosReversibles {

    public static void main(String[] args) {
 
           Scanner sc = new Scanner(System.in);
        NumerosReversibles nr = new NumerosReversibles();
        long aux = 0;
        boolean b = false;
        while (sc.hasNextLong()) {
            if ((aux = sc.nextLong()) == 0) {
                b = true;
                break;
            }

            if (b != true) {
                nr.comp(Math.abs(aux));
            }
        } 
        
    }

    public void comp(long aux) {
         boolean esReversible = false;
            long reversible = revertir(aux);
            long suma = reversible + aux;
          
            try{
                String sumaString = "" + suma;
            String[] stringA = sumaString.split("");
           
            for (String stringA1 : stringA) {
                long digito = Long.parseLong(stringA1);
                if (digito % 2 != 0) {
                    esReversible = true;
                } else {
                    esReversible = false;
                    break;
                }
            }
           
            if (esReversible) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
              }catch(Exception e){
            }

    }

    public long revertir(long num) {
        String rnum = "";                   
            String n = "" + num;
            String[] nn = n.split("");
            for (int i = nn.length - 1; i >= 0; i--) {
                rnum += nn[i];
            }                
         return Long.parseLong(rnum);
    }
}

//import java.util.Scanner;
//
//
//public class NumerosReversibles {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long aux=0;
//        
//        while ( (aux = sc.nextLong() ) != 0){
//            comp(aux);
//        }        
//    }
//    
//    public static void comp(long aux ){
//        long reversible = revertir(aux);
//        long suma= reversible + aux;
//        boolean esReversible = false;
//        String sumaString = ""+suma;
//        String[] stringA = sumaString.split("");
//        for(int i = 0 ; i<stringA.length;i++){
//            long digito = Long.parseLong(stringA[i]);
//            if(digito%2!=0){
//                esReversible = true;
//            }else{
//                esReversible = false;
//                break;
//            }
//        }
//        if(esReversible){
//            System.out.println("SI");
//        }else{
//            System.out.println("NO");
//        }
//    }
//    
//    public static long revertir(long num){
//        String rnum = "";
//        String n = ""+num;
//        String[] nn = n.split("");
//        for(int i = nn.length-1 ; i >= 0 ;i--){
//            rnum += nn[i];
//        }
//        return Long.parseLong(rnum);
//    }
//}
