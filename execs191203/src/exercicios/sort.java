/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * Different sorting algorithms for 'exercicio10'
 * 
 * Takes on sorting algorithms
 * 
 * @author Erick-S
 */
public class sort {
    
    /**
     * 
     * Bubble sort compares every number until it does not swap something
     * 
     * Makes a comparison between one value and the next. If current value, or
     * i-1, is greater than the next, or i, it is swapped around with the use of
     * a temporary 'temp' value. should the value be swapped, the 'swap' test
     * is set to true, so it will run the sort again, and will only stop after
     * it compares the array and does not swap any values
     * 
     * @param array The array to be sorted
     * @return the sorted array
     */
    public static int[] bubbleSort(int[] array){
        
        // Did the function swap something?
        // defaults as yes, or true
        boolean swap = true;
        
        // Temporary value to swap
        int temp;
        
        // Do it 
        while(swap){
            // Resets the swap value
            swap = false;
            for(int i = 1; i < array.length; i++){
                // If previous item is larger, swap them around
                if(array[i-1] > array[i]){
                    temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    swap = true;
                }
            }
        }
        
        return array;
        
    }
    
    /**
     * 
     * Same as bubbleSort, but in a reversed order.
     * 
     * Instead of the current value, or i-1, being greater than the next value,
     * or i, the reverse check is done (or i > i-1).
     * 
     * @todo NOTWORKING
     * 
     * @param array The array to be sorted
     * @return The sorted array
     */
    public static int[] bubbleSortReverse(int[] array){
        
        // Did the function swap something?
        // defaults as yes, or true
        boolean swap = true;
        
        // Temporary value to swap
        int temp;
        
        // Do it 
        while(swap){
            // Resets the swap value
            swap = false;
            for(int i = 1; i < array.length; i++){
                // If previous item is larger, swap them around
                if(array[i-1] < array[i]){
                    temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    swap = true;
                }
            }
        }
        
        return array;
        
    }
    
}
