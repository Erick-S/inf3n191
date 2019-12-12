/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Erick-S
 */
public class exercicio01 {

    static void println(String texto){
        
        System.out.println(texto);
        
    }
    
    // Showing the while loop basics.
    public static void main(String[] args){
        
        // O laço while do programa irá executar enquanto run for verdadeiro
        boolean run = true;
        
        // Valor a ser utilizado na iteração do laço
        int counter = 0;
        
        // Conforme informado anteriormente, irá executar enquanto run == true
        while(run){
            counter++;
            println(String.valueOf(counter));
            
            if(counter > 100){
                run = false;
            }
            
        }
        
    }
    
}