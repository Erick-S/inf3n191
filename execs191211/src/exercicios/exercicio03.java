/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Erick-S
 */
public class exercicio03{
    
    /*
     * Escreva um algoritmo que leia o nome do produto e o valor. 
     *
     * O algoritmo deve seguir esta lógica:
     * 1. o usuário vai informar n produtos;
     * 1. quando o usuário informar no nome do produto a palavra fim, o 
     * algoritmo devera retornar o produto com o maior valor;
     */
    public static void main(String[] args){
        
        // Valores do nome e valor do produto com maior valor
        String nomeMaior = null;
        int valorMaior = 0;
        
        // Utilizando delimitador de nova linha ('\n') pois há problemas com a
        // leitura de novas linhas. Exemplo: Nome do produto n+1 recebe o valor
        // de uma nova linha do valor do produto n
        Scanner r = new Scanner(System.in);
        r.useDelimiter("\\n");
        
        // Variável de controle
        boolean run = true;
        
        // Quantidade de produtos e produto a ser informado
        int products = 0;
        String produto;
        int valor;
        
        // Aviso informativo para o usuário
        m.println(
                "O programa irá receber o nome e valor de produtos enquanto\n"
              + "não for inserido o comando 'fim'. Quando o comando 'fim' for\n"
              + "inserido, o programa irá mostrar o nome e o valor do maior"
              + "produto."
        );
        
        while(run){
            // Informa o nome do produto n
            m.printf("Insira o nome do produto %d: ", products+1);
            produto = r.next();
            
            // Se o nome do produto for alguma forma de 'fim', o programa
            // encerra
            if(produto.equalsIgnoreCase("fim")){
                
                run = false;
               
            // Caso for um nome válido
            }else{
                
                // Informa o valor do produto n
                m.printf("Insira o valor do produto %d: ", products+1);
                valor = r.nextInt();
                
                // Se for o primeiro produto, o produto com maior valor é ele
                // mesmo.
                if(products == 0){
                    nomeMaior = produto;
                    valorMaior = valor;
                    products++;
                // Caso contrário, compara o valor atual com o maior valor
                }else{
                    if(valor > valorMaior){
                        valorMaior = valor;
                        nomeMaior = produto;
                    }
                    products++;
                }
                
            }
            
        }
        
        // Demonstra o nome do produto com maior valor, assim como seu valor
        m.printf(
                "O produto %s tem o maior valor, com %d\n",
                nomeMaior,
                valorMaior
        );
        
    }
    
}
