public class TesteGenerico {
    public static void main(String[] args) {

        Generico<Integer> g = new Generico(50);
        Generico<String> g2 = new Generico("Maria");
        Generico<Boolean> g3 = new Generico(true);

        System.out.println(g.getValor());
        System.out.println(g2.getValor());
        System.out.println(g3.getValor());

    }
}
