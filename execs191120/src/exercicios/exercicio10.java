package exercicios;

import javax.swing.JOptionPane;

// "A Globo lhe contratou para desenvolver o novo sistema dela de placar digital
// que deverá funcionar da seguinte forma. O usuário irá entrar com as 
// informações dos dois times como nome e número de gols daquela partida. Ao
// final, o programa deverá dizer quem fora o vencedor"
public class exercicio10{
    
    public static void main(String[] args){
        
        // Valores de gols
        int golsTimeA, golsTimeB;
        
        // Caso padrão, o empate
        String result = "Ambos times empataram!";
        
        // Inserção dos valores dos gols
        golsTimeA = Method.intInputBox("gols do time A");
        golsTimeB = Method.intInputBox("gols do time B");
        
        // Caso time A ou B ganhar, o texto result é atualizado
        if(golsTimeA > golsTimeB){
            result = ("Time A é o vencedor!");
        }else if(golsTimeA < golsTimeB){
            result = ("Time B é o vencedor!");
        }
        
        // Exibição do resultado
        JOptionPane.showMessageDialog(null, result);
        
    }
    
}