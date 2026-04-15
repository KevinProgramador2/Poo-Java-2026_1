import java.util.Arrays;
import java.util.List;

public class ExemploArrays {
    public static void main(String[] args) {
        List produtos = Arrays.asList("Celular", "Tv", "Relogio", "Kindle");

        produtos.set(1, "Tv 42");

        for (Object o : produtos) {
            System.out.println(o);
        }
    }
}
