import java.util.Scanner;

public class SwitchCase {

    // Crie um programa que:

    // Peça ao usuário para digitar uma nota (número inteiro de 0 a 10)
    // Use switch case para exibir a classificação:
    // 0-2: "Muito Ruim"
    // 3-4: "Ruim"
    // 5-6: "Regular"
    // 7-8: "Bom"
    // 9-10: "Excelente"
    // Outro: "Nota inválida!"

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o resultado do caso (1-10): ");

        int usuarioNota = sc.nextInt();

        String classificacao;

        switch (usuarioNota) {
            case 0:
            case 1:
            case 2:
                classificacao = "Muito Ruim";
                break;
            case 3:
            case 4:
                classificacao = "Ruim";
                break;
            case 5:
            case 6:
                classificacao = "Regular";
                break;
            case 7:
            case 8:
                classificacao = "Bom";
                break;
            case 9:
            case 10:
                classificacao = "Excelente";
                break;
            default:
                classificacao = "Nota inválida!";
        }

        System.out.println("Classificação: " + classificacao);
        sc.close();
    }
}
