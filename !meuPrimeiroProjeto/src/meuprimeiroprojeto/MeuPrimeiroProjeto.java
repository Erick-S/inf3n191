/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiroprojeto;

import java.util.Scanner;
/**
 *
 * @author Erick-S
 */
public class MeuPrimeiroProjeto {
    
    public static void main(String[] args){
        // Meu "primeiro" código
        int n1, n2;
        Scanner r = new Scanner(System.in);
        System.out.print("Digite o valor de N1: ");
        n1 = r.nextInt();
        System.out.print("Digite o valor de N2: ");
        n2 = r.nextInt();
        if(n1==n2){
            System.out.println("N1 == N2");
        }else if (n1>n2){
            System.out.println("N1 > N2");
        }else if(n1<n2){
            System.out.println("N1 < N2");
        }
    }
    
}
