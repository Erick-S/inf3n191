DESCRIÇÃO
=========

Este 'programa' irá criar um 'campeonato' de 'futebol' onde 8 times irão 'competir' entre si. o 'Jogo' é uma simples comparação de pontuação ('Gol' ou 'Penalti'), onde poderá ganhar um time, ou ambos empatarem.

Métodos (Funções)
-----------------

Como o código utilizaria uma grande quantidade de código repetido, foram criados métodos (ou funções) para facilitar a compreensão e escrita do jogo, assim como facilitar alterações (Como adicionar ou remover times).

### Ler'X'(String texto)

Método que utiliza uma caixa de diálogo (javax.swing.JOptionPane.showInputDialog()) para que o usuário possa inserir um texto (Com a função **LerTexto(texto)**) ou um número inteiro (Com a função **LerNumero(texto)**).

* String **texto**: é uma mensagem que será exibida na caixa de diálogo, podendo auxiliar o usuário a entender o que está sendo requisitado.

Exemplo:

```java
// Uma caixa de diálogo irá aparecer informando 
// 'Insira aqui o seu texto', e o usuário poderá inserir 
// no campo vazio um conjunto de caracteres.
String meuTexto = LerTexto("Insira aqui o seu texto");

// Uma caixa de diálogo irá aparecer informando 
// 'Digite aqui um número', onde o usuário poderá 
// digitar um número. Como a caixa de diálogo retorna 
// uma variável do tipo **String**, o resultado é convertido 
// para **int**, portanto se inserir um caractere que não seja 
// um dígito, poderá ter um erro durante execução.
int meuNumero = LerNumero("Digite aqui um número");
```

### ExibirTexto(String texto)

Método semelhante ao anterior, porém não requisita uma inserção do usuário. Utilizado para informar o que está acontecendo ou para avisar o usuário de algo.

Exemplo:

```java
// Aparecerá uma caixa de diálogo informando 'Olá!'.
ExibirTexto("Olá!");
```

### Jogo(String time1, String time2, boolean prorrogacao)

**VÁRIAVEL TIPO 'boolean' -> é um valor lógico que poderá ser VERDADEIRO ('true') ou FALSO ('false').**

Método que contém a lógica do jogo, onde será informado o nome de dois times e se o jogo terá ou não prorrogação. O método retornará o nome do time vencedor como uma String.

A lógica do programa segue a seguinte lógica:

* A função requisitará o número de gols dos times;
* A função irá comparar o número de gols dos times e retornará o vencedor, caso o número de gols de um time for maior que o de outro;
* Caso ocorrer um empate, o programa irá seguir um de dois caminhos:
	* Caso o jogo permitir prorrogações, a função irá ser utilizada novamente, desta vez sem prorrogações;
	* Caso o jogo não permitir prorrogações, a função de Penalti(String, String) será utilizada.
* O nome do vencedor será retornado como uma String.

Exemplo:
```java
// Este é um exemplo de um jogo sem prorrogação.
String vencedor = Jogo("Time A", "Time B", false);
// Caso o usuário inserir o número de gols para 
// Time A com o valor de 1, e o de Time B com o 
// valor de 2, vencedor terá o valor de "Time B".
```

### Penalti(String time1, String time2)

Método que contém a lógica dos pênaltis. Caso um Jogo(String, String, false) empatar, esta função será executada com o nome dos dois times.

Como regra, um Penalti não poderá terminar em empate, portanto caso isto ocorrer, a função irá ser utilizada novamente.

Assim como Jogo, a função irá retornar o nome do time vencedor.

Exemplo:

```java
// Exemplo semelhante a jogo, sem prorrogação.
String vencedor = Jogo("Time A", "Time B", false);
// Os valores de gols para Times A e B são 1 e 1, respectivamente.
// Durante a comparação dos gols, a função de Jogo irá informar o 
// usuário que "Este jogo terá pênaltis", e irá utilizar a função Penalti
// A função penalti é semelhante a Jogo, porém ele irá pedir os 
// "Penaltis" dos times, ao invés dos "Gols".
// Caso os valores empatarem, deverá informar novamente os valores.
```