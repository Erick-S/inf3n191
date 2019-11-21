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
//Você deverá criar um programa que dirá se um número é par ou ímpar 
public class exercicio04 {
    
    public static void main(String[] args){
        
        int valor;
        valor = execsMethods.intInputBox("Valor");
        String result;
        if(valor%2==0){
            result = String.format("O valor %d é par", valor);
        }else{
            result = String.format("O valor %d é ímpar", valor);
        }      
        JOptionPane.showMessageDialog(null, result);
        
    }
    
}
