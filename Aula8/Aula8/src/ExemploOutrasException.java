public class ExemploOutrasException {
    public static void main(String[] args) {
        String fraseEntrada = "Aula de Java";
        Integer b = 5;
        Integer c = 10;
        String fraseSaida = null;
        try {
            fraseSaida = fraseEntrada.toUpperCase();
            System.out.println(b + c);
            System.out.println(fraseSaida);
        } catch (NullPointerException e) {
            System.err.println("Erro! Nulo");
            e.printStackTrace();
        }

    }
}