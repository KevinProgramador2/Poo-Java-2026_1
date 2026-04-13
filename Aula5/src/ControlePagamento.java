package src;

public class ControlePagamento {
    private double totalPago;

    public double getTotalPago() {
        return totalPago;
    }

    public void calcularPagamento(planoSaude planoSaude) {
        totalPago += planoSaude.getValorPago();
    }
}
