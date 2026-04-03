public class Exemplo2 {
    public static void main(String[] args) {
        String dia = "Domingo";

        String resultado = switch (dia) {
            case "Segunda" -> "Dia de semana";
            case "Terça" -> "Dia de semana";
            case "Quarta" -> "Dia de semana";
            case "Quinta" -> "Dia de semana";
            case "Sexta" -> "Dia de semana";
            case "Sabado" -> "Dia de semana";
            case "Domingo" -> "Fim de semana";
            default -> "Dia inválido";
        };
        System.out.println(resultado);

        String time = "Fluminense";
        String resposta = switch (time) {
            case "Flamengo", "Vasco", "Botafogo", "Fluminense" -> "Rio de janeiro";
            case "São paulo", "Palmeiras", "Santos", "Corinthias" -> "Sao paulo";
            default -> "Outro Estado";
        };
        System.out.println(resposta);
    }
}
