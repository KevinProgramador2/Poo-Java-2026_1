public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(123, "Maria", 2000);
        try {
            contaCorrente.deposito(0);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Saldo atual é:" + contaCorrente.getSaldo());

        }
    }
}