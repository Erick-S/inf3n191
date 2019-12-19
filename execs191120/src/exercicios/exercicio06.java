package exercicios;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

// "Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada
// uma sendo vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo
// em que o usuário forneça a quantidade de camisetas pequenas, médias e grandes 
// referentes a uma venda, e a máquina informe quanto será o valor arrecadado" 
public class exercicio06 {
    public static void main(String[] args){
      
      // Quantidade de camisas e valor arrecadado
      int pequenas, medias, grandes, arrecadado;
      
      // Campos de texto para inserção
      JTextField pequenasTF = new JTextField(5);
      JTextField mediasTF = new JTextField(5);
      JTextField grandesTF = new JTextField(5);

      // Preparação do painel de inserção
      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("Quantidade de camisas Pequenas:"));
      myPanel.add(pequenasTF);
      myPanel.add(new JSeparator());
      myPanel.add(new JLabel("Quantidade de camisas Médias:"));
      myPanel.add(mediasTF);
      myPanel.add(new JSeparator());
      myPanel.add(new JLabel("Quantidade de camisas Grandes:"));
      myPanel.add(grandesTF);

      // Exibição do painel de inserção
      int result = JOptionPane.showConfirmDialog(
              null,
              myPanel, 
              "Inserir a quantidade de camisas",
              JOptionPane.OK_CANCEL_OPTION
      );
      
      // Quando os valores forem inseridos, realiza os cálculos de valores
      if (result == JOptionPane.OK_OPTION) {
        pequenas = Integer.parseInt(pequenasTF.getText())*10;
        medias = Integer.parseInt(mediasTF.getText())*12;
        grandes = Integer.parseInt(grandesTF.getText())*15;
        
        // Soma do total arrecadado
        arrecadado = pequenas+medias+grandes;
        
        // Apresentação do resultado
        String resultado = String.format("O valor arrecadado é: %d", arrecadado);
        JOptionPane.showMessageDialog(null, resultado);
      }
        
    }
}
