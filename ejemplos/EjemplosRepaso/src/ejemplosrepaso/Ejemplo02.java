/*
 *  Las entradas son: ciudad Loja, pais Ecuador
    La salida del programa debe ser así:
    
    Loja, situada en el sur del país:
    
        ECUADOR.
 */
package ejemplosrepaso;

import java.util.Scanner;


public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String ciudad;
       
    
        String pais;
        
                
        System.out.println();
        pais = entrada.nextLine();
        System.out.println();
        ciudad = entrada.nextLine();
       
        System.out.printf("%s,  situada en el sur del pais:\n\n\t%s\n", 
                ciudad, pais);
                
    }
    
}
