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
        
        int[] lados = {0,0,0};
        Scanner r = new Scanner(System.in);
        
        System.out.print("O valor do lado 1 é: ");
        lados[0] = r.nextInt();
        
        System.out.print("O valor do lado 2 é: ");
        lados[1] = r.nextInt();
        
        System.out.print("O valor do lado 3 é: ");
        lados[2] = r.nextInt();
        
        // if a == b == c print equilatero
        
        // if a == b != c || a == c != b || b == c != a print isosceles
        
        // if a != b != c print escaleno
        
        // With loop comparison, could check as:
        
        // if equals == 3 print equilatero
        
        // if equals == 2 print isosceles
        
        // if equals < 1 print escaleno
        
        /* For loop that compares the values indicated:
         * populates array1 with the values, array2 contains the same values;
         * compares array1[n] with array2 values;
         * if array1[n] == array2, a counter increases.
         * !PROBLEM! comparing this way can lead to repeated comparisons:
         * !SOLUTION 1!: if array1[n1] and array2[n1], it will not compare:
         * Example: array1[0] wont compare with array2[0].
         * !SOLUTION 1! !PROBLEM!: different comparisons will also repeat:
         * Example: (array1[0] array2[1]) && (array1[1] && array2[0]);
         * !SOLUTION 2!: create an array that will add the values 'n' of
         * array1[n] as it is compared, thus excluding repeated comparisons.
         */
        
        // Iterates between the 'lados' array and returns count of equal values
        int count = execsMethods.countNumberEquals(lados);
        
        // String that will receive the value of the type of triangle
        String triangle;
        
        switch(count){
            // If count equals zero, no values in the array are equal.
            case 0:
                triangle = "escaleno";
                break;
            // If count equals 1, at least two values are equal
            case 1:
                triangle = "isóceles";
                break;
            // If count equals 3, all 3 values are equal
            case 3:
                triangle = "equilátero";
                break;
            // Defaults to an error string.
            default:
                triangle = "INVÁLIDO?";
                break;
        }
        
        System.out.printf("O triângulo é: %s\n", triangle);
        
    }
    
}
