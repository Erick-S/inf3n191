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

// Should receive an empty multi-dimensional array and fill it with the 
// following pattern:
/*
    [ 1 2 3 4 ] ... ->
    [ 1 0 0 0 ]
    [ 0 2 0 0 ]
    [ 0 0 3 0 ]
    [ 0 0 0 4 ]
                ...
                    _\
*/
public class desafio01 {
    
    public static void main(String args[]){
        
        int[][] array = new int[5][4];  
        //int[column][row]

        // Fills the array with the pattern
        for(int row = 0; row < array.length; row++){
            for(int column = 0;column < array[row].length; column++){
                // if it is the first row, fill it with the number of the
                // column + 1, to fill it with values from 1 to row.length
                if(row == 0){
                    array[row][column] = column+1;
                }
                
                // if the row is equal to column + 1, fill the cell with 
                // values from 1 to column.length
                if(row == column+1){
                    array[row][column] = column+1;
                }
            }
        }
        
        // Prints the array
        for(int[] row : array){
            System.out.print("[");
            for(int column = 0;column < row.length; column++){
                System.out.print(" "+row[column]);
            }
            System.out.println(" ]");
        }
        
    }
    
}
