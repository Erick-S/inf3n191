/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick-S
 */

//Exercício
//Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um 
//algoritmo para ler o preço do litro da gasolina e o valor do pagamento, e 
//exibir quantos litros ele conseguiu colocar no tanque 

// Refatorando exercícios a partir do sétimo para utilizar javax.swing OptionPanels
public class exercicio07 {
    public static void main(String[] args){
        
        BigDecimal dinheiro, valorLitro;

        dinheiro = execsMethods.decimalInputBox("A quantidade de dinheiro que o motorista possui");
        valorLitro = execsMethods.decimalInputBox("O valor (da gasolina) por litro");
        
        BigDecimal tanqueAbastecido = dinheiro.divide(valorLitro, 2, RoundingMode.HALF_EVEN);
        
        String resultado = String.format("A quantidade em litros abastecida é: %f Litros\n", tanqueAbastecido);
        
        JOptionPane.showMessageDialog(null, resultado);
        
    }
}
