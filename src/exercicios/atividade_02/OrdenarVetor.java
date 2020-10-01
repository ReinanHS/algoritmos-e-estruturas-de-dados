package exercicios.atividade_02;

import java.util.Arrays;

public class OrdenarVetor {
    public static void main(String[] args) {
        int[] vetor = {1,9,14,20,7,6,12,13,70,5,3,4,90};

        System.out.println(Arrays.toString(ordenar(vetor)));
    }

    /**
     * Função para ordenar um vetor
     * @param valores vetor com os elementos
     * @return vetor ordenado
     */
    public static int[] ordenar(int[] valores){
        int cache_value = 0;
        boolean edit = false;

        for (int i = 0; i < (valores.length-1); i++) {
            for (int j = 0; j < valores.length; j++) {
                if( valores[i+1] < valores[j]  ){
                    cache_value = valores[i+1];

                    valores[i+1] = valores[j];
                    valores[j] = cache_value;

                    edit = true;
                }
            }

            if(!edit) break;
        }

        return valores;
    }
}
