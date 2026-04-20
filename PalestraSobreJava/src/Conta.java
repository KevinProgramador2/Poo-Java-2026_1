@FunctionalInterface
public interface Conta {
    // si Aceuta yn netidi abstrato
    public void transacao();

    default void investimento() {
        System.out.println("Investimento efetuado!");
    }

}
