package exercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

// "Vocês deverão criar um algoritmo para o seguinte programa. O programa irá 
// receber o nome e valor de um produto qualquer. O usuário irá dizer se ele é 
// “importado” ou “nacional”; Ao final do programa deverá ser exibido na tela 
// as informações do produto e caso ele seja “importado” seu preço deverá ser 
// multiplicado por 2,17;"
public class exercicio11{
    
    public static void main(String[] args){
        
        // Leitor de valores pela linha de comandos
        Scanner r = new Scanner(System.in);
    
        // Nome e tipo de produto
        String nomeProduto, tipoProduto;
        // Valor do produto
        BigDecimal valorProduto;
        // Tipo de produto em forma numérica
        int idTipoProduto;

        // Inserção das informações do produto
        System.out.print("Insira o nome do produto: ");
        nomeProduto = r.nextLine();
        System.out.print("Insira o valor do produto: ");
        valorProduto = r.nextBigDecimal();
        System.out.print("Insira o tipo do produto a partir dos códigos:"
                + "\n'1': Nacional"
                + "\n'2': Importado"
                + "\n Tipo de produto: ");
        idTipoProduto = r.nextInt();
        
        // Valor a ser transformado em texto
        String valor;
        
        // Classificando o produto de acordo com o tipo numérico
        switch(idTipoProduto){
            // Categoria inválida
            default:
                System.out.print("ERRO: TIPO INVÁLIDO");
                System.exit(0);
            // Categoria nacional, o valor do produto é igual ao inserido
            case 1:
                tipoProduto = "Nacional";
                valor = valorProduto.setScale(2, RoundingMode.HALF_EVEN)
                        .toString();
                break;
            // Categoria internacional, o valor é multiplicado por 2,17
            case 2:
                tipoProduto = "Importado";
                // Valor = valorProduto*2.17, com no máximo 2 casas decimais, 
                // arredondado e transformado em String
                valor 
                        = valorProduto.multiply(
                                BigDecimal.valueOf(2.17)
                        ).setScale(
                                2, RoundingMode.HALF_EVEN
                        ).toString();
                break;
        }
        
        // Exibição formatada dos resultados
        System.out.printf("\n\n--------------------\n"
                + "Informações do produto:\n"
                + "Nome do produto: %s\n"
                + "Valor do produto: R$%s\n"
                + "Tipo de produto: %s", nomeProduto, valor, tipoProduto);
        
    }
    
}