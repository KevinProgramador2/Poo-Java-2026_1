public class ResultadoAtleta {
    public static void main(String[] args) {
        int pontos = 10;
        String result = (pontos < 5 ? "Pontuacao media"
                : pontos <= 8 ? "Otimo" : pontos >= 9 ? "Excelente" : "Pessimo");
        System.out.println(result);

    }
}
