public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(123, "Ana", "1245", 5000, "123456", "ADM", 10);

        Diretor diretor = new Diretor(567, "Maria", "2424", 10000, "Prodação");
        gerente.autenticacao("123");
        gerente.imprimirContraCheque();

        System.out.println(gerente.imprimirContraCheque());
        System.out.println(gerente.toString());
        gerente.reajusteSalario();
        System.out.println("Salario atualizado Gerente" + gerente.getSalario());
        diretor.reajusteSalario();
        System.out.println("Salario atualizado Diretor" + diretor.getSalario());
    }

}