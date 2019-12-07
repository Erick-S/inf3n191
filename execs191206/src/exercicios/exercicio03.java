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
public class exercicio03{
    
    // Criar um algoritmo usando for que conte até 1000
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        
        System.out.print("Insira o valor máximo a ser exibido: ");
        int max = r.nextInt();
        
        for(int i = 0; i <= max; i++){
            System.out.println(i);
        }
        
    }
    
}