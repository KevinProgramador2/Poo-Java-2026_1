//Interface nao tem instancia pq nao contem implementacao (por enquanto)

public interface Conta {
    public final int taxaSaque = 7;

    public abstract void saque(double valor);

    public abstract void deposito(double valor);

}
