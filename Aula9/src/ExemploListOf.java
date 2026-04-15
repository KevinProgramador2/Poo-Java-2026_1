import java.util.List;

public class ExemploListOf {
    public static void main(String[] args) {
        List produtos = List.of("Celular", "TV", "Relógio");
        // Não aceita novos elementos
        // produtos.add("Pen Drive");
        // Não aceita modificações nos elementos da lista
        // produtos.set(0, "Celular da Apple");
        for (Object o : produtos) {
            System.out.println(o);
        }

    }
}