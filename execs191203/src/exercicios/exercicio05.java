/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Erick-S
 */
public class exercicio05 {
   
    /*
     * listar uma quantidade de [String produto, (NUMBER) valor] e
     * informar o produto mais barato?
     */    
    public static void main(String[] args){
        // @todo
        
        Scanner r = new Scanner(System.in);
        
        // Shenanigans with the Scanner and new lines:
        // https://stackoverflow.com/questions/5032356/using-scanner-nextline
        // the behaviour of nextInt() does not consider new lines, thus it is
        // told to use the new line delimiter
        r.useDelimiter("\\n");
        
        // Mapa com <"nome","valor"> (<K,V>)
        HashMap<String, Integer> produtos = new HashMap<>();
        
        // Para iterações
        String nome;
        int valor;
        
        // Nome a ser retornado no final
        String nomeMenor = "";
        int valorMenor = 0;
        
        // Quantidade de items
        System.out.print("Insira a quantidade de produtos a serem comparados: ");
        int quantidade = r.nextInt();
        
        // Para quantidade, inserir nome e valor no mapa. Caso for o primeiro
        // item a ser inserido, ele é considerado o menor.
        for(int i = 1; i <= quantidade; i++){
            System.out.printf("Insira o nome do produto %d: ", i);
            nome = r.next();
            
            System.out.printf("Insira o valor do produto %d: ", i);
            valor = r.nextInt();
            
            // Se é o primeiro item, ele é o menor
            if(i == 1){
                nomeMenor = nome;
                valorMenor = valor;
            }
            
            // Itens inseridos no mapa 'produtos<String, Integer>'
            produtos.put(nome, valor);
        }
        
        // Para cada nome de produto (key), compara seus valores (value) com o
        // menor valor dos produtos
        for(String key : produtos.keySet()){
            // Caso o valor a ser comparado for menor que o atual menor valor
            if(produtos.get(key) < valorMenor){
                // O produto com o menor valor é aquele que se encontra na chave
                // (nome) atual
                nomeMenor = key;
                valorMenor = produtos.get(key);
            }
        }
        
        System.out.printf(
                "O produto %s tem o menor valor (%d)\n",
                nomeMenor,
                valorMenor
        );
        
    }
    
}
