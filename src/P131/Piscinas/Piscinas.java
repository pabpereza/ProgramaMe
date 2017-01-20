/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P131.Piscinas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Piscinas {
    public static void main(String[] args) throws IOException {
        Piscinas pc = new Piscinas();
        String[] aux;
        long[] valores;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while ((valores = pc.pasarLong(aux = (bf.readLine().split(" ")))) != null) {
            if (candado(valores)) {
                pc.comp(valores);
            }
        }
    }

    public void comp(long[] lineaSpliteada) {

        long viajesMios = 0;
        long viajesVecino = 0;
        if (lineaSpliteada[2] > lineaSpliteada[1]) {
            viajesMios = -1;
        } else {
            viajesMios = lineaSpliteada[0] / (lineaSpliteada[1] - lineaSpliteada[2]);
            if (lineaSpliteada[0] % (lineaSpliteada[1] - lineaSpliteada[2]) != 0) {
                viajesMios++;
            }
        }

        if (lineaSpliteada[5] > lineaSpliteada[4]) {
            viajesVecino = -1;
        } else {
            viajesVecino = lineaSpliteada[3] / (lineaSpliteada[4] - lineaSpliteada[5]);
            if (lineaSpliteada[3] % (lineaSpliteada[4] - lineaSpliteada[5]) != 0) {
                viajesVecino++;
            }
        }
        if (viajesMios == viajesVecino) {
            System.out.println("EMPATE " + viajesVecino);
        } else if (viajesMios > viajesVecino && viajesVecino != -1) {
            System.out.println("VECINO " + viajesVecino);
        } else {
            System.out.println("YO " + viajesMios);
        }
    }

    public long[] pasarLong(String[] valores) {
        long[] aux = new long[valores.length];
        for (int i = 0; i < valores.length; i++) {
            aux[i] = Long.parseLong(valores[i]);
        }
        if (aux[0] == 0 || aux[3] == 0) {
            return null;
        } else {
            return aux;
        }
    }
    
    public static boolean candado(long[] com){
        for (int i = 0; i < com.length; i++) {
            if(com[i]<0 || com[i]>10000000){
                return false;
            }  
        }
        return true;
    }

}
