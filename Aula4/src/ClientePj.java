public class ClientePj extends Cliente {
    private String cnpj;
    private String razaoSocial;
    private int inscricaoEstadual;

    public ClientePj(String nome, double codigo, String email, String cnpj, String razaoSocial, int inscricaoEstadual) {
        super(nome, codigo, email);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public int getInscricaoEstadual() {
        return inscricaoEstadual;
    }

}
