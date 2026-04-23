import java.io.Serializable;

// É como o número da versão do molde. 
// Se você mudar a classe no futuro, o Java usa isso para saber se ainda é compatível.
public class Fornecedor implements Serializable {
    private String cnpj;
    private String razaoSocial;
    private static final long serialVersionUID = 1L;

    public Fornecedor(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "Fornecedor [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + "]";
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

}