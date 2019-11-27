/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

// use of BigDecimal for 'precision' 'monetary' value handling
import java.math.BigDecimal;
// use of RoundingMode to round the 'monetary' value with a scale of 2
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author Erick-S
 */

//Exercício
//Vocês deverão criar um algoritmo para o seguinte programa. O programa irá 
//receber o nome e valor de um produto qualquer. O usuário irá dizer se ele é 
//“importado” ou “nacional”; Ao final do programa deverá ser exibido na tela 
//as informações do produto e caso ele seja “importado” seu preço deverá ser 
//multiplicado por 2,17; 
public class exercicio11 {
    
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
    
        String nomeProduto, tipoProduto;
        BigDecimal valorProduto;
        int idTipoProduto;

        System.out.print("Insira o nome do produto: ");
        nomeProduto = r.nextLine();
        
        System.out.print("Insira o valor do produto (Será arredondado pelo modo 'HALF_EVEN'): ");
        valorProduto = r.nextBigDecimal();
        
        System.out.print("Insira o tipo do produto a partir dos códigos:"
                + "\n'1': Nacional"
                + "\n'2': Importado"
                + "\n Tipo de produto: ");
        idTipoProduto = r.nextInt();
        
        String valor;
        
        switch(idTipoProduto){
            default:
                System.out.print("ERRO: TIPO INVÁLIDO");
                System.exit(0);
            case 1:
                tipoProduto = "Nacional";
                valor = valorProduto.setScale(2, RoundingMode.HALF_EVEN).toString();
                break;
            case 2:
                tipoProduto = "Importado";
                valor = valorProduto.multiply(BigDecimal.valueOf(2.17)).setScale(2, RoundingMode.HALF_EVEN).toString();
                break;
        }
        
        System.out.printf("\n\n--------------------\n"
                + "Informações do produto:\n"
                + "Nome do produto: %s\n"
                + "Valor do produto: R$%s\n"
                + "Tipo de produto: %s", nomeProduto, valor, tipoProduto);
        
    }
    
}
