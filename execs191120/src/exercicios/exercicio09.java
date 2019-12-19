package exercicios;

import javax.swing.JOptionPane;

/*Utilize a estrutura if para fazer um programa que retorne o nome de um 
 *produto a partir do código do mesmo. Considere os seguintes códigos:
 *
 * 001 = Parafuso;
 * 002 = Porca;
 * 003 = Prego;
 * Para qualquer outro código indicar ?Diversos?.
 */
/* Regras Extras:
 * Os códigos de produtos possuem zeros iniciais, portanto o resultado irá ser
 * formatado com a função String.format("0nd", d), onde 'd' é o número a ser
 * apresentado e 'n' é a quantidade de zeros iniciais.
 * Ex: 03d poderá exibir um valor '001' para o número 1, ou '1000' para o número
 * 1000.
 */
public class exercicio09{
    
    public static void main(String[] args){

        // Pesquisa por código
        int pesquisa = Method.intInputBox("pesquisa");
        
        // Texto resultante
        String resultado;
        
        // Retornos
        switch(pesquisa){
            // Caso for um outro código, retornar categoria ?DIVERSOS?
            default:
                // Formatação do texto com zeros iniciais, conforme descrito
                // anteriormente
                resultado = String.format("%03d: ?DIVERSOS?", pesquisa);
                break;
            // Caso pesquisa for entre 1 e 3, retorna estes códigos
            case 1:
                resultado = "001: Parafusos";
                break;
            case 2:
                resultado = "002: Porcas";
                break;
            case 3:
                resultado = "003: Pregos";
                break;
        }
        
        // Exibição do resultado
        JOptionPane.showMessageDialog(
                null, 
                resultado, 
                "Resultado:", 
                JOptionPane.INFORMATION_MESSAGE
        );
        
    }
    
}