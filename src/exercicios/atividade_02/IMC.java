package exercicios.atividade_02;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        double[] inputs = getInputs();
        double resultado = calculo(inputs[0], inputs[1]);

        System.out.println("SEU IMC: "+ formartIMC(resultado));
        System.out.println("SUA CLASSIFICAÇÃO: "+ getClassificacao(resultado));
    }

    /**
     * Essa função é responsavel por calcular o IMC(Índice de Massa Corpórea)
     *
     * @param altura Altura da pessoa, este parâmetro é obrigatório.
     * @param peso Peso da pessoa, este parâmetro é obrigatório.
     *
     * @return Resultado do IMC
     *
     */
    public static double calculo(double altura, double peso){
        return (peso / (altura * altura));
    }

    /**
     * Função para formatar os dados
     * @param imc Índice de Massa Corpórea
     * @return texto com o valor formatado
     */
    public static String formartIMC(double imc){
        return String.format("%.2f", (float) imc);
    }

    /**
     * Função para retornar a situação com base no IMC
     *
     * @param imc Índice de Massa Corpórea, este parâmetro é obrigatório.
     * @return classificação com base no IMC
     */
    public static String getClassificacao(double imc){

        if(imc < 18.5){
            return "Magreza";
        }else if(imc >= 18.5 && imc <= 24.9){
            return "Normal";
        }else if(imc >= 25.0 && imc <= 29.9){
            return "Sobrepeso";
        }else if(imc >= 30.0 && imc <= 39.9){
            return "Obesidade";
        }else{
            return "Obesidade Grave";
        }

    }

    /**
     * Função para ler os dados do usuário
     * @return valores
     */
    public static double[] getInputs(){
        double[] valores = new double[2];

        Scanner input = new Scanner(System.in);

        try{

            System.out.printf("Digite sua altura: ");
            valores[0] = Double.parseDouble(input.next());

            System.out.printf("Digite seu peso: ");
            valores[1] = Double.parseDouble(input.next());

            return valores;

        }catch (NumberFormatException exception){
            System.out.printf("O valor que você inseriu é inválido, digite novamente.");
            return getInputs(valores);
        }
    }

    /**
     * Função para tratamento de erros ao obter dados do usuário
     * @param valores inputs do usuário
     * @return valores
     */
    public static double[] getInputs(double[] valores){
        Scanner input = new Scanner(System.in);

        try{

            if(valores[0] <= 0){
                System.out.printf("\nDigite sua altura: ");
                valores[0] = Double.parseDouble(input.next());
            }else{
                System.out.printf("\nDigite seu peso: ");
                valores[1] = Double.parseDouble(input.next());
            }
            return valores;

        }catch (NumberFormatException exception){
            System.out.println("O valor que você inseriu é inválido, digite novamente.");
            return getInputs(valores);
        }
    }
}
