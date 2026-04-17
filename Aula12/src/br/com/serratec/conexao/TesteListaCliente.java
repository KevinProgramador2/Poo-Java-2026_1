package br.com.serratec.conexao;

import br.com.serratec.model.Cliente;
import br.com.serratec.persistence.ClienteDao;

public class TesteListaCliente {

    public static void main(String[] args) {
        ClienteDao dao = new ClienteDao();
        System.out.print("Digite o nome do cliente ");
        for (Cliente cliente : dao.listar()) {
            System.out.println(cliente);
        }
    }
}
