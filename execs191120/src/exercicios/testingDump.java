/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.ArrayList;

/**
 *
 * @author Erick-S
 */

// 'Isolated' class so I can test some function/method outside of 'production'
// classes.

public class testingDump {
    
    public static void main(String[] args){
        
        // Array/List of values to be compared...
        int[] a = {10,10,10,10,10};
        
        // Count of valid comparisons
        int countComparisonValid = 0;
        // Count of total comparisons
        int countComparisons = 0;
        // DEBUG: size of compared Array/List
        int countSize = 0;
        // Method: List of itens previously compared
        ArrayList<Integer> previous = new ArrayList<>();
        
        // For l1: iterates the values of the Array/List to be compared
        for(int l1 = 0; l1 < a.length; l1++){
            // For l2: same as l1, is used to compare itself to l1
            for(int l2 = 0; l2 < a.length; l2++){
                // if l1[n] != l2[n], compares the value, so it wont compare
                // something like l1[0] and l2[0] (like comparing a[0] to itself
                if(l1 != l2){
                    // if l2[n] is contained in the list previous, it will not
                    // be compared
                    if(!previous.contains(l2)){
                        // boolean and print DEBUG: shows valid tests and results
                        boolean test = a[l1] == a[l2];
                        System.out.printf("L1 = %d; L2 = %d; test = %b\n", l1, l2, test);
                        // Increment valid comparisons counter
                        countComparisonValid++;
                    }
                }
                // Increment number of total comparisons
                countComparisons++;
            }
            // Add l1[n] to previous list
            previous.add(l1);
            // DEBUG: increment size counter of the compared Array/List
            countSize++;
        }
        
        // DEBUG: print counters
        System.out.printf("Count (Comparisons): %d\n", countComparisons);
        System.out.printf("Count (Comparisons l1!=l2): %d\n", countComparisonValid);
        System.out.printf("Count (Array Size): %d", countSize);
        
    }
    
}
