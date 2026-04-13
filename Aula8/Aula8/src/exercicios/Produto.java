package exercicios;

public class Produto {

    protected int codigo;
    protected String descricao;
    protected double valor;
    protected Categoria categoria;

    public Produto(int codigo, String descricao, double valor, Categoria categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
