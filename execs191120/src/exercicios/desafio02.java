/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Random;

/**
 *
 * @author Erick-S
 */

// Should receive a (random) value between 1 and 6 and generate a char[3][3]
// array with the faces of a die
// TODO: function to print something based on the die and value, and not
// fixed values?
public class desafio02 {
    
    /*
    
     * Dice faces, where ' is null:
    
     * 1
    
        [ ' ' ' ]
        [ ' X ' ]
        [ ' ' ' ]
    
     * 2
    
        [ X ' ' ]
        [ ' ' ' ]
        [ ' ' X ]
    
     * 3
    
        [ X ' ' ]
        [ ' X ' ]
        [ ' ' X ]
    
     * 4
    
        [ X ' X ]
        [ ' ' ' ]
        [ X ' X ]
    
     * 5
    
        [ X ' X ]
        [ ' X ' ]
        [ X ' X ]
    
     * 6
    
        [ X ' X ]
        [ X ' X ]
        [ X ' X ]
    
     */
    
    public static void main(String args[]){
        
        // values from {0...5}+1, so {1...6}
        int randomValue = new Random().nextInt(6)+1;
        char[][] die = new char[3][3];
        
        // Creates an empty die
        for(int row = 0; row < die.length; row++){
            for(int column = 0; column < die[row].length; column++){
                die[row][column] = ' ';
            }
        }
        
        //DEBUG
        randomValue = 6;
        
        switch(randomValue){
            default: 
                System.out.print("An error ocurred! Invalid value!\n");
                break;
            case 1:
                die[1][1] = 'X';
                break;
            case 2:
                die[0][0] = 'X';
                die[2][2] = 'X';
                break;
            case 3:
                die[0][0] = 'X';
                die[1][1] = 'X';
                die[2][2] = 'X';
                break;
            case 4:
                die[0][0] = 'X';
                die[2][0] = 'X';
                die[0][2] = 'X';
                die[2][2] = 'X';
                break;
            case 5:
                die[0][0] = 'X';
                die[2][0] = 'X';
                die[1][1] = 'X';
                die[0][2] = 'X';
                die[2][2] = 'X';
                break;
            case 6:
                die[0][0] = 'X';
                die[1][0] = 'X';
                die[2][0] = 'X';
                die[0][2] = 'X';
                die[1][2] = 'X';
                die[2][2] = 'X';
                break;
        }
        
        System.out.printf("The random value is: %d\nThe die:\n", randomValue);
        
        // Prints the array
        for(char[] row : die){
            System.out.print("[");
            for(int column = 0;column < row.length; column++){
                System.out.print(" "+row[column]);
            }
            System.out.println(" ]");
        }
        
    }
    
}
