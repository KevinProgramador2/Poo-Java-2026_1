public class Cartao implements Pagavel {
    private String numero;
    private String dataValidade;

    public Cartao(String numero, String dataValidade) {
        this.numero = numero;
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Cartao [numero=" + numero + ", dataValidade=" + dataValidade + "]";
    }

    public String getNumero() {
        return numero;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public double pagar(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pagar'");
    }

}
