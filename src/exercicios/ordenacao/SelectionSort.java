package exercicios.ordenacao;

public class SelectionSort implements IOrdenacao {
    @Override
    public int[] ordenar(int[] valores) {
        int menor_index, aux;

        for (int i = 0; i < valores.length-1; i++) {
            menor_index = i;
            for (int j = i; j < valores.length; j++) {
                if(valores[j] < valores[menor_index]){
                    menor_index = j;
                }
            }

            if(valores[i] > valores[menor_index]){
                aux = valores[i];
                valores[i] = valores[menor_index];
                valores[menor_index] = aux;
            }
        }

        return valores;
    }
}
