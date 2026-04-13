import java.time.LocalDate;

public abstract class Veiculo {
    protected String modelo;
    protected double valorCobrado;
    protected LocalDate dataConserto;
    protected Proprietario proprietario;
    protected TipoServico tipoServico;

    public Veiculo(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario) {
        this.modelo = modelo;
        this.valorCobrado = valorCobrado;
        this.dataConserto = dataConserto;
        this.proprietario = proprietario;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    @Override
    public String toString() {
        return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto
                + ", proprietario=" + proprietario + "]";
    }

}
