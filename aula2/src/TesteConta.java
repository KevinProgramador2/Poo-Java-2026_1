import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String titular;
        double saldo;
        Conta conta;
        char resp;

        // var conta2 = new Conta();
        // var texto = "aula";

        do {
            conta = new Conta();

            System.out.println("Digite o Número 123da Conta: ");
            numero = sc.nextInt();
            sc.nextLine();
            conta.numero = numero;

            System.out.println("Digite o nome do titular da conta: ");
            titular = sc.nextLine();
            conta.titular = titular;

            System.out.println("Digite o saldo da conta: ");
            saldo = sc.nextDouble();
            conta.saldo = saldo;

            System.out.println("Digite o valor a ser Depositado: ");
            double valor = sc.nextDouble();

            conta.depositar(valor);

            System.out.println("Digite o valor do saque: ");
            valor = sc.nextDouble();

            if (conta.saque(valor)) {
                System.out.println("Saque efetuado!");
            } else {
                System.out.println("Saque não efetuado!");
            }
            System.out.println("Saldo: " + conta.saldo);

            sc.nextLine();
            System.out.println("Deseja adicionar outra conta (S/N): ");
            resp = sc.next().charAt(0);
        } while (resp == 's' || resp == 'S');
    }
}