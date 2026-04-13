public enum TipoServico {
    OLEO(100),
    LAVAGEM(50.0),
    REVISAO(200.0);

    private final double valor;

    TipoServico(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}