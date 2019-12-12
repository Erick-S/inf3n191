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
     * Quick sort with 'Hoare partition scheme'
     * 
     * A quicksort algorithm that utilizes a partition scheme described by
     * C.A.R. Hoare. This method and its respective partitioning method were
     * adapted from the pseudocode from:
     * ' https://en.wikipedia.org/wiki/QuickSort#Hoare_partition_scheme '
     * 
     * @param array Array to be sorted
     * @param low Lowest index
     * @param high Highest index
     * 
     * @return Sorted Array
     * 
     */
    public int[] quickSortHoare(int[] array, int low, int high){
        
        if(low < high){
            int pivot = hoarePartition(array, low, high);
            array = quickSortHoare(array, low, pivot);
            array = quickSortHoare(array, pivot + 1, high);
        }
        
        return array;
        
    }
    
    /**
     * 
     * The Hoare partition scheme.
     * 
     * Utilizes two indices that starts at the beginning and end of the array,
     * then moves them towards each other until it detects an inversion,
     * changing the order of these values, and returning that index.
     * 
     * @param array Array to be sorted
     * @param low Lowest index
     * @param high Highest index
     * 
     * @return Value of the pivot for the partitioned array
     * 
     */
    public int hoarePartition(int[] array, int low, int high){
        
        int hoarePivotIndex = (low + (high - low) / 2);
        int pivot = array[hoarePivotIndex];
        
        int i = low - 1;
        int j = high + 1;
        
        do{
            
            do{
                i++;
            }while(array[i] < pivot);
            
            do{
                j--;
            }while(array[j] > pivot);
            
            if( i >= j){
                return j;
            }
            
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            
        }while(true);
        
    }
    
}
