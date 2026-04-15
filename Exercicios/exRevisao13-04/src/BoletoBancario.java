public class BoletoBancario implements Pagavel {
    private String codigoBarras;

    public BoletoBancario(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    @Override
    public String toString() {
        return "BoletoBancario [codigoBarras=" + codigoBarras + "]";
    }

    @Override
    public double pagar(double valor) {
        return valor;
    }

    public void setCodigoBarras(String codigoBarras) throws Exception {
        if (!codigoBarras.isBlank() || !codigoBarras.isEmpty()) {
            this.codigoBarras = codigoBarras;
        } else {
            throw new Exception("Código de barras inválido.");
        }

    }

}
