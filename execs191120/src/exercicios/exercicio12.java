package exercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

// "A padaria Hotpão vende uma certa quantidade de pães franceses e uma 
// quantidade de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa 
// R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos 
// pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do 
// total arrecadado). Você foi contratado para fazer os cálculos para o dono. 
// Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e 
// de broas, e depois calcular os dados solicitados."
public class exercicio12{
    
    public static void main(String[] args){
        
        // Valor total dos pães e broas, inicializados com seus valores unitários
        BigDecimal totalPaes = BigDecimal.valueOf(0.12);
        BigDecimal totalBroas = BigDecimal.valueOf(1.50);
        
        // Quantidade de pães e broas
        BigDecimal quantidadePaes, quantidadeBroas;
        
        // Valores serão convertidos em String
        String valorTotal, valorPoupanca;

        // Leitor de valores pela linha de comandos
        Scanner r = new Scanner(System.in);

        // Texto informando os valores
        System.out.print("O valor de cada pão é: R$0,12"
                + "\nO valor de cada broa é: R$1,50\n\n");
        
        // Informando a quantidade de vendas
        System.out.print("Insira a quantidade de pães vendidos:");
        quantidadePaes = r.nextBigDecimal().setScale(0, RoundingMode.UP);
        System.out.print("Insira a quantidade de broas vendidas:");
        quantidadeBroas = r.nextBigDecimal().setScale(0, RoundingMode.UP);
        
        // totalPaes = TotalPaes * quantidade, com no máximo 2 casas decimais
        // e arredondado
        totalPaes = totalPaes.multiply(quantidadePaes)
                .setScale(2, RoundingMode.HALF_EVEN);
        
        // totalBroas = TotalBroas * quantidade, com no máximo 2 casas decimais
        // e arredondado
        totalBroas = totalBroas.multiply(quantidadeBroas)
                .setScale(2, RoundingMode.HALF_EVEN);
        
        // valorTotal = totalPaes + totalBroas, transformado em String
        valorTotal = totalPaes.add(totalBroas).toString();
        
        // valorPoupanca = (totalPaes + totalBroas)*0.1, com no máximo 2 casas 
        // decimais e transformado em string
        valorPoupanca = totalPaes.add(totalBroas)
                .multiply(new BigDecimal(0.1))
                .setScale(2, RoundingMode.HALF_EVEN)
                .toString();
        
        // Exibição formatada dos resultados
        System.out.print("\n\n--------------------\n\n");        
        System.out.printf("Valor total dos pães: R$%s\n", totalPaes);
        System.out.printf("Valor total das Broas: R$%s\n", totalBroas);        
        System.out.printf("Total arrecadado: R$%s\n", valorTotal);
        System.out.printf(
                "Total a ser inserido na poupança: R$%s\n",
                valorPoupanca
        );
        
    }
    
}