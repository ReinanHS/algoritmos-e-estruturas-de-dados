package reculsividade;

import java.util.Arrays;

public class EncomtrarPosicao {

    public static int total = 0;

    public static void main(String[] args) {
        int vetor[] = new int[100];
        int cont = 50;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = cont;
            cont++;
        }

        int numeroDoUsuario = 87;

        System.out.println(Arrays.toString(vetor));
        int [] result = acharPosicaoDivisao(vetor, numeroDoUsuario);

        System.out.println("Posição no vetor: "+result[1]);
        System.out.println("Tentativas: "+result[0]);

        int media = 0;

//        for (int valor: vetor) {
//            int[] result = acharPosicaoDivisao(vetor, valor, primeira, ultima, 0);
//            System.out.println("Posição no vetor: "+result[1]);
//            System.out.println("Tentativas: "+result[0]);
//            media += result[0];
//        }
//
//        media = media / vetor.length;
//
//        System.out.println("Média: "+media);
    }

    public static int[] acharPosicaoDivisao(int[] vetor, int n){
        int primeira = 0;
        int ultima = vetor.length-1;

        return acharPosicaoDivisao(vetor, n, primeira, ultima, 1);
    }

    public static int[] acharPosicaoDivisao(int[] vetor, int n, int p, int u, int tentativas){
        int result[] = new int[2];
        result[0] = tentativas;

        if(Math.round(vetor[ ((p+u)/2) ]) == n){
            result[1] = Math.round( ((p+u)/2) );
            return result;
        }
        else if(vetor[p] == n){
            result[1] = p;
            return result;
        }
        else if(vetor[u] == n){
            result[1] = u;
            return result;
        }
        else if(vetor[Math.round(((p+u)/2))] < n ){
            return acharPosicaoDivisao(vetor, n, Math.round(((p+u)/2))+1, u, tentativas+1);
        }

        return acharPosicaoDivisao(vetor, n, p, Math.round(((p+u)/2))-1, tentativas+1);
    }
}
