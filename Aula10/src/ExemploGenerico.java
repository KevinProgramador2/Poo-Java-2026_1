import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploGenerico {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(20, 30, 40, 60);
        List<Double> decimais = Arrays.asList(20.0, 30.0, 40.0, 60.);
        List<Object> Objetos = new ArrayList<>();

        copiar(decimais, Objetos);
        imprimir(Objetos);
    }

    public static void copiar(List<? extends Number> origem, List<? super Number> destino) {
        for (Number numero : origem) {
            destino.add(numero);
        }
    }

    public static void imprimir(List<?> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }
}
