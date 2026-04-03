
import java.util.Scanner;

public class TesteProduto {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insira o nome do produto");
            String nome = sc.next();

            System.out.println("Insira o codigo do produto");
            Integer codigo = sc.nextInt();

            System.out.println("Insira o preco do produto");
            Double produto = sc.nextDouble();

            Produto p1 = new Produto(codigo, nome, produto);

            System.out.println("O codigo do produto é: " + p1.getCodigo());
            System.out.println("O nome do produto é: " + p1.getNome());
            System.out.println("O preco do produto é: " + p1.getPreco());
        }

    }

}