package exercicios;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick-S
 */
public class exercicio01 {
    
    public static void teste(int... a){}

    // Ler dois números e exibir o menor valor
    public static void main(String[] args){
        
        int valorA, valorB;
        
        Scanner r = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        valorA = r.nextInt();
        
        System.out.print("Digite o valor de A: ");
        valorB = r.nextInt();
        
        if(valorA > valorB){
            System.out.printf("O valor B [%d] é menor\n", valorB);
        }else{
            System.out.printf("O valor A [%d] é menor\n", valorA);
        }
        
    }
    
}
