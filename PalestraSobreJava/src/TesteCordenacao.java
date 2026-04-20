import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TesteCordenacao {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana", "ADM", 2000);
        Funcionario f2 = new Funcionario("Roberta", "ADM", 2000);
        Funcionario f3 = new Funcionario("Maria", "ADM", 2000);
        Funcionario f4 = new Funcionario("Dailane", "ADM", 2000);
        Funcionario f5 = new Funcionario("mariana", "ADM", 2000);

        List<String> nomes = funcionarios.stream().filter(f -> f.getSetor().equals("ADM"))
                .sorted((func1, func2) -> func2.getSalario().compareTo(func1.getSalario())).map(f -> f.getNome())
                .collect(Collectors.toList());
        System.out.println(nomes);

    }
}
