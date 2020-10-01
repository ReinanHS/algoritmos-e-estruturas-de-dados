package exercicios.atividade_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidarIdade {
    public static void main(String[] args) {
        permissionsByIdade(getIdade());
    }

    /**
     * Função para pegar a idade do usuário com as com validações
     * @return idade do usuário
     */
    public static byte getIdade(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite sua idade: ");

        try{
            byte idade = input.nextByte();

            if (idade <= 0){
                System.out.println("Idade inválida, digite novamente.");
                return getIdade();
            }

            return idade;
        }catch (InputMismatchException exception){
            System.out.println("Idade inválida, digite novamente.");
            return getIdade();
        }
    }

    /**
     * Função para saber as permissões que uma pessoa tem com base na idade
     * @param idade idade do usuário
     */
    public static void permissionsByIdade(byte idade){

        if(idade < 16){
            System.out.println("Voto eleitoral: Não tem permissão");
        }
        else if(idade >= 16 && idade < 18){
            System.out.println("Voto eleitoral: Não é obrigatorio");
        }else if(idade >= 18){
            System.out.println("Voto eleitoral: Obrigatorio");
        }

        if(idade < 18){
            System.out.println("Carteira de motorista: Não tem permissão");
        }else{
            System.out.println("Carteira de motorista: Tem permissão");
        }
    }
}
