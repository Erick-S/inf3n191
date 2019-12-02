/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aval01;
import javax.swing.JOptionPane;

/*
 * @file
 * @section DESCRIPTION
 *
 * Código demonstrativo da avaliação 01 onde um grupo de times deverá
 * competir entre si, utilizando algumas regras.
 */

public class AvaliacaoJogo {
   
    /*
     * Função que irá mostrar um diálogo para o usuário inserir um texto
     *
     * @param texto Texto que será demonstrado na caixa de diálogo
     *
     * @return Uma string de texto
     */
    public static String LerTexto(String texto) {
        
        return JOptionPane.showInputDialog(texto);
        
    }
    
    /*
     * Função que irá mostrar um diálogo para o usuário inserir um número
     *
     * @param texto Texto que será demonstrado na caixa de diálogo
     *
     * @return Um número
     */
    public static int LerNumero(String texto) {

        return Integer.parseInt(JOptionPane.showInputDialog(texto));
        
    }
    
    /*
     * Função que irá mostrar um diálogo com um texto definido em código
     *
     * @param texto Texto que será mostrado na caixa de diálogo
     */
    public static void ExibirTexto(String texto){
        
        JOptionPane.showMessageDialog(null, texto);
        
    }
    
    /*
     * Função que irá realizar a lógica do jogo, onde será inserido dois times
     * que irão ter uma quantidade de gols. Possui uma regra em que o jogo terá
     * ou não uma prorrogação como método de desempate. Em caso de desempate sem
     * ou durante prorrogação, terá desempate por pênaltis.
     *
     * @param time1 Nome do time 1
     * 
     * @param time2 Nome do time 2
     *
     * @param prorrogacao Valor lógico se terá ou não uma prorrogação
     *
     * @return O nome do time vencedor
     */
    public static String Jogo(String time1, String time2, boolean prorrogacao){
        
        String vencedor;
        
        int gols1 = LerNumero("Gols do "+time1);
        
        int gols2 = LerNumero("Gols do "+time2);
        
        if(gols1 > gols2){
           vencedor = time1; 
        }
        else if(gols2 > gols1){
            vencedor = time2;
        }
        else{ // gols1 == gols2
            if(prorrogacao){ // Em caso de prorrogação == TRUE
                // Prorrogação é um outro jogo, pois não temos
                // nenhum controle de tempo.
                // Caso for necessário, poderá ser implementado
                // mais tarde.
                ExibirTexto("Este jogo terá uma prorrogação!");
                vencedor = Jogo(time1, time2, false);
            }else{ // Em caso de prorrogação == FALSE
                ExibirTexto("Este jogo terá pênaltis!");
                vencedor = Penalti(time1, time2);
            }
        }
        
        return vencedor;
        
    }
    
    /*
     * Função que irá realizar a lógica de pênaltis. Pênaltis são
     * semelhantes a um jogo, onde dois times tem seus gols comparados
     * e será retornado o nome do vencedor. A regra do pênalti é que ele
     * não poderá terminar em empate, portanto caso ocorra um, a função irá
     * ser rodada novamente.
     *
     * @param time1 Nome do time 1
     *
     * @param time2 Nome do time 2
     *
     * @return Nome do time vencedor
     */
    public static String Penalti(String time1, String time2){
        
        String vencedor;
        
        int gols1 = LerNumero("Penaltis do "+time1);
        
        int gols2 = LerNumero("Penaltis do "+time2);
        
        // Em caso de empate, deverá ter outro resultado.
        if(gols1==gols2){
            ExibirTexto("Penaltis não podem empatar!");
            vencedor = Penalti(time1, time2);
        }else if(gols1 > gols2){
           vencedor = time1; 
        }
        else /*(gols2 > gols1)*/{
            vencedor = time2;
        }
        
        return vencedor;
        
    }
    
    public static void main(String[] args) {
        
        /*
         * Bloco básico para um jogo, onde será mostrado um diálogo
         * mostrando um nome identificador ao jogo e a requisição dos
         * nomes dos dois times. Então será criado um 'jogo' utilizando
         * os times e a regra de prorrogação. Foi mencionado que só teriam
         * prorrogações a partir das semi-finais, portanto os outros jogos
         * tem prorrogação com valor FALSE.
         */
        ExibirTexto("Jogo 1");
        String time1 = LerTexto("Nome do primeiro time");
        String time2 = LerTexto("Nome do segundo time");
        String vencedorJogo1 = Jogo(time1, time2, false);
        ExibirTexto("Vencedor do primeiro jogo é: "+vencedorJogo1);
        
        ExibirTexto("Jogo 2");
        String time3 = LerTexto("Nome do terceiro time");
        String time4 = LerTexto("Nome do quarto time");
        String vencedorJogo2 = Jogo(time3, time4, false);
        ExibirTexto("Vencedor do segundo jogo é: "+vencedorJogo2);
        
        ExibirTexto("Jogo 3");
        String time5 = LerTexto("Nome do quinto time");
        String time6 = LerTexto("Nome do sexto time");
        String vencedorJogo3 = Jogo(time5, time6, false);
        ExibirTexto("Vencedor do terceiro jogo é: "+vencedorJogo3);
        
        ExibirTexto("Jogo 4");
        String time7 = LerTexto("Nome do sétimo time");
        String time8 = LerTexto("Nome do oitavo time");
        String vencedorJogo4 = Jogo(time7, time8, false);
        ExibirTexto("Vencedor do quarto jogo é: "+vencedorJogo4);
        
        
        /*
         * Como já criamos os times, todos resultados (times vencedores)
         * foram inseridos em variáveis de 'vencedorJogoX', que foram
         * utilizados nos próximos jogos, a partir do quarto.
         */
        ExibirTexto("Semi final 1!");
        String vencedorSemiFinal1 = Jogo(vencedorJogo1, vencedorJogo2, true);
        
        ExibirTexto("Semi final 2!");
        String vencedorSemiFinal2 = Jogo(vencedorJogo3, vencedorJogo4, true);
        
        ExibirTexto("Finais!");
        String vencedor = Jogo(vencedorSemiFinal1, vencedorSemiFinal2, true);
        
        ExibirTexto("Vencedor do campeonato é: "+vencedor);      
    
    }
     
}