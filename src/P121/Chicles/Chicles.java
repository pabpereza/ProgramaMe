package P121.Chicles;

import java.util.ArrayList;
import java.util.Scanner;

public class Chicles {

    public static void main(String args[]) {
        Chicles oc = new Chicles();
        oc.entradaDatos();
    }

    ArrayList lineasEntrada;  

    public Chicles() {       
        lineasEntrada = new ArrayList();
    }

    public void entradaDatos() {
        String entrada;
        Scanner scn = new Scanner(System.in);
        do{
            entrada = scn.nextLine();           
            lineasEntrada.add(entrada);
        }while (!entrada.equals("0 0 0")); 
        int i = 0;
        while (i < lineasEntrada.size()-1) {
            this.operador(lineasEntrada.get(i).toString());
            i++;
        }
    }

    public void operador(String linea){
        String u[] = linea.split(" ");
        int cantidad = Integer.parseInt(u[2]),
                premioChicles = Integer.parseInt(u[1]),
                condicionEnvoltorios = Integer.parseInt(u[0]);
        int numerodeEnvoltorios = cantidad;
        int aux;

        if (condicionEnvoltorios < premioChicles) {
            System.out.println("RUINA");
        } else {
            while (numerodeEnvoltorios >= condicionEnvoltorios) {
                aux = numerodeEnvoltorios / condicionEnvoltorios;
                numerodeEnvoltorios = numerodeEnvoltorios % condicionEnvoltorios;
                cantidad += aux;
                numerodeEnvoltorios += aux;
            }
            System.out.println("" + cantidad + " " + numerodeEnvoltorios);
        }
    }

}
