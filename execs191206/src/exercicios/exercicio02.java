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
public class exercicio02 {
    
    // Ler dois números e informar se a soma é maior que 100
    public static void main(String[] args){
        
        int valorA, valorB;
        
        Scanner r = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        valorA = r.nextInt();
        
        System.out.print("Digite o valor de B: ");
        valorB = r.nextInt();
        
        if((valorA+valorB) > 100){
            System.out.printf(
                    "[A + B] é maior que 100: [%d]\n",
                    valorA+valorB
            );
        }else{
            System.out.printf(
                    "[A + B] não é maior que 100: [%d]\n",
                    valorA+valorB
            );
        }
        
    }
    
}
