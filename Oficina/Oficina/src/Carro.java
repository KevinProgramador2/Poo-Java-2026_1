import java.time.LocalDate;

public class Carro extends Veiculo {
    private String categoria;

    public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
        super(modelo, 0.0, dataConserto, proprietario); // Começa com valor 0.0
        this.categoria = categoria;
    }

    public void trocarOleo() {

        this.valorCobrado += TipoServico.LAVAGEM.getValor();
        System.out.println("Óleo trocado. Valor atual acumulado: " + this.valorCobrado);
    }

    public void revisao() {
        this.valorCobrado += 200.0;
    }

    @Override
    public String toString() {
        return "Carro: " + modelo + " | Categoria: " + categoria + " | Total a Pagar: R$" + valorCobrado;
    }
}