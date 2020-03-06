package reculsividade;

import java.io.File;

public class ListarArquivos {
    /*
    *   Função responsável por chamar a função ListarFiles de forma recursiva
    */
    private static void chamarFuncao(File[] files, int index){
        if(index < files.length){
            listaFiles(files[index]);
            chamarFuncao(files, index + 1);
        }
    }

    /*
    *   Função para imprimir arquivos e pastas a partir de um determinado diretório
     */
    public static void listaFiles(File file){
        // Verifica se o diretório que foi passado é uma pasta ou arquivo
        if( file.isDirectory()){

            System.out.println("Diretorio: "+file.getAbsolutePath());

            try{
                // Função responsável por percorrer o vetor e chamar a função de forma recursiva
                chamarFuncao(file.listFiles(), 0);
            }catch (NullPointerException e){
                //
            }
        }else{
            System.out.println("File: "+file.getAbsolutePath());
        }
    }
}
