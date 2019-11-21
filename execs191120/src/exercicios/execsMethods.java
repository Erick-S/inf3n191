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
    
}
