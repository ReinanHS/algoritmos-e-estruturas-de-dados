package reculsividade;

import java.io.File;

public class ListarArquivos {
    private static boolean isStop = false;
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
     *   Função responsável por chamar a função ListarFiles de forma recursiva com limit
    */
    private static void chamarFuncao(File[] files, int index, int limit, int total){
        if(index < files.length && total <= limit){

            int cont = (files[index].isFile()) ? total + 1 : total;

            listaFiles(files[index], limit, cont);
            if(!isStop){
                chamarFuncao(files, index + 1, limit, cont);
            }
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
    /*
    * Função para imprimir arquivos e pastas a partir de um determinado diretório com limit
    */
    public static void listaFilesComLimit(File file, int limit){
        isStop = false;
        listaFiles(file, limit, 0);
    }

    private static void listaFiles(File file, int limit, int total){
        // Verifica se o diretório que foi passado é uma pasta ou arquivo
        if(total <= limit){
            if( file.isDirectory()){

                System.out.println("Diretorio: "+file.getAbsolutePath());

                try{
                    // Função responsável por percorrer o vetor e chamar a função de forma recursiva
                    chamarFuncao(file.listFiles(), 0, limit, total);
                }catch (NullPointerException e){
                    //
                }
            }else{
                System.out.println("File: "+file.getAbsolutePath());
            }
        }else {
            isStop = true;
            System.out.println("Total: "+(total-1)+"\n\n");
        }
    }
}
