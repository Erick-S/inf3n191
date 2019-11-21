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
//Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir 
//quantos dias de vida ela possui. Considere sempre anos completos, e que 
//um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida;
//veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS
public class exercicio05 {
    
    public static void main(String[] args){
        
        String nome;
        int idade;
        nome = JOptionPane.showInputDialog("Seu nome é: ");
        idade = execsMethods.intInputBox("Idade")*365;
        String result = String.format("%s, sua idade em dias é aproximadamente: %d dias.", nome, idade);
        JOptionPane.showMessageDialog(null, result);
    }
    
}
