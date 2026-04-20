import java.util.Arrays;
import java.util.List;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Kevin", "kefvin23@gmail.com", 22);
        Aluno aluno2 = new Aluno("Julio", "julio23@gmail.com", 32);
        Aluno aluno3 = new Aluno("Oliveira", "oliveira n23@gmail.com", 42);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3);
        // for (Aluno string : alunos) {
        // System.out.println(aluno);
        // ExibirDados exibirDados = new ExibirDados();
        // alunos.forEach(exibirDados);

        // alunos.forEach((a) -> {
        // System.out.println(a.getEmail());
        // System.out.println(a.getNome());
        // });

        // Method reference | mais otimizado ja faz o for e toString com base nas
        // informacoes
        alunos.forEach(System.out::println);

    }

}
