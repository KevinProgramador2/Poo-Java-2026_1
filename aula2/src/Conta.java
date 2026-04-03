
public class Conta {
    int numero;
    String titular;
    double saldo;
    boolean saque = false;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Transação efetuada com sucesso!");
        } else {
            System.out.println("Deposito não efetuado.");
        }
    }

    // metodo de saque - retorna um boolean

    public boolean saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
