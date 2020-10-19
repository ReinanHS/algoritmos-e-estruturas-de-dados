package exercicios.ordenacao;

import java.util.Arrays;
import java.util.Random;

public class Ordenacao {
    public static void main(String[] args) {
        int[] valores = {9,6,3,4,8,2,1,7,0,10};
        int[] valores_ordenado = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] valores_random = new int[10];

        for (int i = 0; i < valores_random.length; i++) {
            valores_random[i] = new Random().nextInt(100);
        }

        InsertionSort insertionSort = new InsertionSort();
        BublleSort bublleSort = new BublleSort();
        SelectionSort selectionSort = new SelectionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        System.out.println(Arrays.toString(valores));
        // InsertionSort
//        System.out.println(Arrays.toString(insertionSort.ordenar(valores)));
//        System.out.println(Arrays.toString(insertionSort.ordenar(valores_ordenado)));
//        System.out.println(Arrays.toString(insertionSort.ordenar(valores_random)));

        //System.out.println("\n");
        // BublleSort
//        System.out.println(Arrays.toString(bublleSort.ordenar(valores)));
//        System.out.println(Arrays.toString(bublleSort.ordenar(valores_ordenado)));
//        System.out.println(Arrays.toString(bublleSort.ordenar(valores_random)));

        //System.out.println("\n");
        // SelectionSort
//        System.out.println(Arrays.toString(selectionSort.ordenar(valores)));
//        System.out.println(Arrays.toString(selectionSort.ordenar(valores_ordenado)));
//        System.out.println(Arrays.toString(selectionSort.ordenar(valores_random)));

        //System.out.println("\n");
        // MergeSort
//        System.out.println(Arrays.toString(mergeSort.ordenar(valores)));
//        System.out.println(Arrays.toString(mergeSort.ordenar(valores_ordenado)));
//        System.out.println(Arrays.toString(mergeSort.ordenar(valores_random)));

        //System.out.println("\n");
        // QuickSort
        System.out.println(Arrays.toString(quickSort.ordenar(valores)));
    }
}
