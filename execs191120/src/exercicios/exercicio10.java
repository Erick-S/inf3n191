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

//Exercício
//A Globo lhe contratou para desenvolver o novo sistema dela de placar digital
//que deverá funcionar da seguinte forma. O usuário irá entrar com as 
//informações dos dois times como nome e número de gols daquela partida. Ao
//final, o programa deverá dizer quem fora o vencedor 
public class exercicio10 {
    
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        int golsTimeA, golsTimeB;
        
        System.out.print("Inserir o número de gols do time A: ");
        golsTimeA = r.nextInt();
        
        System.out.print("Inserir o número de gols do time B: ");
        golsTimeB = r.nextInt();
        
        if(golsTimeA > golsTimeB){
            System.out.print("Time A é o vencedor!");
        }else if(golsTimeA < golsTimeB){
            System.out.print("Time B é o vencedor!");
        }else{
            System.out.print("Ambos times empataram!");
        }
        
    }
    
}
