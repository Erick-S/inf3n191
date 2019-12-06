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
public class exercicio07 {
    
    /*
     * Dono de consecionária no final do mes
     * tenho 5 gerentes
     * últimos 3 carros que venderam
     * total por gerente
     * total geral
     */
    
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        r.useDelimiter("\\n");
        
        // Quantidade de somas
        System.out.print("A quantidade de gerentes é: ");
        int q = r.nextInt();
        
        // Soma total da venda dos gerentes
        int somaTotal = 0;
        
        for(int i = 1; i <= q; i++){
            
            // Info gerentes
            String nomeGerente;
            String carro;
            int venda;
            int qVendas;

            // Soma para cada gerente
            int somaGerente = 0;
            
            // Quebra de linha
            System.out.printf("===== | Gerente %d | =====\n", i);
            
            // Gerentes
            System.out.printf("Insira o nome do gerente %d: ", i);
            nomeGerente = r.next();
            
            // Quantitade de vendas
            System.out.printf(
                    "O gerente %s vendeu quantos carros? ",
                    nomeGerente
            );
            qVendas = r.nextInt();
            
            // Vendas
            for(int v = 1; v <= qVendas; v++){
                System.out.printf(
                            "Nome do carro da venda %d do gerente %s: ",
                            v, nomeGerente
                        );
                carro = r.next();
                
                System.out.printf("Insira o valor do carro %d: ", v);
                venda = r.nextInt();
                
                somaGerente += venda;
                
            }
            
            // Soma gerente
            System.out.printf(
                    "O gerente %s vendeu um total de %d\n",
                    nomeGerente,
                    somaGerente
            );
            
            // Soma total
            somaTotal += somaGerente;
            
        }
        
        System.out.printf(
            "Os %d gerentes venderam um total de %d\n",
            q,
            somaTotal
        );
        
    }
    
}
