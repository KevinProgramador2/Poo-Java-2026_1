import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteMap {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Kevin", "kefvin23@gmail.com", 22);
        Aluno aluno2 = new Aluno("Julio", "julio23@gmail.com", 32);
        Aluno aluno3 = new Aluno("Oliveira", "oliveira n23@gmail.com", 42);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3);

        List<String> nomes = alunos.stream().map(a -> a.getNome().toUpperCase()).collect(Collectors.toList());
        // System.out.println(nomes);

        // System.out.println("Alunos com idade <= 22:");
        // alunos.stream().filter((a) -> a.getIdade() <=
        // 22).forEach(System.out::println);
        // alunos.stream().filter((a) -> a.getNome().contains("n")).forEach(a ->
        // System.out.println(a));

        List<String> numeros = Arrays.asList("10", "20", "30");
        long quantidade = numeros.stream().map(num -> Double.parseDouble(num)).count();
        System.out.println(quantidade);
    }
}
