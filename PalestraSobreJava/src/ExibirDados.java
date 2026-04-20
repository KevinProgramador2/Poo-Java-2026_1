import java.util.function.Consumer;

public class ExibirDados implements Consumer<Aluno> {

    @Override
    public void accept(Aluno a) {
        System.out.println(a.getNome());
        System.out.println(a.getEmail());
        throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }

}
