public class Servidor {
    protected String nome;
    protected String cpf;
    protected final String lotacao = "Brasilia";

    public Servidor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public final String imprimirDados() {
        return "Dados dos servidores";
    }
}
