public class Assinatura {
    private String plano;
    private double valorBase;
    private boolean cliente = true;

    public Assinatura(double valorBase, String plano) {
        this.valorBase = valorBase;
        this.plano = plano;

    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public double getValoBase() {
        return valorBase;
    }

    public void setValoBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double calcularTaxaManuntencao() {
        return this.valorBase * 0.05;
    }

    public double calcularDescontoFidelidade() {
        return this.valorBase * 0.10;
    }

}