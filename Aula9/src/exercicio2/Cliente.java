package exercicio2;

public class Cliente {

    private String nome;
    private int idade;
    private String telefone;
    private int id;

    public Cliente(String nome, int idade, String telefone, int id) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getId() {
        return id;
    }

}
