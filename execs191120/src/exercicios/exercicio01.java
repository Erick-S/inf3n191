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
//Faça um programa que receba 2 valores e retorne o maior entre eles. 
public class exercicio01 {
    
    public static void main(String[] args){
        int value1, value2;
        value1 = execsMethods.intInputBox("Valor 1");
        value2 = execsMethods.intInputBox("Valor 2");
        String result = String.format("O resultado é: \"%d\"", value1+value2);
        JOptionPane.showMessageDialog(null, result);
    }
}
