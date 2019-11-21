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
//Faça um programa que receba 3 valores que representarão os lados de um 
//triângulo e verifique se os valores formam um triângulo e classifique esse 
//triângulo como:
/*
 *   eqüilátero (3 lados iguais);
 *   isósceles (2 lados iguais);
 *   escaleno (3 lados diferentes).
 */
//Lembre-se que para formar um triângulo:
/*
 *  nenhum dos lados pode ser igual a zero;
 *  um lado não pode ser maior do que a soma dos outros dois;
 */
public class exercicio08{
    
    public static void main(String[] args){
        
        int lado1, lado2, lado3;
        Scanner r = new Scanner(System.in);
        
        System.out.print("O valor do lado 1 é: ");
        lado1 = r.nextInt();
        
        System.out.print("O valor do lado 2 é: ");
        lado2 = r.nextInt();
        
        System.out.print("O valor do lado 3 é: ");
        lado3 = r.nextInt();
        
        //TODO conditional logic
        
    }
    
}
