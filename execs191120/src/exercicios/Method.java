package exercicios;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Métodos repetidos pelos exercícios.
 */
public class Method{
    
    /**
     * Caixa de diálogo que transforma um texto em valor numérico do tipo int
     * @param request Descrição ou nome para o valor a ser inserido
     * @return Valor numérico do tipo int, somente positivo
     */
    /*
     * Detalhes extras:
     * O botão cancelar e fechar não foi implementado de maneira devida,
     * portanto só poderá fechar o diálogo matando o processo ou inserindo um
     * valor, válido ou não
     */
    public static int intInputBox(String request){
        // Formatação do texto informativo da caixa de diálogo
        String dialog = String.format("Insira o valor de %s:", request);
        // Texto que será retornado da caixa de diálogo
        String input = JOptionPane.showInputDialog(dialog);
        // Valor que será retornado.
        Integer result = null;
        // Variável para validar a inserção. Será verdadeira enquanto o valor
        // não for válido
        boolean notValidated = true;

        do{
            // Se o valor inserido for, por algum motivo, nulo, vazio ou não
            // corresponder a um valor numérico válido, requisita a inserção
            // de um novo valor.
            if(
                    input == null 
                    || input.isEmpty() 
                    || !input.matches("[0-9]*")
            ){
                input = JOptionPane.showInputDialog(
                        "Valor numérico inteiro somente"
                );
            // Caso o valor for válido, converte o resultado em um valor do tipo
            // Integer.
            }else{
                result = Integer.parseInt(input);
                notValidated = false;
            }
        }while(notValidated);
        
        // Retorno do valor obtido
        return result;
    }
    
    /**
     * Caixa de diálogo que transforma um texto em valor numérico do tipo BigDecimal
     * @param request Descrição ou nome para o valor a ser inserido
     * @param precision quantidade válida de valores decimais, máximo de 32767
     * @return BigDecimal valor em formato BigDecimal, somente positivo
     */
    /*
     * Detalhes extras:
     * O botão cancelar e fechar não foi implementado de maneira devida,
     * portanto só poderá fechar o diálogo matando o processo ou inserindo um
     * valor, válido ou não.
     * Código funcionará somente se o separador decimal for ".", caso contrário
     * deverá ser alterado para um separador válido.
     */
    public static BigDecimal decimalInputBox(String request, short precision){
        // Formatação do texto informativo da caixa de diálogo
        String dialog = String.format("Insira o valor de %s:", request);
        // Texto que será retornado da caixa de diálogo
        String input = JOptionPane.showInputDialog(dialog);
        // Valor que será retornado.
        BigDecimal result = null;
        // Variável para validar a inserção. Será verdadeira enquanto o valor
        // não for válido
        boolean notValidated = true;
        
        // Tenta validar a inserção de valor
        try{
            do{
                // Expressão regular para a validação do número decimal, onde:
                /*
                 * [0-9]+ Um valor numérico com um ou mais caracteres válidos
                 * (...) um grupo de captura que contém:
                 *    [.] um ponto, como separador decimal
                 *    [0-9] um valor numérico válido
                 *    {1,precision} que contenha ao menos um e até o valor de precision após este ponto
                 * (...)? Contenha 0 ou 1 vez este grupo
                 */
                /*
                 * Exemplos de valores válidos (onde precision == 2):
                 * 100 / 100.00 / 10000000.13
                 */
                String regex = String.format(
                        "[0-9]{1,4}([.][0-9]{1,%d})?",
                        precision
                );
                // Se o valor inserido for, por algum motivo, nulo, vazio ou não
                // corresponder a um valor numérico válido, requisita a inserção
                // de um novo valor.
                if(input == null || input.isEmpty() || !input.matches(regex)){
                    input = JOptionPane.showInputDialog(
                            "Valor numérico somente (Decimal separado por '.'"
                    );
                }else{
                    // Caso o valor for válido, converte o resultado em um valor 
                    //do tipo  BigDecimal.
                    result = new BigDecimal(input);
                    notValidated = false;
                }
            }while(notValidated);
        // Caso ocorrer algum erro de formatação de valor, uma excessão é gerada
        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null, error);
        }
        
        // Valor a ser retornado
        return result;
    }
    
    /**
     * Caixa de diálogo que retorna o texto inserido.
     * 
     * @param request Texto informativo para a inserção
     * @return Um texto em forma de String
     */
    public static String stringInputBox(String request){
        // Texto informativo para a caixa de diálogo
        String dialog = String.format(request);
        
        // Valor a ser retornado
        String input = JOptionPane.showInputDialog(dialog);
        return input;
    }
    
    /**
     * Recebe um vetor de números e cria uma contagem de números iguais
     * 
     * Recebe um vetor de números para comparar, cria uma contagem n, que irá
     * representar quantos números são iguais,
     * 
     * @param numbers Vetor a ser comparado
     * @return Valor em int da contagem de números iguais no vetor
     */
    public static int countNumberEquals(int[] numbers){
        
        // Variáveis que serão usadas nas comparações e contagem
        int n = 0;
        ArrayList<Integer> previous = new ArrayList<>();
        
        // Itera o vetor a ser comparado
        for(int l1 = 0; l1 < numbers.length; l1++){
            // Iteração secundária do vetor, para comparar entre ele mesmo
            for(int l2 = 0; l2 < numbers.length; l2++){
                // Condição para não comparar a mesma posição entre l1 e l2
                if(l1 != l2){
                    // Condição para que uma posição já comparada não seja
                    // comparada novamente
                    if(!previous.contains(l2)){
                        // Condição afirmando igualdade entre os valores
                        if(numbers[l1] == numbers[l2]){
                            // Se os números são iguais, incrementa a contagem
                            n++;
                        }
                    }
                }
            }
            // Adiciona a posição para a lista de posições já comparadas
            previous.add(l1);
        }
        // Retorna a contagem de números iguais
        return n;
    }
    
}