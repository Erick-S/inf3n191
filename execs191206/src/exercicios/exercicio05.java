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
public class exercicio05{
    
    // Criar um algoritmo usando array, para armazenad o nome de 5 pessoas e
    // mostrar a 3ª pessoa na tela;
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        
        System.out.print("A quantidade de nomes a ser inserida é: ");
        int quantidade = r.nextInt();
        
        String[] nomes = new String[quantidade];
        
        for(int i = 0; i < nomes.length; i++){
            
            System.out.printf("Nome [%d]: ", i+1);
            nomes[i] = r.next();
            
        }
        
        System.out.print("Deseja recuperar o nome de qual pessoa? : ");
        int retorno = r.nextInt();
        
        System.out.printf(
                "O nome da pessoa [%d] é: %s\n",
                retorno,
                nomes[retorno-1]
        );
        
    }
    
}