package exercicios;

import javax.swing.JOptionPane;

// "Faça um programa que receba 4 valores e retorne o menor entre eles"
/* Regras Extras:
 * Não poderá ter mais de um valor menor
 */
public class exercicio03{
    
    public static void main(String[] args){
        int valor1, valor2, valor3, valor4; // Valores
        int menor; // O menor valor
        int repetidos = 1; // Número de valores idênticos
        int forRuns = 0; // number of runs in the for loop
        valor1 = Method.intInputBox("Valor 1");
        valor2 = Method.intInputBox("Valor 2");
        valor3 = Method.intInputBox("Valor 3");
        valor4 = Method.intInputBox("Valor 4");
        
        int[] valores = {valor1, valor2, valor3, valor4};
        menor = valores[0];
        for(int l = 0; l < valores.length; l++){
            if(valores[l]<menor){
                menor = valores[l];
            }
            if(valores[l] == menor && forRuns > 0){
                repetidos++;
            }
            forRuns++;
        }
        
        if(repetidos>1){
            String error = String.format(
                    "Há ao %d valores %d iguais! não há UM valor menor", 
                    repetidos, 
                    menor
            );
            JOptionPane.showMessageDialog(null, error);
        }else{
            String result = String.format("O resultado é: %d", menor);
            JOptionPane.showMessageDialog(null, result);
        }
        
    }
    
}