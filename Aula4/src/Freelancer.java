
public class Freelancer {
    private int diasTrabalhados;
    private double valorDia;

    public Freelancer(int diasTrabalhados, double valorDia) {
        this.diasTrabalhados = diasTrabalhados;
        this.valorDia = valorDia;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

}
