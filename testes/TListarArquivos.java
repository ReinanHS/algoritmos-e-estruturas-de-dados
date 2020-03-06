package testes;

import reculsividade.ListarArquivos;

import java.io.File;

public class TListarArquivos {
    public static void main(String[] args) {
        File file = new File("C:\\Program Files");
        ListarArquivos.listaFilesComLimit(file, 5);
    }
}
