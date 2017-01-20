package P300.PalabrasPentavolicas;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalabrasPentavolicas {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numeroEntrada = Integer.parseInt(bf.readLine());
        while (numeroEntrada > 0) {
            String linea = bf.readLine();
            if (linea.indexOf("a") != -1 ) {
                if (linea.indexOf("e") != -1) {
                    if (linea.indexOf("i") != -1) {
                        if(linea.indexOf("o") != -1){
                            if(linea.indexOf("u") != -1){
                                System.out.println("SI");
                            }else{
                                System.out.println("NO");
                            }
                        }else{
                            System.out.println("NO");
                        }
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }

            } else {
                System.out.println("NO");
            }
            numeroEntrada--;
        }
    }
    
    static void search(String letra){
        
    }
}
