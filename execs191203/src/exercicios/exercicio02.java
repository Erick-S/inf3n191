
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Erick-S
 */
public class exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int multiplicador;
        Scanner r = new Scanner(System.in);
        
        System.out.print("Tabela multiplicativa do número: ");
        multiplicador = r.nextInt();
        
        for(int i = 1; i <= 10; i++){
            int resultado = i*multiplicador;
            System.out.printf("%d * %d = %d\n", i, multiplicador, resultado);
        }
        
    }
    
}