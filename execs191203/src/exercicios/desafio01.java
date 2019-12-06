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

// @todo mask the values so it will handle the pattern better. Example:
// should the maximum value displayed be 10, values should show like 01
// (to mimic the size of double digit values) and the empty spaces
// should be filed with something like ".." or " ." (Only if column is
// greater or equal than 10, handle differently for values like 100 ...)
// Example: 
// [ 10 100 1000 ]
// [ 01 ... 0002 ]
public class desafio01 {
    
    /*
     * Print the following pattern:
     *  [ 1 2 3 4 5 6 ]
     *  [ 1 . . . . . ]
     *  [ . 2 . . . . ]
     *  [ . . 3 . . . ]
     *  [ . . . 4 . . ]
     *  [ . . . . 5 . ]
     *  [ 1 2 3 4 5 6 ]
     */
    
    /**
     * 
     * Takes a bidimensional array and prints the specified pattern, but LTF
     * 
     * Receives a bidimensional array, preferably of size pattern[a][a-1] and
     * prints the patter from Left to Right
     * 
     * @param pattern bidimensional array to be filled
     * 
     * @return bidimensional array filled with the pattern, ready to be printed
     * 
     */
    static int[][] ltrPattern(int[][] pattern){
        
        for(int row = 0; row < pattern.length; row++){
            
            for(int column = 0; column < pattern[row].length; column++){
                
                // if is the first or last row, print from 1...
                if(row == 0 || row == pattern[row].length){
                    pattern[row][column] = column+1;
                // From the second to second to last row, print from 1... to
                // row.length - 1
                }else if(column == row-1){
                    pattern[row][column] = column+1;
                // else prints dot to fill empty spaces in the pattern
                }
                
            }
            
        }
        
        return pattern;
    
    }
    
    /**
     * 
     * Takes a bidimensional array and prints the specified pattern, but RTL
     * 
     * Receives a bidimensional array, preferably of size pattern[a][a-1] and
     * prints the patter from Right to Left
     * 
     * @param pattern bidimensional array to be filled
     * 
     * @return bidimensional array filled with the pattern, ready to be printed
     * 
     */
    static int[][] rtlPattern(int[][] pattern){
        
        for(int row = 0; row < pattern.length; row++){
            
            for(int column = 0; column < pattern[row].length; column++){
                
                // if is the first or last row, print from 1...
                if(row == 0 || row == pattern[row].length){
                    pattern[row][column] = column+1;
                // From the second to second to last row, print from 1... to
                // row.length - 1
                }else if(column == pattern[row].length-row){
                    pattern[row][column] = column+1;
                // else fill empty spaces
                }else{
                    pattern[row][column] = 0;
                }
                
            }
            
        }
        
        return pattern;

    }
    /**
     * Count the quantity of digits in a int value
     * 
     * @param v value to be counted
     * 
     * @return quantity of digits as a int
     * 
     */
    static int countDigits(int v){
        int count = 0;
        
        while(v > 0){
            count++;
            v /= 10;
        }
        
        return count;
    }
    
    /**
     * 
     * Prints a two dimensional pattern
     * 
     * Prints the patter wrapped in "[]" characters between rows and replaces
     * "0" values with dots according to the length of rows. Values also receive
     * leading zeroes accordingly.
     *
     * @param pattern 
     * 
     */
    static void printPattern(int[][] pattern){
        // The value of an empty (Value == 0) cell
        String empty = ".";
        
        // Prints the array
        for(int row = 0; row < pattern.length; row++){
            System.out.print("[");
            for(int column = 0;column < pattern[row].length; column++){
                if(pattern[row][column] == 0){
                    // If the value of the cell is 0, it is replaced by a
                    // quantity of periods depending on the size of the array
                    int count = countDigits(pattern.length);
                    
                    String pat = String.format(
                            " %0"+count+"d",0
                    ).replace(
                            "0", empty
                    );
                    
                    System.out.print(pat);
                }else{
                    // Pads the value to have leading zeros depending on the
                    // first value of a column. The value printed has the mask
                    // %0nd, where d = pattern[row][column] and n is the count
                    // of digits of the number on the first row of that column
                    String formattedInt = String.format(
                            "%0"+countDigits(pattern.length)+"d",
                            pattern[row][column]
                    );
//                    System.out.print(" "+pattern[row][column]);
                    System.out.print(" "+formattedInt);
                }
            }
            System.out.println(" ]");
        }
    }
    
    public static void main(String[] args){
        
        // The size of the pattern will be [rows][rows-1]
        // The numbers displayed also are rows-1, so it will ask for the number
        // of numbers displayed in the pattern, thus the pattern will be of size
        // [columns+1][columns]
        System.out.print("Insert the maximum value displayed in the pattern: ");
        Scanner r = new Scanner(System.in);
        int columns = r.nextInt();
        
        int[][] pattern = new int[columns+1][columns];
        
        System.out.print(
                "0 => Left to Right pattern"+
                "\n"+
                "1 => Right to Left pattern"+
                "\n"+
                "Insert desired pattern: "
        );
        int type = r.nextInt();
        
        switch(type){
            default:
                System.out.println("Invalid type!\nBreaking...\n");
                break;
            case 0:
                pattern = ltrPattern(pattern);
                System.out.println("\nLeft-to-right pattern\n=====================\n");
                printPattern(pattern);
                break;
            case 1:
                pattern = rtlPattern(pattern);
                System.out.println("\nRight-to-left pattern\n=====================\n");
                printPattern(pattern);
                break;
        }
        
    }
    
}
