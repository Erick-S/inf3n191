/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * Class to test the sorting algorithms of the sort class
 * 
 * Makes arrays of different sizes, sorted randomly or in a certain order and
 * tests the sorting methods from sort
 * 
 * @author SMC-Torelly-TI
 */
public class sortingTest {
    
    static void printArray(int[] array){
        
        System.out.print("[ ");
        
        for(int i = 0; i < array.length; i++){
            if(i == array.length - 1){
                System.out.printf("%d", array[i]);
            }else{
                System.out.printf("%d, ", array[i]);
            }
        }
        
        System.out.println(" ]");
        
    }
    
    public static void main(String[] args){
        
        int[] toBeSorted = {
            55,
            167,
            14,
            1347,
            1346,
            98,
            512
        };
        
        int[] alreadySorted = {
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9
        };
        
        int[] reverseSorted = {
            1000,
            900,
            800,
            700,
            600,
            500,
            400,
            200,
            100
        };
        
        int[] dutchFlag = {
            1, 2, 3,
            3, 2, 1,
            1, 3, 2,
            1, 2, 3
        };
        
        sort sort = new sort();
        
        // QuickSort with Hoare partition scheme
//        System.out.println("Unordered array");
//        printArray(toBeSorted);
//        toBeSorted = sort.quickSortHoare(toBeSorted, 0, toBeSorted.length-1);
//        System.out.println("Sorted array I");
//        printArray(toBeSorted);
//        
//        System.out.println("Already Sorted array");
//        printArray(alreadySorted);
//        alreadySorted = sort.quickSortHoare(alreadySorted, 0, alreadySorted.length-1);
//        System.out.println("Sorted array II");
//        printArray(alreadySorted);
//        
//        System.out.println("Reverse sorted Array");
//        printArray(reverseSorted);
//        reverseSorted = sort.quickSortHoare(reverseSorted, 0, reverseSorted.length-1);
//        System.out.println("Sorted array III");
//        printArray(reverseSorted);
//        
//        System.out.println("'Dutch flag' Array");
//        printArray(dutchFlag);
//        dutchFlag = sort.quickSortHoare(dutchFlag, 0, dutchFlag.length-1);
//        System.out.println("Sorted array IV");
//        printArray(dutchFlag);
        
        // BubbleSort
        System.out.println("Unordered array");
        printArray(toBeSorted);
        toBeSorted = sort.bubbleSort(toBeSorted);
        System.out.println("Sorted array I");
        printArray(toBeSorted);
        
        System.out.println("Already Sorted array");
        printArray(alreadySorted);
        alreadySorted = sort.bubbleSort(alreadySorted);
        System.out.println("Sorted array II");
        printArray(alreadySorted);
        
        System.out.println("Reverse sorted Array");
        printArray(reverseSorted);
        reverseSorted = sort.bubbleSort(reverseSorted);
        System.out.println("Sorted array III");
        printArray(reverseSorted);
        
        System.out.println("'Dutch flag' Array");
        printArray(dutchFlag);
        dutchFlag = sort.bubbleSort(dutchFlag);
        System.out.println("Sorted array IV");
        printArray(dutchFlag);
        
    }
    
}
