package exercicios;

import javax.swing.JOptionPane;

//"Faça um algoritmo que leia as 3 notas de um aluno e calcule a média final
// deste aluno"
/* Regras extras: 
 * Notas não podem exceder 100
 * Se a média < 60, o resultado é reprovado, caso contrário, aprovado
 */
public class exercicio02{
    
    public static void main(String[] args){
        
        // Inicialização das notas
        int 
                nota1 = 101, 
                nota2 = 101, 
                nota3 = 101;
        
        // Teste para verificar se nenhuma nota é inválida.
        // Único teste realizado é se ela é menor que 100
        boolean validacao = false;
        
        // Faça isto enquanto as notas não forem válidas
        do{
            
            // Caso não possuir notas válidas, apresentar o aviso
            if(!validacao){
                JOptionPane.showMessageDialog(
                        null, "Notas não podem exceder o valor de 100"
                );
            }
            
            // Caso nota for inválida, informar nota válida
            if(nota1>100){
                nota1 = Method.intInputBox("Nota 1 (MÁX: 100)");
            }
            if(nota2>100){
                nota2 = Method.intInputBox("Nota 2 (MÁX: 100)");
            }
            if(nota3>100){
                nota3 = Method.intInputBox("Nota 3 (MÁX: 100)");
            }
            
            // Se todas as notas forem válidas (Até 100), notas são validadas
            if(nota1 <= 100 && nota2 <= 100 && nota3 <= 100){
                validacao = true;
            }
            
        }while(!validacao); // Condição do 'do{}while();'
        
        // Cálculo da média
        int media = (nota1+nota2+nota3)/3;
        
        // Texto de resultado, pronto para ser formatado com o resultado e a
        // média.
        String result;
        
        // Se média é maior ou igual a 60, texto de aprovação
        if(media >= 60){
            result = String.format("Aprovado com média: %d", media);
        // Se média é menor que 60, texto de reprovação
        }else{
            result = String.format("Reprovado com média: %d", media);
        }
        
        // Exibe o resultado
        JOptionPane.showMessageDialog(null, result);
        
    }

}