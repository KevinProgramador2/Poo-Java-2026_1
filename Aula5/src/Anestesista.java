package src;

public class Anestesista extends Medico {
    private String tipoAnestesia;

    public Anestesista(String empresa, String crm, String nome,
            String tipoAnestesia) {
        super(empresa, crm, nome);
        this.tipoAnestesia = tipoAnestesia;
    }

    @Override
    public double calcularPagamento() {
        return valorPago = super.calcularPagamento() + 1500;
    }

    @Override
    public String toString() {
        return "Anestesista [tipoAnestesia=" + tipoAnestesia + "]";
    }

    public String getTipoAnestesia() {
        return tipoAnestesia;
    }

}
