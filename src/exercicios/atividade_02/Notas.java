package exercicios.atividade_02;

import java.util.Scanner;

public class Notas {
    public static Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        int[] values = readValues(getLength());

        System.out.println("Média: "+ String.format("%.2f", getMedia(values)));
        System.out.println("Maior: "+ getMaior(values));
    }

    /**
     * Função para pegar o tamanho do vetor
     * @return tamnho do vetor
     */
    public static int getLength(){
        System.out.printf("Digite o total de elementos: ");

        return INPUT.nextInt();
    }

    /**
     * Função para criar um vetor e preencher o vetor com os dados do usuario
     * @param length tamanho do vetor
     * @return
     */
    public static int[] readValues(int length){
        int[] values = new int[length];

        for (int i = 0; i < values.length; i++) {
            System.out.printf("["+i+"] - Digite um valor inteiro: ");
            values[i] = INPUT.nextInt();
        }

        return values;
    }

    /**
     * Função para pegar a média dos valores do vetor
     * @param vetor vetor com os elementos
     * @return média dos valores
     */
    public static float getMedia(int[] vetor){
        int total = 0;

        for (int number: vetor) {
            total += number;
        }

        return total/vetor.length;
    }

    /**
     * Função para pegar o maior valor de um vetor
     * @param vetor vetor com os elementos
     * @return maior valor no vetor
     */
    public static int getMaior(int[] vetor){
        int maior = vetor[0];

        for (int number: vetor) {
            if(number > maior){
                maior = number;
            }
        }

        return maior;
    }
}
