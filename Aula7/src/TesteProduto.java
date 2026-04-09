public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Celular", "Samsung A17");

        System.out.println(produto);

        System.out.println("---------------------");
        System.out.println(produto.nome());
    }
}