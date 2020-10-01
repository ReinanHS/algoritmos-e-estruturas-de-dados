package exercicios.atividade_02;

import java.util.Arrays;

public class ListaValores {
    public static void main(String[] args) {
        // Pegar os valores pelo input do usuário
        //int[] lista = Notas.readValues(Notas.getLength());
        // Pegar os valores de forma automática
        int[] lista = {1,9,14,20,7,6,12,13,70,5,3,4,90};

        System.out.println("Maiores que 10: "+ Arrays.toString(getMaiores(lista, 10)));
        System.out.println("Ímpares: "+ Arrays.toString(getImpares(lista)));
        System.out.println("Médio maiores que 10: "+ String.format("%.2f", Notas.getMedia(getMaiores(lista, 10))) );
    }

    /**
     * Função para obter os valores de um vetor que são maiores ou iguais ao parâmetro max
     * @param vetor vetor com os elementos
     * @param max valor máximo
     * @return vetor com os valores
     */
    public static int[] getMaiores(int[] vetor, int max){
        int index = 0;

        for (int number: vetor) {
            if(number >= max) index++;
        }

        if(index <= 0) return new int[0];

        int[] maiores = new int[index];
        index = 0;

        for (int number: vetor) {
            if(number >= max) {
                maiores[index] = number;
                index++;
            };
        }

        return maiores;
    }

    /**
     * Função para pegar os número ímpares de um vetor
     * @param vetor vetor com os elementos
     * @return números ímpares
     */
    public static int[] getImpares(int[] vetor){
        int index = 0;

        for (int number: vetor) {
            if(number % 2 != 0) index++;
        }

        if(index <= 0) return new int[0];
        int[] impares = new int[index];
        index = 0;

        for (int number: vetor) {
            if(number % 2 != 0) {
                impares[index] = number;
                index++;
            }
        }

        return impares;
    }
}
