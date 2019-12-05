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
public class desafio01 {
    
    /*
     * Print the followin pattern:
     *  [ 1 2 3 4 5 6 ]
     *  [ 1 . . . . . ]
     *  [ . 2 . . . . ]
     *  [ . . 3 . . . ]
     *  [ . . . 4 . . ]
     *  [ . . . . 5 . ]
     *  [ 1 2 3 4 5 6 ]
     */
    
    public static void main(String[] args){
        
        char[][] pattern = new char[7][6];
        //                         [r][c]
        // This pattern works best with c = r-1
        // As it gets the value of the chars, it will not print 10+ or negatives
        
        for(int row = 0; row < pattern.length; row++){
            
            for(int column = 0; column < pattern[row].length; column++){
                
                // if is the first or last row, print from 1...
                if(row == 0 || row == pattern[row].length){
                    // "If the digit is less than 10, then '0' + digit is 
                    // returned. Otherwise, the value 'a' + digit - 10 is 
                    // returned."
                    pattern[row][column] = Character.forDigit(column+1, 10);
                // From the second to second to last row, print from 1... to
                // row.length - 1
                }else if(column == row-1){
                    pattern[row][column] = Character.forDigit(column+1, 10);
                // else prints dot to fill empty spaces in the char pattern
                }else{
                    pattern[row][column] = '.';
                }
                
            }
            
        }
        
        System.out.println("\nLeft-to-right pattern\n=====================\n");
        
        // Prints the array
        for(char[] row : pattern){
            System.out.print("[");
            for(int column = 0;column < row.length; column++){
                System.out.print(" "+row[column]);
            }
            System.out.println(" ]");
        }
        
        System.out.println("\nRight-to-left pattern\n=====================\n");
        
        // TEST: Reversed patter
        for(int row = 0; row < pattern.length; row++){
            
            for(int column = 0; column < pattern[row].length; column++){
                
                // if is the first or last row, print from 1...
                if(row == 0 || row == pattern[row].length){
                    // "If the digit is less than 10, then '0' + digit is 
                    // returned. Otherwise, the value 'a' + digit - 10 is 
                    // returned."
                    pattern[row][column] = Character.forDigit(column+1, 10);
                // From the second to second to last row, print from 1... to
                // row.length - 1
                }else if(column == pattern[row].length-row){
                    pattern[row][column] = Character.forDigit(column+1, 10);
                // else prints dot to fill empty spaces in the char pattern
                }else{
                    pattern[row][column] = '.';
                }
                
            }
            
        }
        
        // Prints the array
        for(char[] row : pattern){
            System.out.print("[");
            for(int column = 0;column < row.length; column++){
                System.out.print(" "+row[column]);
            }
            System.out.println(" ]");
        }
        
    }
    
}
