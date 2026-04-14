import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio<T> {
    private List<T> lista;
    private Random random;

    public Sorteio(List<T> lista, Random random) {
        this.lista = lista;
        this.random = random;
    }

    public Sorteio() {
        lista = new ArrayList<>();
        random = new Random();
    }

    public void adicionari(T elemento) {
        lista.add(elemento);
    }

    public void remover(T elemento) {
        lista.remove(elemento);
    }

    public T sorteio() {
        int pos = random.nextInt(lista.size());
        return lista.get(pos);
    }
}
