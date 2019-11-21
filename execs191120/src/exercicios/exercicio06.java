/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Erick-S
 */

//Exercício
//Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma
//sendo vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em
//que o usuário forneça a quantidade de camisetas pequenas, médias e grandes 
//referentes a uma venda, e a máquina informe quanto será o valor arrecadado 
public class exercicio06 {
    public static void main(String[] args){
      
      int pequenas, medias, grandes, arrecadado;
        
      JTextField pequenasTF = new JTextField(5);
      JTextField mediasTF = new JTextField(5);
      JTextField grandesTF = new JTextField(5);

      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("Quantidade de camisas Pequenas:"));
      myPanel.add(pequenasTF);
      myPanel.add(new JSeparator());
      myPanel.add(new JLabel("Quantidade de camisas Médias:"));
      myPanel.add(mediasTF);
      myPanel.add(new JSeparator());
      myPanel.add(new JLabel("Quantidade de camisas Grandes:"));
      myPanel.add(grandesTF);

      int result = JOptionPane.showConfirmDialog(null, myPanel, 
               "Inserir a quantidade de camisas", JOptionPane.OK_CANCEL_OPTION);
      if (result == JOptionPane.OK_OPTION) {
        pequenas = Integer.parseInt(pequenasTF.getText())*10;
        medias = Integer.parseInt(mediasTF.getText())*12;
        grandes = Integer.parseInt(grandesTF.getText())*15;
        arrecadado = pequenas+medias+grandes;
        String resultado = String.format("O valor arrecadado é: %d", arrecadado);
        JOptionPane.showMessageDialog(null, resultado);
      }
        
    }
}
