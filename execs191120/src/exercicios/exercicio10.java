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
//A Globo lhe contratou para desenvolver o novo sistema dela de placar digital
//que deverá funcionar da seguinte forma. O usuário irá entrar com as 
//informações dos dois times como nome e número de gols daquela partida. Ao
//final, o programa deverá dizer quem fora o vencedor 
public class exercicio10 {
    
    public static void main(String[] args){
        
        int golsTimeA, golsTimeB;
        String result = "Ambos times empataram!";
        
        golsTimeA = execsMethods.intInputBox("gols do time A");
        
        golsTimeB = execsMethods.intInputBox("gols do time B");
        
        if(golsTimeA > golsTimeB){
            result = ("Time A é o vencedor!");
        }else if(golsTimeA < golsTimeB){
            result = ("Time B é o vencedor!");
        }
        
        JOptionPane.showMessageDialog(null, result);
        
    }
    
}
