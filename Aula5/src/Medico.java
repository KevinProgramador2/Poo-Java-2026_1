package src;

public class Medico extends planoSaude {
    protected String crm;
    protected String nome;

    public Medico(String empresa, String crm, String nome) {
        super(empresa);
        this.crm = crm;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString() + "crm:" + crm + "nome:" + nome;
    }

    @Override
    public double calcularPagamento() {
        return valorPago = super.calcularPagamento() * 1.10;
    }

    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

}