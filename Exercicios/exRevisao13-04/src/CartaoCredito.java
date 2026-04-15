public class CartaoCredito extends Cartao {

    public CartaoCredito(String numero, String dataValidade) {
        super(numero, dataValidade);
    }

    private double limite;

    public double getLimite() {
        return limite;
    }

    @Override
    public String toString() {
        return "CartaoCredito [limite=" + limite + "]";
    }

    public void setLimite(double limite) {
        if (limite < 0) {
            System.out.println("Nao foi possivel fazer o pagemnto.");
        } else {
            this.limite = limite;
        }
    }

}
