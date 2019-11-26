/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick-S
 */

public class execsMethods {
    
    /**Simple input box that validates user input to be numeric (0-9)
     * @param request String that is inserted in the dialog of the input box 
     * @return Integer value inputed by the user in the dialog
     */
    /*
     * Bugs:
     * "Ok"ing the dialog as it returns with a predefined value of "Valor numérico somente" throws an error;
     * Canceling the dialog returns an input value of null and throws an error.
     */
    protected static int intInputBox(String request){
        // Create a dialog that request the user to input the value of %VARIABLE%
        String dialog = String.format("Insira o valor de %s:", request);
        //input is a string that the user inputs
        String input = JOptionPane.showInputDialog(dialog);
        //if condition: Validates if input is not null, empty or not numeric
        boolean validate = false;
        if(input == null || input.isEmpty() || !input.matches("[0-9]*")){
            input = JOptionPane.showInputDialog(dialog, "Valor numérico somente");
        }
        //return input as an Integer
        return Integer.parseInt(input);
    }
    
    /* Receives an array of numbers and compares the number of times it is equal
     * to others in the same array.
     * @param numbers Array of integers to be compared
     * @param n int that is incremented for each equal number in numbers
     * @param previous Array of Integers to prevent repeated comparisons
     * @return int value of the count of equal numbers in the array
     */
    protected static int countNumberEquals(int[] numbers){
        
        // Variables to be used in the comparisons and count
        int n = 0;
        ArrayList<Integer> previous = new ArrayList<>();
        
        // Iterates between the lenght of the array to be compared
        for(int l1 = 0; l1 < numbers.length; l1++){
            // Iteration to compare the array to itself
            for(int l2 = 0; l2 < numbers.length; l2++){
                // Condition so the same position won't be compared to itself
                if(l1 != l2){
                    // Condition so a number that was previously compared won't be
                    // compared again.
                    if(!previous.contains(l2)){
                        // Condition that affirms the numbers are equal
                        if(numbers[l1] == numbers[l2]){
                            // If the numbers are equal, increment the counter.
                            n++;
                        }
                    }
                }
            }
            // Adds the position to the previous array.
            previous.add(l1);
        }
        // Return the count
        return n;
    }
    
}
