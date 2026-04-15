import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int numero;
            System.out.print("Digite um numero: ");

            numero = sc.nextInt();

            System.out.println("O valor foi inserido com sucesso!");

        } catch (InputMismatchException e) {
            System.out.println("Error valor alfabetico inserido!");
        }

    }

}
