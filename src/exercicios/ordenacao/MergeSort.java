package exercicios.ordenacao;

public class MergeSort{
    public int[] valores;

    public int[] ordenar(int[] valores){
        this.valores = valores;
        int[] tempArray = new int[valores.length];
        this.mergeSort(tempArray, 0, valores.length-1);

        return this.valores;
    }
    public void mergeSort(int[] valores, int inicio, int fim) {
        if(inicio == fim){
            return;
        }

        int meio = (fim + inicio) / 2;
        this.mergeSort(valores, inicio, meio);
        this.mergeSort(valores, meio+1, fim);
        this.merge(valores, inicio, meio+1, fim);
    }

    public void merge(int[] arrayToFix, int lowerIndexCursor, int higherIndex, int upperIndex){
        int tempIndex = 0;
        int lowerIndex = lowerIndexCursor;
        int midIndex = higherIndex-1;
        int total = upperIndex - lowerIndex +1;

        while (lowerIndex <= midIndex && higherIndex <= upperIndex){
            if(this.valores[lowerIndex] < this.valores[higherIndex]){
                arrayToFix[tempIndex++] = this.valores[lowerIndex++];
            }else{
                arrayToFix[tempIndex++] = this.valores[higherIndex++];
            }
        }

        while (lowerIndex <= midIndex){
            arrayToFix[tempIndex++] = this.valores[lowerIndex++];
        }

        while (higherIndex <= upperIndex){
            arrayToFix[tempIndex++] = this.valores[higherIndex++];
        }

        for (int i = 0; i < total; i++) {
            this.valores[lowerIndexCursor+i] = arrayToFix[i];
        }
    }
}
