/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Erick-S
 */
public class exercicio10 {
    
    /*
     * Escrever um algoritmo que receba n quilometragens que me retorne os dois
     * caminhos mais próximos.
     */
    
    // @todo Refazer este exercício do zero...?
    // Tentar reduzir o número de bibliotecas, ao menos retirar Arrays e Collections
    
    /**
     * 
     * Takes an Integer array and prints the smallest values, according to quantity
     * 
     * @param array Array to be sorted
     * @param quantity Quantity of values displayed
     */
    public static void printShortestsReverse(int[] array, int quantity){
        
        // Array organizado em ordem crescente
        // Arrays.sort(array);
        array = sort.bubbleSort(array);
        
        // array irá receber ele mesmo, mas com quantidade reduzida
        array = Arrays.copyOf(array, quantity);
        
        // Array iterado em ordem reversa
        for(
            int i = array.length;
            i > array.length-quantity;
            i--
        ){
            System.out.printf(
                    "%dª menor distância: %d\n",
                    i,
                    array[i-1]
            );
        }
        
    }
    
    /**
     * Takes an Integer array and prints the largest values, according to quantity
     * 
     * @param array Array to be sorted
     * @param quantity Quantity of values displayed
     */
    public static void printLongestsReverse(int[] array, int quantity){
        
        // Organiza o array em ordem inversa
        // Arrays.sort(array, Collections.reverseOrder());
        array = sort.bubbleSortReverse(array);
        
        // array irá receber ele mesmo, mas com quantidade reduzida
        array = Arrays.copyOf(array, quantity);
        
        // Array iterado em ordem reversa
        for(
            int i = array.length;
            i > array.length-quantity;
            i--
        ){
            System.out.printf(
                    "%dª maior distância: %d\n",
                    i,
                    array[i-1]
            );
        }
        
    }
    
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        
        // Tipo de resultado, irá ser perguntado ao usuário mais tarde
        String[] resultType = {
            "menores",
            "maiores"
        };
        
        // Quantidade de distâncias a serem inseridas
        System.out.print("Insira a quantidade de caminhos: ");
        int quantidade = r.nextInt();
        
        // Armazena todas as distâncias
        int[] quilometragens = new int[quantidade];
        
        // Inserir todas as distâncias
        for(int i = 0; i < quantidade; i++){
            
            System.out.printf("caminho %d: ", i+1);
            quilometragens[i] = r.nextInt();
            
        }
        
        // Requisita o tipo de comparação
        System.out.println(
                "{0}: Menores"
                +"\n"
                +"{1}: Maiores"
                +"\n"
                +"Digite o número para o tipo de resultados: "
        );
        int type = r.nextInt();
        
        // Requisita a quantidade de valores a serem exibidos. @todo não pode
        // ser maior que quantidade.
        System.out.printf(
                "Insira a quantidade dos %s caminhos "
                +"a serem exibidos (máximo %d): ",
                resultType[type],
                quantidade
        );
        int menores = r.nextInt();
        
        // Comparações. Caso não for válido, sai do código.
        // Caso for 0, comparação dos menores valores.
        // Caso for 1, comparação dos maiores valores.
        switch(type){
            default:
                System.out.println("Tipo inválido!");
                System.exit(1);
                break;
            case 0:
                printShortestsReverse(quilometragens, menores);
                break;
            case 1:
                printLongestsReverse(quilometragens, menores);
                break;
        }
        
    }
    
}
