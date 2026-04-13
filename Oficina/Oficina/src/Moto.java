import java.time.LocalDate;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
            int cilindradas) {
        super(modelo, valorCobrado, dataConserto, proprietario);
        this.cilindradas = cilindradas;
    }

    public double lavarVeiculo() {
        return valorCobrado = +TipoServico.LAVAGEM.getValor();
    }

    public double trocarOleo() {
        return valorCobrado = +TipoServico.OLEO.getValor();
    }

    public double revisao() {
        return valorCobrado = +TipoServico.REVISAO.getValor();
    }

}
