public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Marcelo", "Programador");
        Funcionario f2 = new Funcionario("Marcelo", "Programador");

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1.equals(f2) ? "Igual" : "Diferente");
        System.out.println(f1.getProfissao().equals(f2.getProfissao()) ? "Profissões iguais" : "Profissões diferentes");
    }
}