package exercicios;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
    private Produto produto;
    private LocalDate dataCompra;
    private int quantidade;
    private double totalVenda;

    public Venda(int codigo, String descricao, double valor, Categoria categoria, Produto produto, LocalDate dataCompra,
            LocalDate now, int i, int j, Produto p3,
            int quantidade) {
        this.produto = produto;
        this.dataCompra = dataCompra;
        this.quantidade = quantidade;
    }

    public Venda(LocalDate now, int i, int j, Produto p3) {
        this.dataCompra = now;

        this.produto = p3;
    }

    @Override
    public String toString() {
        return "Venda [produto=" + produto + ", dataCompra=" + dataCompra + ", quantidade=" + quantidade
                + ", totalVenda=" + totalVenda + "]";
    }

    public Produto getProduto() {
        return produto;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void calcularVenda() {

        this.totalVenda = produto.getValor();
    }

    public void mostrarVenda() {
        System.out.println(produto.getDescricao() + "-" + produto.getValor());
    }
}
