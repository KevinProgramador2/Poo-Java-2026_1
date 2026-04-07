public class DiasDaSemana {
    /*
     * 3)Criar um array de Strings inicializado com os nomes dos sete dias da
     * semana. Por
     * exemplo:
     * String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday",
     * "Saturday",
     * "Sunday"};
     * Usando uma declaração while, imprima todo o conteúdo do array. Faça o mesmo
     * para as
     * declarações do-while e for.
     */
    public static void main(String[] args) {
        String days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        // While
        // int i = 0;
        // while (i < days.length) {
        // System.out.println(days[i]);
        // i++;
        // }

        // DO WHILE

        int j = 0;
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);

        // FOR
        /*
         * for (int k = 0; k < days.length; k++) {
         * System.out.println(days[k]);
         * }
         */

    }
}