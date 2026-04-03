import java.sql.Date;
import java.time.LocalDate;

public class ContaCorrente {
    Integer numero, agencia;
    String nomeCliente;
    LocalDate dataNasicemento;
    Double saldo;
    boolean ativo = true;

    public static void main(String[] args) {
    }

    void sacar(Double valorSolicitado) {
        // nao solicitei logica
    }

    public Double transferir(ContaCorrente contaDestino,
            Double valorSolicitado) {
        // logica de transferencia
        return 0.0;
    }

}
