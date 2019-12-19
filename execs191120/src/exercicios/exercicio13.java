package exercicios;

import java.util.Scanner;

/* "Escrever um algoritmo que leia um conjunto de 50 informações contendo, cada 
 * uma delas, a altura e o sexo de uma pessoa (código=1, masculino código=2,
 * feminino), calcule e mostre o seguinte:
 * - a maior e a menor altura da turma
 * - a média da altura das mulheres
 * - a média da altura da turma"
 */ 
public class exercicio13{
    
    public static void main(String[] args){
        
        // Leitor de valores pela linha de comandos
        Scanner r = new Scanner(System.in);
        
        // Maior e menor altura
        float maior = 0,
              menor = 0;
        
        // Médias das alturas
        float mediaTotal = 0,
              mediaMulheres = 0;
        
        // Quantidade de mulheres
        int mulheres = 0;
        
        // Quantidade de valores (alturas) a serem informados (Requisitado 50).
        System.out.print("Informe a quantidade de pessoas na turma: ");
        int quantidade = r.nextInt();
        
        // Inserção de valores
        for(int i = 1; i <= quantidade; i++){
            // Leitura da altura da pessoa i.
            System.out.printf("Insira a altura da pessoa %d: ", i);
            float altura = r.nextFloat();
            
            // Leitura simplificada de gênero da pessoa i
            System.out.println(
                    "Gêneros: 'M' para masculino ou 'F' para feminino");
            System.out.printf("Insira o gênero da pessoa %d: ", i);
            // Leitura somente do primeiro caractere, em caso de inserções
            // indevidas ou inválidas.
            char genero = r.next().charAt(0);
            
            // Inicialização dos valores maior e menor
            if(i == 1){
                maior = altura;
                menor = altura;
            }
            
            // Comparações entre altura e maior e menor altura
            if(maior < altura){
                maior = altura;
            }
            if(menor > altura){
                menor = altura;
            }
            
            // Se esta pessoa for uma mulher
            if(genero == 'F' || genero == 'f'){
                mediaMulheres += altura;
                mulheres++;
            }
            
            // Adição para a média total
            mediaTotal += altura;
        }
        
        // Média é soma das alturas dividido pela quantidade de mulheres
        mediaMulheres /= mulheres;
        
        // Média total é a soma das alturas dividido pela quantidade de pessoas
        mediaTotal /= quantidade;
        
        // Exibição dos resultados, onde %.2f é um float com dois números decimais
        System.out.println("-----Resultados-----");
        System.out.printf("A menor altura é: %.2f\n", menor);
        System.out.printf("A maior altura é: %.2f\n", maior);
        System.out.printf(
                "A média das alturas das %d mulheres é: %.2f\n",
                mulheres,
                mediaMulheres
        );        
        System.out.printf(
                "A média das alturas das %d pessoas é: %.2f\n",
                quantidade,
                mediaTotal
        );
        
    }
    
}