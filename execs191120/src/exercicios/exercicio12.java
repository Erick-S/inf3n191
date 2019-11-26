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

// TODO: Learn from these last 2 excercises: manipulation of 'currency' here.
// Read for better implementations of BigDecimal or other libraries

//Exercício
//A padaria Hotpão vende uma certa quantidade de pães franceses e uma 
//quantidade de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa 
//R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos 
//pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do 
//total arrecadado). Você foi contratado para fazer os cálculos para o dono. 
//Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e 
//de broas, e depois calcular os dados solicitados. 
public class exercicio12 {
    
    public static void main(String[] args){
        
        BigDecimal totalPaes = BigDecimal.valueOf(0.12);
        BigDecimal totalBroas = BigDecimal.valueOf(1.50);
        BigDecimal quantidadePaes, quantidadeBroas;
        // will convert value of 'total*' to a String
        String valorTotal, valorPoupanca;

        Scanner r = new Scanner(System.in);

        System.out.print("O valor de cada pão é: R$0,12"
                + "\nO valor de cada broa é: R$1,50\n\n");
        
        System.out.print("Insira a quantidade de pães vendidos:");
        quantidadePaes = r.nextBigDecimal().setScale(0, RoundingMode.UP);
        
        System.out.print("Insira a quantidade de broas vendidas:");
        quantidadeBroas = r.nextBigDecimal().setScale(0, RoundingMode.UP);
        
        totalPaes = totalPaes.multiply(quantidadePaes)
                .setScale(2, RoundingMode.HALF_EVEN);
        
        totalBroas = totalBroas.multiply(quantidadeBroas)
                .setScale(2, RoundingMode.HALF_EVEN);
        
        valorTotal = totalPaes.add(totalBroas).toString();
        
        valorPoupanca = totalPaes.add(totalBroas)
                .multiply(new BigDecimal(0.1))
                .setScale(2, RoundingMode.HALF_EVEN)
                .toString();
        
        //Creates a bar between input/output
        System.out.print("\n\n--------------------\n\n");
        
        System.out.printf("Valor total dos pães: R$%s\n", totalPaes);
        System.out.printf("Valor total das Broas: R$%s\n", totalBroas);
        
        System.out.printf("Total arrecadado: R$%s\n", valorTotal);
        System.out.printf("Total a ser inserido na poupança: R$%s\n", valorPoupanca);
        
    }
    
}
