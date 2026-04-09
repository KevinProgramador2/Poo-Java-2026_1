public class ServidorFederal extends Servidor {

    private String matricula;

    public ServidorFederal(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

}
