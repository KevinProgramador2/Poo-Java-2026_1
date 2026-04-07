import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicio04 {

    /*
     * 4)Usando a classe JOptionPane, criar uma classe funcionario leia nome,
     * telefone, email e
     * salário do teclado e exiba as informações digitadas na tela com salário com
     * acréscimo de 10%.
     */

    public static void main(String[] args) {
        String nome, email;
        int telefone = 223372834;
        double salario;
        double aumento;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome = sc.next();
        System.out.println("Digite seu telefone: ");
        telefone = sc.nextInt();
        System.out.println("Digite seu email: ");
        email = sc.next();
        System.out.println("Digite seu salario para conta: ");
        salario = sc.nextDouble();
        aumento = salario * 0.10;
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email
                + "\nSalário com acréscimo de 10%: " + (salario + aumento));
        sc.close();
    }

}
