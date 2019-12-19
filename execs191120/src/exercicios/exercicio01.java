package exercicios;

import javax.swing.JOptionPane;

// "Faça um programa que receba 2 valores e retorne o maior entre eles."
public class exercicio01{
    
    public static void main(String[] args){
        
        // Valores a serem lidos
        int valor1, valor2;
        // Isere um valor numérico a valor1
        valor1 = Method.intInputBox("Valor 1");
        // Isere um valor numérico a valor2
        valor2 = Method.intInputBox("Valor 2");
                
        // Comparação do maior valor. Se valor1 for maior que valor 2, max é
        // valor1. Caso contrário, max é valor 2
        int max = (valor1 > valor2) ? valor1 : valor2;
        
        // Formata um texto 'String' com a soma de valor1 e valor2
        String result = String.format("O resultado é: \"%d\"", max);
        // Exibe o resultado
        JOptionPane.showMessageDialog(null, result);
        
    }
}