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
//Faça um algoritmo que leia as 3 notas de um aluno e calcule a média final 
//deste aluno.
public class exercicio02 {
    
    public static void main(String[] args){
        
        int grade1, grade2, grade3;
        grade1 = execsMethods.intInputBox("Nota 1");
        grade2 = execsMethods.intInputBox("Nota 2");
        grade3 = execsMethods.intInputBox("Nota 3");
        int median = (grade1+grade2+grade3)/3;
        String result = String.format("O resultado é: %d", median);
        JOptionPane.showMessageDialog(null, result);
        
    }

}
