package nivelamento.pessoas;

public class RepositorioDePessoas {
    public static void main(String[] args) {
        Vetor<Pessoa> pessoas = new Vetor<>(5);

        Pessoa reinan = new Pessoa("Reinan", "Gabriel", "78-45");
        Pessoa lucas = new Pessoa("Lucas", "Santos", "75-45");
        Pessoa gabriel = new Pessoa("Gabriel", "De Barro", "70-85");
        Pessoa maria = new Pessoa("Maria", "das dores", "70-86");
        Pessoa paulo = new Pessoa("Paulo", "Gabriel", "70-87");
        Pessoa ze = new Pessoa("Ze", "Valadares", "70-88");
        Pessoa felipe = new Pessoa("Felipe", "Valadares", "70-89");
        Pessoa andeson = new Pessoa("Andeson", "Silva", "70-90");
        Pessoa joel = new Pessoa("Joel", "De Souza", "70-91");
        Pessoa cosme = new Pessoa("Cosme", "Rosa", "70-92");

        pessoas.adicionaSemDuplicidade(reinan);
        pessoas.adicionaSemDuplicidade(lucas);
        pessoas.adicionaSemDuplicidade(lucas);
        pessoas.adicionaSemDuplicidade(gabriel);
        pessoas.adicionaSemDuplicidade(maria);
        pessoas.adicionaSemDuplicidade(paulo);
        pessoas.adicionaSemDuplicidade(felipe);
        pessoas.adicionaSemDuplicidade(andeson);
        pessoas.adicionaSemDuplicidade(joel);

        pessoas.remover(maria);
        pessoas.remover(joel);
        System.out.println(pessoas);

    }

}
