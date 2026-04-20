package br.com.conexao.model.persistence;

public class Conta {
    private String nome;
    private String titular;
    private double saldo;

    public Conta(int nome, String titular, double saldo) {
        this.nome = nome;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta [nome=" + nome + ", titular=" + titular + ", saldo=" + saldo + "]";
    }

    public String getNome() {
        return nome;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

}
