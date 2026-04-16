package agendatelefonicas;

public class TesteAgenda {

    public static void main(String[] args) {
        AgendaTelefonica contato = new AgendaTelefonica("Kevin", "1234-5678");
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Telefone: " + contato.getNumeroTelefone());
    }
}
