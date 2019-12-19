package exercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

// "Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um 
// algoritmo para ler o preço do litro da gasolina e o valor do pagamento, e 
// exibir quantos litros ele conseguiu colocar no tanque "

public class exercicio07{
    public static void main(String[] args){
        
        // Valores do dinheiro e do litro da gasolina, com precisão decimal em 2
        BigDecimal dinheiro, valorLitro;
        short precisao = 2;

        // Inserção da quantidade de dinheiro e do valor do litro da gasolina
        dinheiro = Method.decimalInputBox(
                "A quantidade de dinheiro que o motorista possui", 
                precisao
        );
        valorLitro = Method.decimalInputBox(
                "O valor (da gasolina) por litro",
                precisao
        );
        
        // Quantidade de litros abastecida é a divisão entre dinheiro e o valor
        // do litro da gasolina, com precisão decimal em 2, e arredondado de
        // forma equidistante, ou para o valor par mais próximo.
        BigDecimal tanqueAbastecido = dinheiro.divide(
                valorLitro,
                precisao,
                RoundingMode.HALF_EVEN
        );
        
        // Formatação e apresentação do resultado
        String resultado = String.format(
                "A quantidade em litros abastecida é: %f Litros",
                tanqueAbastecido
        );        
        JOptionPane.showMessageDialog(null, resultado);
        
    }
}