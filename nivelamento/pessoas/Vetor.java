package nivelamento.pessoas;

import java.util.Arrays;

public class Vetor <G>{
   // Atributos
    protected G[] elementos;
    private int tamanho;
    private int tamanhoFixo;
    // Métodos Especiais
    public Vetor(int capasidade){
        this.elementos = (G[]) new Object[capasidade];
        this.tamanhoFixo = capasidade;
    }
    public Vetor(G[] elementos) {
        this.elementos = elementos;
        this.tamanhoFixo = elementos.length;
    }
    // Métodos
    public void adiciona(G elemento){
        try{
            this.elementos[this.getTamanho()] = elemento;
            this.tamanho++;
        }catch (IndexOutOfBoundsException e){
            this.elementos = this.recriarVetorDuplicado(this.elementos);
            this.adiciona(elemento);
            this.tamanhoFixo++;
        }
    }

    public boolean adicionaSemDuplicidade(G elemento){
        if(!this.verificarDuplicidade(elemento)){
            this.adiciona(elemento);
            return true;
        }

        return false;
    }

    public void remover(G elemento) throws IllegalArgumentException{

        int posicao = this.pergarPosicao(elemento);

        if(posicao < 0){
            throw new IllegalArgumentException("O elemento não existe no vetor");
        }
        else if(posicao >= 0 && posicao < this.tamanhoFixo){
            for (int i = this.pergarPosicao(elemento); i < this.tamanho; i++) {
                this.elementos[i] = this.elementos[i+1];
            }
        }else{
            this.elementos[posicao] = null;
        }

        this.tamanhoFixo = this.tamanhoFixo - 1;
        this.tamanho = this.tamanho -1;
    }

    public int pergarPosicao(G elemento){
        return this.pergarPosicao(elemento, this.elementos.length -1);
    }

    private int pergarPosicao(G elemento, int index){
        final int LASTE_INDEX = ((this.elementos.length -1)-index);

        if(index > (this.elementos.length-1) / 2 ){
            if( this.elementos[index] != null && this.elementos[index].equals(elemento) ){
                return index;
            }else if( this.elementos[LASTE_INDEX] != null && this.elementos[LASTE_INDEX].equals(elemento) ){
                return LASTE_INDEX;
            }

            return this.pergarPosicao(elemento, index - 1);
        }

        return -1;
    }

    public void adiciona(G elemento, int key) throws IllegalArgumentException{
        if(key < this.tamanhoFixo && key >= 0){
            this.elementos[key] = elemento;
        }else{
            throw new IllegalArgumentException("A posição "+key+" não existe no vetor");
        }
    }

    public boolean verificarDuplicidade(G elemento){
        return this.verificarDuplicidade(this.elementos, elemento, this.tamanhoFixo-1);
    }

    private boolean verificarDuplicidade(G[] vetor, G elemento, int index){
        final int LASTE_INDEX = ((vetor.length -1)-index);

        if(index >= (vetor.length-1) / 2 ){
            return ( (vetor[index] != null && vetor[index].equals(elemento)) || (vetor[LASTE_INDEX] != null && vetor[LASTE_INDEX].equals(elemento)) ) ? true : this.verificarDuplicidade(vetor, elemento, index-1);
        }

        return false;
    }

    public G buscar(int key) throws IllegalArgumentException{
        if( !( key <= this.tamanhoFixo && key >= 0) ){
            throw new IllegalArgumentException("A posição "+key+" não existe no vetor");
        }

        return this.elementos[key];
    }

    public int buscar(G elemento){
        for (int i = 0; i < this.tamanhoFixo; i++) {
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }

        return -1;
    }

    /**
     * @param vetorOriginal Recebe o vetor que deverá ser duplicado
     * @return retorna um vetor
     */
    public G[] recriarVetorDuplicado(G[] vetorOriginal){
        // Duplica o vetor e passa para o método recriarVetor que é responsavel por fazer a logíca para colocar os elemenos no novo vetor
        G[] novoVetor = (G[]) new Object[vetorOriginal.length * 2];
        return this.recriarVetor(novoVetor, vetorOriginal, vetorOriginal.length-1);
    }

    private G[] recriarVetor(G[] novoVetor, G[] vetorOriginal, int index){

        final int LASTE_INDEX = ((vetorOriginal.length -1)-index);

        if(index >= (vetorOriginal.length -1) / 2 ){
            novoVetor[index] = this.elementos[index];
            if(index != LASTE_INDEX){
                novoVetor[LASTE_INDEX] = this.elementos[LASTE_INDEX];
            }

            return this.recriarVetor(novoVetor,vetorOriginal, index-1);
        }

        return novoVetor;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanhoFixo +
                '}';
    }
}
