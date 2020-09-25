## Lista de Nivelamento

- Os códigos deverão ser enviados para o bitbucket
- E permitido o uso de códigos próprios.
- Não será permitido o uso de coleções implementadas pelo Java, como ArrayList.

1. Um palíndromo é uma palavra (ou frase) que possui a propriedade de poder ser lida tanto da direita para a esquerda como da esquerda para a direita. Exemplos de palíndromos: aça, ama, arara e reter. Faça uma função que recebe como parâmetro uma palavra (ou frase) e retorne verdadeiro caso a palavra seja um palíndromo, no contrário retorne falso.

2. Faça um programa que calcula a quantidade de vezes que é necessária para resolver o fatorial de um número X.

3. Faça uma programa para armazenar as informações de 10 pessoas. Sabe-se que:
  - o CPF de uma pessoa é único e não há repetições no Brasil;
  - a aplicação deverá aceitar qualquer ordem de inserção.
  - é permitida a remoção de uma pessoa com base no CPF.

```java
  public class Pessoa {
    String nome;
    String sobrenome;
    String CPF;
    public String getNomeCompleto ( ) { . . . }
    public String getCPF ( ) { . . . }
    public String setNome ( ) { . . . }
    public String setSobrenome ( ) { . . . }
    public String setCPF ( ) { . . . }
 }
```

4. Altere o programa anterior para permitir obter a idade de uma pessoa.

5. Altere o programa anterior para permitir incluir mais de 10 pessoas.
  - Garanta que expansão da capacidade será dobrada automaticamente quando for necessário mais espaço para armazenar um novo cadastro de pessoa.

6. Altere o programa para permitir a inclusão de filhos na lista de pessoas, conforme a estrutura abaixo:
```java
public class Pessoa {
 String nome ;
 String sobrenome ;
 String CPF;
 public String getNomeCompleto ( ) { . . . }
 public String getCPF ( ) { . . . }
 public String setNome ( ) { . . . }
 public String setSobrenome ( ) { . . . }
 public String setCPF ( ) { . . . }
}

public class Filho extends Pessoa {
  String CPFPai;
  String CPFMae;
  public Filho ( String CPFMae) {. . . .}
  public Filho ( String CPFMae, String CPFPai ) {. . . .}
}
```

O programa deverá garantir que:
  - Todo filho tem uma mãe conhecida e previamente cadastrada;
  - Existem filhos que não tem pai;
  - Os dados de uma pessoa e de filhos são armazenados na mesma lista.
  - Quando uma mãe é removida, os seus filhos também são removidos.

7. Altere o programa anterior para exibir um relatório, com nome e idade, conforme solicitação abaixo:
  - dos filhos de uma determinada mãe;
  - de todos os filhos que foram cadastrados;
  - das pessoas que n ̃ao tem filhos;
  - das pessoas que fazem anivers ́ario em uma determinada data.

8. Altere o programa anterior para informar quantas pessoas estão entre:
  - 0 e 10 anos
  - 11 e 17
  - 18 e 64
  - 65 anos ou mais.

9. Altere o programa anterior para permitir salvar e ler os dados salvos que foram digitados.

10. Faça um programa que resolve as seguintes fórmulas:
  - ```f(x) = 2(x)!/(x − 1)!```
  - A série de Fibonacci ```f(n) = f(n − 1) + f(n − 2)```, sendo os valores iniciais de ```f(1) = 0``` e ```f(2) = 1```

11. Dado um vetor com 10 elementos inteiros, ache:
  - O fatorial de cada um dos números;
  - A quantidade de vezes que o fatorial é menor que a média dos elementos do vetor;
  - A quantidade de vezes que um elemento é  ímpar e seu fatorial é par com valor acima da média dos elementos do vetor.

12. Faça um programa que recebe um vetor com 10 elementos e realiza a ordenação em:
  - ordem crescente;
  - ordem decrescente.

13. Faça um programa que recebe dois vetores de inteiros e:
  - Realiza a união deles;
  - Ordena cada um deles;