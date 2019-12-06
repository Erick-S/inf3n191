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
public class exercicio09 {
    
    //Faça um algoritmo que realize uma contagem regressiva começando em n;
    
    
    
    
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        
        System.out.print("Insira o valor inicial da ordem decrescente: ");
        int valor = r.nextInt();
        
        System.out.println("Contagem regressiva: ");
        
        // Simple with while loop
//        while(valor >= 0){
//            System.out.println(valor);
//            valor--;
//        }

        // Simple for loop
//        for(int i = valor; valor >=0; valor--){
//            System.out.print(i);
//        }

        // Informative loop with for
        // while valor is greater or equal than zero, print its value along with
        // the number of the count, increments the counter and decrements its
        // value
        for(int i = 1; valor >= 0; i++, valor--){
            
            System.out.printf(
                    "Contagem %d: [ %d ]\n",
                    i,
                    valor
            );
            
        }
        
    }
    
}
