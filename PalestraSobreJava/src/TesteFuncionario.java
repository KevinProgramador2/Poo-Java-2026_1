import java.util.Arrays;
import java.util.List;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana", "ADM", 2000);
        Funcionario f2 = new Funcionario("Roberta", "ADM", 2000);
        Funcionario f3 = new Funcionario("Maria", "ADM", 2000);
        Funcionario f4 = new Funcionario("Dailane", "ADM", 2000);
        Funcionario f5 = new Funcionario("mariana", "ADM", 2000);

        List<Funcionario> funcionarios = Arrays.asList(f1, f2, f3, f4, f5);
        Boolean resultado = funcionarios.stream().allMatch(f -> f.getSetor().equals("FIM"));
        // System.out.println(resultado);

        Double soma = funcionarios.stream().filter(f -> f.getSalario() >= 5000 && f.getSetor().equals("ADM")).skip(1)
                .mapToDouble(f -> f.getSalario()).sum();
        System.out.println("Total salario:" + soma);

    }
}
