package testes;

import reculsividade.Lista;

public class DuplicaVetor {
    public static void main(String[] args) {
        Lista<Integer> vetor = new Lista<>();
        vetor.add(5);
        vetor.add(6);
        vetor.add(7);
        vetor.add(8);
        vetor.add(9);
        vetor.add(10);
        vetor.add(11);
        vetor.add(12);
        vetor.add(13);

        vetor.delete(8);

        System.out.println(vetor.find(6));
    }
}
