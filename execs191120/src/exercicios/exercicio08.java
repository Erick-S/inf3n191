package exercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;

/* "Faça um programa que receba 3 valores que representarão os lados de um 
 * triângulo e verifique se os valores formam um triângulo e classifique esse 
 * triângulo como:
 * - eqüilátero (3 lados iguais);
 * - isósceles (2 lados iguais);
 * - escaleno (3 lados diferentes).
 *
 * Lembre-se que para formar um triângulo:
 * - nenhum dos lados pode ser igual a zero;
 * - um lado não pode ser maior do que a soma dos outros dois;"
 */
public class exercicio08{
    
    // Verifica se este vetor contem o valor 'value'
    private static boolean contains(int[] array, int value){
        
        boolean test = false;

        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                test = true;
            }
        }
        
        return test;
        
    }
    
    public static void main(String[] args){
        
        // Vetor com os lados de um triângulo
        int[] lados = {0,0,0};
        
        // Variável de validação de um triângulo
        boolean validation = false;
        
        /* Triângulo é INválido se:
         * a+b > c OU a+c > b OU b+c > a
         * algum lado é 0
         */
        
        // Requisita do usuário os lados enquanto o triângulo não for válido
        do{
            lados[0] = Method.intInputBox("lado 1");
            lados[1] = Method.intInputBox("lado 2");
            lados[2] = Method.intInputBox("lado 3");
            
            // Condição de erro onde um ou mais lados é zero
            if(contains(lados, 0)){
                validation = false;
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: Um dos lados é zero!"
                );
            }else{
                validation = true;
            }
            
            // Uma condição para que um triângulo seja válido é que a soma de
            // dois de seus lados deve ser maior que um terceiro lado.
            // Caso o terceiro lado for maior, a figura não é um triângulo.
            // Poderá existir um triângulo hipotético onde a soma dos dois lados
            // é igual ao terceiro lado, resultando em uma figura triangular com
            // área igual a zero (Conhecido como "Triângulo Degenerado").
            
            // A expressão para um triângulo válido poderá ser representada como
            // a+b > c || a+c > b || b+c > a
            // Simplificada como
            // absoluto(a - b) < c < a + b
            // Ou reperesentada como
            // max(a,b,c) < a+b+c - max(a,b,c)
            // De maneira simplificada
            // 2*max(a,b,c) < a+b+c
            
            // Como consideramos um triângulo degenerado como um caso válido,
            // iremos comparar com um <=, pois as somas poderão ser iguais ao
            // terceiro lado
            int ladosMax = Arrays.stream(lados).max().getAsInt();
            int ladosSum = Arrays.stream(lados).sum();
            if((2*ladosMax)<=ladosSum){
                validation = true;
            // No caso do triângulo falhar a validação, informar que é um
            // triângulo inválido.
            }else{
                validation = false;
                JOptionPane.showMessageDialog(
                        null, "Erro: Este não é um triângulo"
                );
            }
            
        }while(!validation);
        
        // Contagem de valores iguais nos lados
        int count = Method.countNumberEquals(lados);
        
        // Texto para informar o tipo do triângulo, iterado pelo switch{case:}
        String triangle;
        
        switch(count){
            // Se a contagem de números iguais for zero, o triângulo é escaleno
            case 0:
                triangle = "escaleno";
                break;
            // Se ao menos um valor for igual, o triângulo é isóceles
            case 1:
                triangle = "isóceles";
                break;
            // Se todos os valores forem iguais, o triângulo é equilátero
            case 3:
                triangle = "equilátero";
                break;
            // Em caso inválido...
            default:
                triangle = "INVÁLIDO?";
                break;
        }
        
        // Formatação e apresentação do resultado
        String resultado = String.format("O triângulo é: %s\n", triangle);
        JOptionPane.showMessageDialog(null, resultado);
        
    }
    
}