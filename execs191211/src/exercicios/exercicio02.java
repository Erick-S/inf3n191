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
public class exercicio02{
    
    /*
    * Escrever um algoritmo que faça a média de N valores.
    * 
    * O funcionamento do algoritmo deve seguir esta lógica:
    *   1. Solicitar do usuário o número;
    *   1. Guardar este número;
    *   1. Quando o usuário escrever o dígito '0', o algoritmo deve retornar a 
    *      média dos valores digitados.
    */
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        
        // Valor da média e da quantidade de valores
        int mean = 0;
        int valuesSize = 0;
        
        // Variável de controle para laço for
        boolean run = true;
        
        // Aviso informativo para o usuário
        m.println(
                "O programa irá receber números enquanto não for inserido o\n"
              + "valor '0', que irá parar o programa e mostrar a média dos\n"
              + "valores inseridos até o momento." 
        );
        
        while(run){
            
            // Pede para o usuário informar um valor, enquanto ele não for 0
            int value;
            m.printf("Escreva o valor %d: ", valuesSize+1);
            value = r.nextInt();
            
            // Se o valor for 0, a variável de controle receberá o valor falso
            if(value == 0){
                run = false;
            
            // Caso for outro valor, adiciona o valor à media e aumenta a
            // quantidade de valores
            }else{
                mean += value;
                valuesSize++;
            }
            
        }
        
        // Cálculo da média
        mean /= valuesSize;
        
        // Informa a média e a quantidade de valores
        m.printf(
                "O valor da média dos %d números é: %d\n",
                valuesSize,
                mean
        );
        
    }
    
}
