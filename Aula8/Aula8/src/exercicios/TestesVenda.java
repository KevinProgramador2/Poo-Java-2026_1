package exercicios;

import java.time.LocalDate;

public class TestesVenda {
    public static void main(String[] args) {
        try {
            Produto p1 = new Produto(1, "Tv", 3000.0, Categoria.ELETRONICO);
            Produto p2 = new Produto(2, "Pneu", 800.0, Categoria.AUTOMOTIVO);
            Produto p3 = new Produto(3, "Celular", 2500.0, Categoria.ELETRONICO);

            Venda v1 = new Venda(LocalDate.now(), 2, 2, p1);
            Venda v2 = new Venda(LocalDate.now(), 2, 2, p2);
            Venda v3 = new Venda(LocalDate.now(), 2, 2, p3);

            v1.calcularVenda();
            v2.calcularVenda();
            v3.calcularVenda();

            System.out.println("Total por Item:");
            System.out.println(p1.getDescricao() + " " + v1.getTotalVenda());
            System.out.println(p2.getDescricao() + " " + v2.getTotalVenda());
            System.out.println(p3.getDescricao() + " " + v3.getTotalVenda());

            double totalGeral = v1.getTotalVenda() + v2.getTotalVenda() + v3.getTotalVenda();
            System.out.println("Total Geral Venda: " + totalGeral);

        } catch (ValorInvalidoException e) {
            System.err.println("Erro ao processar produto: " + e.getMessage());
        }
    }
}