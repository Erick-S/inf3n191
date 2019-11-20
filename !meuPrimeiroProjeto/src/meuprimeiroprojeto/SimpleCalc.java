package meuprimeiroprojeto;

import java.util.Scanner;
/**
 * @author Erick-S
 */
public class SimpleCalc {

    public static void main(String[] args) {
        int a, b, calc;
        float result = 0;
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite o valor de a:");
        a = read.nextInt();
        
        System.out.print("Digite o valor de b:");
        b = read.nextInt();
        
        System.out.print("Escolha o tipo de operação:"
                + "\n1: Soma;"
                + "\n2: Subtração;"
                + "\n3: Multiplicação;"
                + "\n4: Divisão."
                + "\nDigite o valor:");
        calc = read.nextInt();
        System.out.println("Valor de A: "+a+"\nValor de B: "+b);
        switch(calc){
            case 1: result = a+b; break;
            case 2: result = a-b; break;
            case 3: result = a*b; break;
            case 4: result = ((float)a/b); break; //if not parsed, and a<b result == 0
        }
        System.out.println("O resultado é: "+result);
    }
    
}