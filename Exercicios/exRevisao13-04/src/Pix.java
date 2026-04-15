public class Pix implements Pagavel {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    @Override
    public String toString() {
        return "Pix [chavePix=" + chavePix + "]";
    }

    @Override
    public double pagar(double valor) {
        if (chavePix != null && !chavePix.isEmpty() && valor > 0) {
            System.out.println("Pagamento de R$ " + valor + " realizado via PIX para: " + chavePix);
            return valor;
        } else {
            throw new ErroNoMetodoPagamentoException("Erro no metodo 'pagar' do PIX: Chave invalida ou valor zerado.");
        }
    }

    public void setChavePix(String chavePix) {
        if (chavePix == null || chavePix.isBlank()) {
            System.out.println("o valor inserido nao corresponde ao requisito");
        } else {
            this.chavePix = chavePix;
        }
    }

}
