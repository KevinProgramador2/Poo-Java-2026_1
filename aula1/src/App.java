public class App {
    public static void main(String[] args) throws Exception {
        // tipos primitivos - armazenar valores
        int idade = 22;
        double altura = 1.77;
        boolean ativo = true;
        char opcao = 'S';

        // Tipos classe

        String nome = "José";
        Integer matricula;
        nome.toUpperCase();

        if (idade >= 18 || altura >= 1.70) {
            System.out.println("O atleta esta adpeto.");
        } else {
            System.out.println("O atleta não competirá");
            System.out.println("");
        }

    }
}
