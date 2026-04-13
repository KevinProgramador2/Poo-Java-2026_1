package src;

public class Clinica extends planoSaude {

    private String cnpj;
    private String nome;

    @Override
    public String toString() {
        return super.toString() + "Clinica [cnpj=" + cnpj + ", nome=" + nome + "]";
    }

    public Clinica(String empresa, String cnpj, String nome) {
        super(empresa);
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
