package exercicios;

/**
 *
 * Conceitos básicos de arrays em Java
 * 
 * Suas posições começam a partir do endereço [0] (O primeiro) e terminam em
 * valor de tamanho-1. Exemplo: int[] a = new int[3] tem os endereços 
 * [0], [1] e [2]. Poderá automatizar algumas interações com arrays utilizando
 * a expressão for(){}, onde o valor iterado poderá, por exemplo, começar com
 * o valor 0 e terminar quando for maior ou igual ao tamanho do array
 * (utilizando a propriedade .length do array), incrementando o valor ao término
 * do ocorrido.
 * 
 */
public class arraysConceitos{
    
    public static void main(String[] args){
        
        // Novo array, declarado em uma única linha
        int[] a = new int[4];
        
        // Novo array, declarado separadamente
        int[] b;
        b = new int[10];
        
        // Novos arrays, instanciados na mesma linha
        int[] r = new int[44], k = new int[23];
        
        // Novos arrays, instanciados na mesma linha (Identado)
        int[] r1 = new int[44],
              k1 = new int[23];
        
        // Novo array, inicializado com seus valores diretamente (Identado)
        int[] iniciaValores = { 12, 32, 54, 6, 8, 89, 64, 64, 6 };
        
        // Novo array, inicializado com seus valores diretamente (Identado)
        int[] iniciaValores1 = {
            12,
            32,
            54,
            6,
            8,
            89,
            64,
            64,
            6
        };
        
        // Novo array, declarado separadamente
        int[] meuArray;
        meuArray = new int[10];
        
        // Cada célula é inserida separadamente
        meuArray[0] = 100;
        meuArray[1] = 85;
        meuArray[2] = 88;
        meuArray[3] = 93;
        meuArray[4] = 123;
        meuArray[5] = 952;
        meuArray[6] = 344;
        meuArray[7] = 233;
        meuArray[8] = 622;
        meuArray[9] = 8522;
        // meuArray[10] = 564; // ArrayOutOfBounds
        
        // Exibe o valor da 10ª posição da variável 'meuArray'
        System.out.println(meuArray[9]);
        
        // Exibe o valor da 3ª posição da variável 'meuArray'
        System.out.println(meuArray[2]);
        
    }
    
}
