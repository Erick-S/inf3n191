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
public class exercicio08 {
    
    /*
     * Escreva um algoritmo que leia n produtos;
     * Quando for informado o nome do produto, o usuário deve informar a 
     * quantidade vendida no dia;
     * Ao final da leitura dos n produtos, o algoritmo deve informar qual foi o 
     * produto que menos vendeu.
     */
    
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        r.useDelimiter("\\n");
        
        // Quantidade de produtos
        System.out.print(
                "Insira a quantidade de diferentes produtos vendidos: "
        );
        int quant = r.nextInt();
        
        // Armazena o produto que vendeu menos e sua quantidade
        String menorProduto = "";
        int menorQuant = 0;
        
        for(int i = 1; i <= quant; i++){
            
            // Line break/header
            System.out.printf(
                    "\n===== | Produto %d | =====\n",
                    i
            );
            
            String nomeProduto = "";
            int valorProduto = 0;
            int quantidadeProduto = 0;
            
            System.out.printf(
                    "Insira o nome do produto %d: ",
                    i
            );
            nomeProduto = r.next();
            
            System.out.printf(
                    "Insira o valor do produto %d: ",
                    i
            );
            valorProduto = r.nextInt();
            
            System.out.printf(
                    "Insira a quantidade de produtos %s vendidos: ",
                    i,
                    nomeProduto
            );
            quantidadeProduto = r.nextInt();
            
            System.out.printf(
                    "O produto %s vendeu um total de %d 'valor'",
                    nomeProduto,
                    valorProduto * quantidadeProduto
            );
            
            if(i == 1){
                menorQuant = quantidadeProduto;
                menorProduto = nomeProduto;
            }else{
                if(quantidadeProduto < menorQuant){
                    menorQuant = quantidadeProduto;
                    menorProduto = nomeProduto;
                }
            }
            
        }
        
        // Line break/header
        System.out.print("\n\n===== | Menor venda | =====\n");
        
        System.out.printf(
                "O produto %s foi o que menos vendeu, com %d unidades\n",
                menorProduto,
                menorQuant
        );
        
    }
    
}
