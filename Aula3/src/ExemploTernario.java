public class ExemploTernario {
    public static void main(String[] args) {
        boolean concluida = true;
        double media = 9;

        if (concluida) {
            System.out.println("Tarefa concluida com sucesso!");

        } else {
            System.out.println("Tarefa incompleta!");

            // System.out.println(concluida ? "Tarefa concluida com sucesso!" : "Tarefa nao
            // concluida");
            // media < 5 -Ruim -Maior ou igual a 7 Bom - Maior ou igual a 9 - otimo
        }
        System.out.println(media < 5 ? "Ruim" : media < 9 ? "Bom" : "Otimo");
    }
}
