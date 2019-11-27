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

//Exercício
//Utilize a estrutura if para fazer um programa que retorne o nome de um 
//produto a partir do código do mesmo. Considere os seguintes códigos:
/*
 * 001 = Parafuso;
 * 002 = Porca;
 * 003 = Prego;
 * Para qualquer outro código indicar ?Diversos?.
 */

/*
 * 'Product' codes have leading zeroes, so it will receive a number and add
 * leading zeroes as needed with String.format("0nd", d) where 'd' is the number
 * and n is the ammount of digits this string will have
 */
public class exercicio09 {
    
    public static void main(String[] args){
        
        System.out.print("Procura de itens por códigos."
                + "\nInsira um código para a pesquisa: ");

        int pesquisa = execsMethods.intInputBox("pesquisa");
        
        // String to return the code from the switch statement
        String resultado;
        
        switch(pesquisa){
            default:
                // String.format("%03d", n) returns a number with up to 3 leading
                // zeroes. EX: n = 5, formatted text will be "005".
                resultado = String.format("%03d: ?DIVERSOS?", pesquisa);
                break;
            case 1:
                resultado = "001: Parafusos";
                break;
            case 2:
                resultado = "002: Porcas";
                break;
            case 3:
                resultado = "003: Pregos";
                break;
        }
        
        JOptionPane.showMessageDialog(
                null, 
                resultado, 
                "Resultado:", 
                JOptionPane.INFORMATION_MESSAGE
        );
        
    }
    
}
