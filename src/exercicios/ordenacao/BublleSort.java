package exercicios.ordenacao;

public class BublleSort implements IOrdenacao {
    @Override
    public int[] ordenar(int[] valores) {
        boolean troca = false;
        int aux;

        for (int i = 0; i < (valores.length - 1); i++) {
            for (int j = 0; j < valores.length; j++) {
                if(valores[j] > valores[i+1]){
                    aux = valores[i+1];

                    valores[i+1] = valores[j];
                    valores[j] = aux;

                    troca = true;
                }
            }

            if(!troca) break;
        }

        return valores;
    }
}
