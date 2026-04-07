public class Cliente {

    protected String nome;
    protected double codigo;
    protected String email;

    public Cliente(String nome, double codigo, String email) {
        this.nome = nome;
        this.codigo = codigo;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public double getCodigo() {
        return codigo;
    }

    public String getEmail() {
        return email;
    }

}
