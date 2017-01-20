/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P232.NoCumpleanos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoCumpleanos {
    public static void main(String[] args) throws IOException {
        String c ="0 0 0 0 0 0",a="";
        int[] calendar = {31,28,31,30,31,30,31,31,30,31,30,31};
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while ( ( a = bf.readLine()).compareTo(c) != 0 ){
            String[] fechas = a.split(" ");
            comp(fechas,calendar);
        } 
    }
    
    public static void comp(String[] fechas,int[] cal){
        if(Integer.parseInt(fechas[0]) != Integer.parseInt(fechas[3]) && 
                Integer.parseInt(fechas[1]) != Integer.parseInt(fechas[4]) ){
            System.out.println(calDias(fechas, cal));
        }else{
            System.out.println(""+0); 
        }
    }
    
    public static int calDias(String[] fechas, int[] calendar){
        int total = 0;
        
        //Transcurrido año nacimiento
        total += calendar[Integer.parseInt(fechas[1])-1]- Integer.parseInt(fechas[0]);        
        for (int i = Integer.parseInt(fechas[1]); i < 12; i++) {
            total += calendar[i];
        }
        
        //Trancurrido año actual
        total += Integer.parseInt(fechas[3]);
        for (int i = Integer.parseInt(fechas[4])-1; i < 12; i++) {
            total += calendar[i-1];
        }
        
        //Trancurrido entre medio
        total +=(Integer.parseInt(fechas[5]) - Integer.parseInt(fechas[2]) -1)*364;
        
        return total;
    }     
}
