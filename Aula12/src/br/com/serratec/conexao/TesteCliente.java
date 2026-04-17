package br.com.serratec.conexao;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.serratec.model.Cliente;
import br.com.serratec.persistence.ClienteDao;

public class TesteCliente {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        ClienteDao dao = new ClienteDao();
        System.out.print("Digite o nome do cliente ");
        String nome = sc.next();

        System.out.print("Digite o email do cliente: ");
        String email = sc.next();

        Cliente cliente = new Cliente(null, nome, email);
        dao.inserir(cliente);
        System.out.println("Cliente inserido com sucesoo!");



        
    }
}
