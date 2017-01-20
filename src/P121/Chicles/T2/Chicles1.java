package P121.Chicles.T2;
import java.util.Scanner;

public class Chicles1 {

    public static void main(String args[]) {
        Chicles1 oc = new Chicles1();
        oc.entradaDatos();
    }

    public void entradaDatos() {
        String entrada;
        Scanner scn = new Scanner(System.in);
        do{
            entrada = scn.nextLine();                      
            this.operador(entrada);
        }while (!entrada.equals("0 0 0"));             
    }

    public void operador(String linea){
        String u[] = linea.split(" ");
        try{
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
        }catch(NumberFormatException e){
            System.out.println("Formato Incorrecto");
        }
        
    }

}
