package exercicios.ordenacao;

public class InsertionSort implements IOrdenacao {
    public int[] ordenar(int[] valores) {
        int eleito, j;

        for (int i = 0; i < valores.length; i++) {
            eleito = valores[i];
            j = i -1;

            while (j >= 0 && valores[j] > eleito){
                valores[j+1] = valores[j];
                j = j -1;
            }

            valores[j+1] = eleito;
        }

        return valores;
    }
}
