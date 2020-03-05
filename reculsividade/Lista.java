package reculsividade;

public class Lista<G> {
    // Atributos
    private G[] vetor;
    private int cont = 0;

    // Métodos Especiais
    public Lista(G[] vetor) {
        this.vetor = vetor;
    }

    public Lista(){
        this.vetor = (G[]) new Object[5];
    }

    // Função para adicionar no vetor
    public void add(G item){
        try{
            this.vetor[this.cont] = item;
            this.cont++;
        }catch (IndexOutOfBoundsException ex){
            this.duplicarVetor();
            this.add(item);
        }
    }

    // Função para recriar um vetor
    private void duplicarVetor(){
        G[] novoVetor = (G[]) new Object[this.vetor.length*2];
        this.vetor = this.duplicarVetor(novoVetor, 0);
    }
    private G[] duplicarVetor(G[] novoVetor, int index){
        if(index < this.cont){
            novoVetor[index] = this.vetor[index];
            return this.duplicarVetor(novoVetor, index +1);
        }

        return novoVetor;
    }

    // Função para achar um item no vetor
    public int find(G item){
        return this.find(item, 0);
    }

    private int find(G item, int index){
        if(index < this.cont){
            return (this.vetor[index].equals(item)) ? index : this.find(item, index+1);
        }

        return -1;
    }

    // Função para remover um item pela posição
    public void deleteByKey(int key){
        if(this.cont > 0 && key >= 0 && key < this.cont){
            this.vetor[key] = this.vetor[(this.cont-1)];
            this.vetor[(this.cont-1)] = null;
            this.cont--;
        }else new Exception("Posição invalida");
    }

    // Função para remover um item por outro item
    public void delete(G item){
        this.deleteByKey(this.find(item));
    }

    // Função para listar


}
