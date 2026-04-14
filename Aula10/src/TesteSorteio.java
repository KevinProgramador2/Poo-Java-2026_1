public class TesteSorteio {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joao", 2000);
        Funcionario f2 = new Funcionario("Kevin", 6000);
        Funcionario f3 = new Funcionario("Julia", 3000);
        Funcionario f4 = new Funcionario("Ana", 3500);

        Sorteio<Funcionario> sorteio = new Sorteio<>();
        sorteio.adicionari(f1);
        sorteio.adicionari(f2);
        sorteio.adicionari(f3);
        sorteio.adicionari(f4);

        System.out.println("Funcionario sorteado foi:" + sorteio.sorteio());

        // Integer num1 = 10;
        // Integer num2 = 120;
        // Integer num3 = 12;

        Sorteio<Integer> sorteio2 = new Sorteio<>();
        sorteio2.adicionari((20));
        sorteio2.adicionari((30));
        sorteio2.adicionari((40));

    }
}
