package br.com.serratec.conexao;

import java.util.Scanner;
import br.com.serratec.persistence.ClienteDao;

public class TesteClienteRemover {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ClienteDao dao = new ClienteDao();

    System.out.println("Digite o código do cliente: ");
    Integer codigo = sc.nextInt();

    dao.apagar(codigo);
    System.out.println("Cliente apagado com sucesso!");

  }
}