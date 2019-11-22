/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Erick-S
 */

//Exercício
//Faça um programa que receba 4 valores e retorne o menor entre eles 
public class exercicio03 {
    
    public static void main(String[] args){
        int valor1, valor2, valor3, valor4; // Might change to a variable size int array?
        int menor; // the smallest value
        int forRuns = 0; // number of runs in the for loop
        int repetidos = 1; // # of repeated "smallest" values
        valor1 = execsMethods.intInputBox("Valor 1");
        valor2 = execsMethods.intInputBox("Valor 2");
        valor3 = execsMethods.intInputBox("Valor 3");
        valor4 = execsMethods.intInputBox("Valor 4");
        
        int[] valores = {valor1, valor2, valor3, valor4};
        menor = valores[0];
        for(int l = 0; l < valores.length; l++){
            if(valores[l]<menor){
                menor = valores[l];
            }
            if(valores[l] == menor && forRuns > 0){
                repetidos++;
            }
            forRuns++;
        }
        
        if(repetidos>1){
            String error = String.format("Há ao %d valores %d iguais! não há UM valor menor", repetidos, menor);
            JOptionPane.showMessageDialog(null, error);
        }else{
            String result = String.format("O resultado é: %d", menor);
            JOptionPane.showMessageDialog(null, result);
        }
        
    }
    
}