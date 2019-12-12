/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * the 'Methods' class
 * 
 * Dump of static methods that might be useful in this package
 * 
 * @author Erick-S
 */
public class m {
    /**
     * 
     * reduce the size of the print statement
     * 
     * @param texto String to be printed by the out buffer
     * 
     */
    public static void print(String texto){
        
        System.out.print(texto);
        
    }
    
    /**
     * 
     * reduce the size of the println statement
     * 
     * @param texto String to be printed by the out buffer
     * 
     */
    public static void println(String texto){
        
        System.out.println(texto);
        
    }
    
    /**
     * 
     * reduce the size of the printf statement
     * 
     * @param texto String to be printed by the out buffer
     * 
     * @param args Array of objects to be inserted in the formatted String
     * 
     */
    public static void printf(String texto, Object... args){
        
        System.out.printf(texto, args);
        
    }
}
