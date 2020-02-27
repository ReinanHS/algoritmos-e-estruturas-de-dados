package reculsividade;

import java.io.File;
import java.util.Arrays;

public class ListarArquivos {
    public static void main(String[] args) {
        File file = new File("C:\\Program Files");
        //System.out.println(Arrays.toString(file.listFiles()));
        //File files[] = file.listFiles();
        //System.out.println(files[2].getAbsolutePath() );

        ListaFiles(file);

    }

    public static void ChamarFuncao(File[] files, int index){
        if(index < files.length){
            ListaFiles(files[index]);
            ChamarFuncao(files, index + 1);
        }
    }

    public static void ListaFiles(File file){
        if( file.isDirectory()){

            System.out.println("Diretorio: "+file.getAbsolutePath());

            try{
                ChamarFuncao(file.listFiles(), 0);
            }catch (NullPointerException e){
                //
            }
        }else{
            System.out.println("File: "+file.getAbsolutePath());
        }
    }
}
