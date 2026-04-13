package src;

public class Testeimovel {
    public static void main(String[] args) {

        Proprietario p1 = new Proprietario(1, "Kevin");
        Proprietario p2 = new Proprietario(1, "Marcela");
        Imovel imovel1 = new Imovel("Casa", "Rua random1", 250000, p1);
        Imovel imovel2 = new Imovel("Apto", "Rua Fonseca", 250000, p2);

        System.out.println(imovel1);
        System.out.println(imovel2);
    }

}
