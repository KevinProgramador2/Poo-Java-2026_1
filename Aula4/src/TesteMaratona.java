public class TesteMaratona {
    public static void main(String[] args) {

        AtletaAmador At1 = new AtletaAmador("Fernando", "Masculino", 70, 1.80, false);
        AtletaAmador At2 = new AtletaAmador("Fernanda", "Feminino", 65, 1.70, false);
        AtletaProfissional Atp = new AtletaProfissional("Wagner", "Masculino", 18, 1.70, 120);

        System.out.println(At1.toString());
        System.out.println(At2.toString());
        System.out.println(Atp.toString());

        At1.verificarSituacao();
        At2.verificarSituacao();
        Atp.verificarSituacao();

    }
}
