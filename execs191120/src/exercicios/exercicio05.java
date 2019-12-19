package exercicios;

import javax.swing.JOptionPane;

// "Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir 
// quantos dias de vida ela possui. Considere sempre anos completos, e que 
// um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida;
// veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS"
public class exercicio05{
    
    public static void main(String[] args){
        
        // Informações da pessoa
        String nome;
        int idade;        
        nome = JOptionPane.showInputDialog("Seu nome é: ");
        // Idade múltiplicada pela quantidade de dias. Não considera anos
        // bissextos (Pois necessitaria considerar data de nascimento da pessoa)
        idade = Method.intInputBox("Idade")*365;
        
        // Formatação do resultado
        String result = String.format(
                "%s, sua idade em dias é aproximadamente: %d dias.",
                nome,
                idade
        );
        
        // Apresentação do resultado
        JOptionPane.showMessageDialog(null, result);
    }
    
}