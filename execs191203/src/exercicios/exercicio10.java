/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick-S
 */
public class exercicio10 {
    
    /**
     * Escrever um algoritmo que receba n quilometragens que me retorne os dois
     * caminhos mais próximos.
     */
    
    // @todo
    
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de caminhos: ");
        int quantidade = r.nextInt();
        
        int[] quilometragens = new int[quantidade];
        
        for(int i = 0; i < quantidade; i++){
            
            quilometragens[i] = r.nextInt();
            
        }
        
    }
    
}
