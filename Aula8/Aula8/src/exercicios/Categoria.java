package exercicios;

public enum Categoria {
    ELETRONICO(1000.0),
    ALIMENTO(40.0),
    AUTOMOTIVO(500.0),
    ROUPAS(50.0),
    FARMACEUTICO(20.0);

    private final double valorBase;

    Categoria(double valor) {
        this.valorBase = valor;
    }
}