/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

//import java.util.Scanner;

/**
 *
 * @author Erick-S
 */

// 'Copy' of exercicio02
// transformed in a method and then moved to exercicio02

public class exercicio0202 {
    
    public static int[] tabuada(int mult){
        
//        Scanner r = new Scanner(System.in);
        
//        System.out.print("Insira o valor do multiplicador: ");
//        int mult = r.nextInt();
//        
//        System.out.printf("\n\nTabela multiplicativa de %d\n\n", mult);
        
        int[] results = new int[11]; // tabuada é de 0...10, portanto 11 números

        for(int i = 0; i <= 10; i++){
//            int result = i*mult;
//            System.out.printf("%d * %d = %d\n",
//                    i,
//                    mult,
//                    result
//            );
            results[i] = i*mult;
        }
        
        return results;
        
    }
    
}
