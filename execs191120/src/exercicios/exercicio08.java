/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;

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
    
    private static boolean contains(final int[] array, final int value){
        
        boolean test = false;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                test = true;
            }
        }
        
        return test;
        
    }
    
    public static void main(String[] args){
        
        int[] lados = {0,0,0};
        
        boolean validation = false;
        
        // if a+b > c || a+c > b || b+c > a
        
        // if lados contains 0
        
        do{
            lados[0] = execsMethods.intInputBox("lado 1");
            lados[1] = execsMethods.intInputBox("lado 2");
            lados[2] = execsMethods.intInputBox("lado 3");
            
            // If condition only to show the error dialog
            if(contains(lados, 0)){
                validation = false;
                JOptionPane.showMessageDialog(null, "Erro: Um dos lados é zero!");
            }else{
                validation = true;
            }
            
            // A condition for a triangle to be a triangle is that the sum of two
            // of its sides must be greater than the third side.
            // Should the third side be larger, it is not a triangle.
            // There 'could' be a triangle where sides a and b are equal to side c,
            // thus resulting in an area zero triangle.
            
            // The condition for a triangle to be a triangle is:
            // a+b > c || a+c > b || b+c > a
            // simplified as
            // absolute(a - b) < c < a + b
            // simplified as
            // max(a,b,c) < a+b+c - max(a,b,c)
            // simplified as
            // 2*max(a,b,c) < a+b+c
            
            // As we are considering that a triangle can have area of 0, we compare
            // with a '<=' instead of a '<'
            int ladosMax = Arrays.stream(lados).max().getAsInt();
            int ladosSum = Arrays.stream(lados).sum();
            if((2*ladosMax)<=ladosSum){
                validation = true;
            }else{
                validation = false;
                JOptionPane.showMessageDialog(null, "Erro: Este não é um triângulo");
            }
            
        }while(!validation);
        
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
        
        String resultado = String.format("O triângulo é: %s\n", triangle);
        
        JOptionPane.showMessageDialog(null, resultado);
        
    }
    
}
