package br.com.conexao.model.persistence;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {

        Connection connection = new ConnectionFactory().getConnection();

        Conta conta = new Conta("Kevin", "Silva", 500);
        Conta c2 = new Conta("Ronaldo", "Ronaldo S", 1500);

        conta.getNome();
        conta.getSaldo();

        // System.out.println(c1);
        // System.out.println(c1.getNome() + " " + c1.getTitular() + " " +
        // c1.getSaldo());
        System.out.println(conta);
    }
}