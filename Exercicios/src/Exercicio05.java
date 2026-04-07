import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
         * 5) Criar uma classe pedido com os seguintes atributos:
         * numero (int)
         * dataPedido (LocalDate)
         * quantidade (double)
         * valor (double)
         * total (double)
         * Fazer a leitura de um pedido usando o scanner
         * Inserir o construtor com os atributos numero, dataPedido, quantidade e valor
         * Inserir os getters.
         * Criar um método com o nome finalizarPedido na classe Pedido, caso o dia do
         * pedido for
         * um domingo o cliente terá um desconto de 10% no valor do pedido. O total do
         * pedido
         * será a quantidade * valor com o desconto aplicado.
         * Imprimir o total do pedido
         */

        int num1;
        LocalDate dataPedido;
        double quantidade, total;
        double valor;

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("qual o numero do pedido? ");
        num1 = sc.nextInt();
        System.out.println("Digite uma data (dd/MM/yyyy):");
        String entradaData = sc.next();
        dataPedido = LocalDate.parse(entradaData, formatoBr);
        System.out.println("Data lida: " + dataPedido); // Saída no padrão ISO: yyyy-MM-dd
        System.out.println("Qual o valor? ");
        valor = sc.nextDouble();
        System.out.println("Qual o valor total ? ");
        total = sc.nextDouble();

        System.out.println("numero:\n" + num1 + "Data do pedido\n" + dataPedido + "Valor: \n" + "Total\n" + total);

        sc.close();
    }
}
