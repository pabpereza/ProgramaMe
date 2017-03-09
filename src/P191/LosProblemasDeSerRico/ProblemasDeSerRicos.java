/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P191.LosProblemasDeSerRico;

import java.util.Scanner;

/**
 *
 * @author striker
 */
public class ProblemasDeSerRicos {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int numCasos = entrada.nextInt();

        for (int i = 0; i < numCasos; i++) {
            calcular();
        }

    }

    static void calcular() {

        int numCompartimentos = entrada.nextInt();
        int litrosMayor = entrada.nextInt();
        int diferenciaLitros = entrada.nextInt();

        int total = litrosMayor;

        for (int i = 1; i < numCompartimentos; i++) {
            total += litrosMayor - diferenciaLitros * i;
        }

        System.out.println(total);
    }

}
