/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick-S
 */

public class execsMethods {
    
    /**Simple input box that validates user input to be numeric (0-9)
     * @param request String that is inserted in the dialog of the input box
     * @var dialog Message to be shown in the dialog box
     * @var input String to be parsed as an int
     * @var result number to be parsed from a String input
     * @return Integer value inputed by the user in the dialog
     */
    /*
     * Bugs:
     * Cancelling or closing the dialog does not stop the algorithm
     * TODO: Handle cancel/close actions
     */
    protected static int intInputBox(String request){
        // Create a dialog that request the user to input the value of %VARIABLE%
        String dialog = String.format("Insira o valor de %s:", request);
        //input is a string that the user inputs
        String input = JOptionPane.showInputDialog(dialog);
        // Number to be returned
        Integer result = null;
        // Tries to validate the input in a do-while
        boolean notValidated = true;
        
        try{
            do{
                // If input is null, empty string or does not match numerals,
                // shows another input box
                if(input == null || input.isEmpty() || !input.matches("[0-9]*")){
                    input = JOptionPane.showInputDialog("Valor numérico inteiro somente");
                }else{
                    result = Integer.parseInt(input);
                    notValidated = false;
                }
            }while(notValidated);
        }catch(NumberFormatException error){
            // In case of real error/exception
            JOptionPane.showMessageDialog(null, error);
        }
        
        //return input as an Integer
        return result;
    }
    
    /**Simple input box that validates user input to be a BigDecimal value
     * @param request String that is inserted in the dialog of the input box
     * @var dialog Message to be shown in the dialog box
     * @var input String to be parsed as an BigDecimal
     * @var result number to be parsed from a String input
     * @return BigDecimal value inputed by the user in the dialog
     */
    /*
     * Bugs:
     * Cancelling or closing the dialog does not stop the algorithm
     * TODO: Handle cancel/close actions
     */
    protected static BigDecimal decimalInputBox(String request){
        // Create a dialog that request the user to input the value of %VARIABLE%
        String dialog = String.format("Insira o valor de %s:", request);
        //input is a string that the user inputs
        String input = JOptionPane.showInputDialog(dialog);
        // Number to be returned
        BigDecimal result = null;
        // Tries to validate the input in a do-while
        boolean notValidated = true;
        
        try{
            do{
                // If input is null, empty string or does not match numerals,
                // shows another input box
                // Regex matches numerical values with commas or dots in between,
                // Examples: 0,00 OR 0.00 OR 0.00,00 OR 0,00.00 and similar values
                if(input == null || input.isEmpty() || !input.matches("[0-9]{1,4}([.][0-9]{1,2})?")){
                    input = JOptionPane.showInputDialog("Valor numérico somente (Decimal separado por '.'");
                }else{
                    result = new BigDecimal(input);
                    notValidated = false;
                }
            }while(notValidated);
        }catch(NumberFormatException error){
            // In case of real error/exception
            JOptionPane.showMessageDialog(null, error);
        }
        
        //return input as an Integer
        return result;
    }
    
    protected static String stringInputBox(String request){
        // Create a dialog that request the user to input the value of %VARIABLE%
        String dialog = String.format("Insira o valor de %s:", request);
        //input is a string that the user inputs
        String input = JOptionPane.showInputDialog(dialog);
        return input;
    }
    
    /**Receives an array of numbers and compares the number of times it is equal
     * to others in the same array.
     * @param numbers Array of integers to be compared
     * @var n int that is incremented for each equal number in numbers
     * @var previous Array of Integers to prevent repeated comparisons
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
