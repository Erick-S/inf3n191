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

/*
 * Grades must not exceed 100!
 * Should median be < 60, subject failed, else approved
 */

//deste aluno.
public class exercicio02 {
    
    public static void main(String[] args){
        
        int grade1, grade2, grade3;
        
        grade1 = 101;
        grade2 = 101;
        grade3 = 101;
        
        boolean validation = false;
        
        do{
            
            if(!validation){
                JOptionPane.showMessageDialog(null, "Notas não podem exceder o valor de 100");
            }
            
            if(grade1>100){
                grade1 = execsMethods.intInputBox("Nota 1 (MÁX: 100)");
            }
            
            if(grade2>100){
                grade2 = execsMethods.intInputBox("Nota 2 (MÁX: 100)");
            }
            
            if(grade3>100){
                grade3 = execsMethods.intInputBox("Nota 3 (MÁX: 100)");
            }
            
            if(grade1 <= 100 && grade2 <= 100 && grade3 <= 100){
                validation = true;
            }
            
        }while(!validation);
        
        int median = (grade1+grade2+grade3)/3;
        
        String result;
        
        if(median >= 60){
            result = String.format("Aprovado com média: %d", median);
        }else{
            result = String.format("Reprovado com média: %d", median);
        }
        
        JOptionPane.showMessageDialog(null, result);
        
    }

}
