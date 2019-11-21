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
//Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um 
//algoritmo para ler o preço do litro da gasolina e o valor do pagamento, e 
//exibir quantos litros ele conseguiu colocar no tanque 

// ACHTUNG! => Exercícios a partir deste (Exercício 07) não utilizarão 
// javax.swing panels por ocupar maior parte do tempo lendo sua documentação...
public class exercicio07 {
    public static void main(String[] args){
        float dinheiro, valorLitro;
        Scanner r = new Scanner(System.in);
        
        System.out.println("O separador de decimal é ','. Exemplo: 100,50");
        
        System.out.print("A quantidade de dinheiro que o motorista possui é: ");
        dinheiro = r.nextFloat();
        
        System.out.print("O valor (da gasolina) por litro é: ");
        valorLitro = r.nextFloat();
        
        float tanqueAbastecido = dinheiro/valorLitro;
        System.out.printf("A quantidade em litros abastecida é: %f Litros", tanqueAbastecido);
    }
}
