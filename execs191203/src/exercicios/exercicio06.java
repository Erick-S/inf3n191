/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Erick-S
 */
public class exercicio06 {
    
    /*
     * Loops for n times, them adds 3 values each time
     */
    
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        
        // Quantidade de somas
        System.out.print("A quantidade de somas é: ");
        int q = r.nextInt();
        
        for(int i = 1; i <= q; i++){
            
            // Quebra de linha
            System.out.println("=====");
            
            // Valores a serem somados
            int a, b, c;
            
            // Se i == 1, por exemplo:
            // "Insira o valor de A01: "
            // pois a mascara %02d é ao menos 2 zeros e um número.
            // se i == 2, %02d é 02
            // se i == 10, %02d é 10
            // se i == 100, %02d é 100
            // ...
            System.out.printf("Insira o valor de A%02d: ", i);
            a = r.nextInt();
            
            System.out.printf("Insira o valor de B%02d: ", i);
            b = r.nextInt();
            
            System.out.printf("Insira o valor de C%02d: ", i);
            c = r.nextInt();
            
            System.out.printf("A soma %02d é: %d\n", i, (a+b+c));
            
        }
        
    }
    
}
