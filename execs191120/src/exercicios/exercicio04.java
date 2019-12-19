package exercicios;

import javax.swing.JOptionPane;

//"Você deverá criar um programa que dirá se um número é par ou ímpar"
public class exercicio04{
    
    public static void main(String[] args){
        
        // Valor a ser comparado
        int valor;
        valor = Method.intInputBox("Valor");
        
        // Texto de resultado que será alterado se o valor for par ou ímpar
        String result;
        // Se o resto da divisão for 0, o valor é par
        if(valor%2==0){
            result = String.format("O valor %d é par", valor);
        // Caso contrário o valor é ímpar
        }else{
            result = String.format("O valor %d é ímpar", valor);
        }      
        
        // Apresenta o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, result);
        
    }
    
}