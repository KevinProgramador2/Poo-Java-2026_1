import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import pacote.Funcionario;

public class ExemploGeneric {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Set<String> cores = new HashSet<>();
        Funcionario func = new Funcionario("Silva", "Programador", 9000);

        func.abono(100);

        funcionarios.add(new Funcionario("Marcelo", "Programador", 9000));
        funcionarios.add(new Funcionario("Random", "Programador", 10000));
        funcionarios.add(func);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
