import java.util.List;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta() {
            @Override

            public void transacao() {
                System.out.println("Transação finalizada com sucesso!");

            }
        };
        conta.transacao();
        Conta conta2 = () -> {
            System.out.println("Transação finalizada conta2....");
            System.out.println("Transação finalizada conta2....");

        };
        conta2.transacao();
        List<Conta> 
    }
}