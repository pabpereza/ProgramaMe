
package P116.HolaMundo;
import java.util.Scanner;
public class P116HolaMundo1 {
    public static void main(String[] args) {
        int numeroSout, i = 0;
        Scanner entrada = new Scanner(System.in);
        numeroSout = entrada.nextInt();        
        while (i < numeroSout) {
            System.out.println("Hola mundo.");
            i ++;
        }
    }
}
