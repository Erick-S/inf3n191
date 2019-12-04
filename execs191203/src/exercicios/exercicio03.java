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
public class exercicio03 {
    
    public static void main(String args[]){
        
        // receive n values and calculate their mean value
        
        float mean = 0;
        
        Scanner r = new Scanner(System.in);
        
        System.out.print("A quantidade de números é: ");
        int quantity = r.nextInt();
        
        for(int i = 1; i <= quantity; i++){
            System.out.printf("Insira o valor do número %d: ", i);
            mean += r.nextInt();
        }
        
        System.out.printf("A média é: %f\n", mean/quantity);
        
    }
    
}