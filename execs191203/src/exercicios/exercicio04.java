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
public class exercicio04 {
    
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de números a serem comparados: ");
        int quant = r.nextInt();

        int menor = 0,
            maior = 0;
        
        for(int i = 0; i < quant; i++){
            System.out.printf("Insira o valor do %d° número: ", i+1);
            int valor = r.nextInt();
            
            if(i == 0){
                maior = valor;
                menor = valor;
            }
            else{
                if(menor > valor){
                    menor = valor;
                }
                
                if(maior < valor){
                    maior = valor;
                }
            }
        }
        
        System.out.println("===============");
        System.out.printf("O menor valor é: %d\n", menor);
        System.out.println("===============");
        System.out.printf("O maior valor é: %d\n", maior);
        System.out.println("===============");
        
    }
    
}
