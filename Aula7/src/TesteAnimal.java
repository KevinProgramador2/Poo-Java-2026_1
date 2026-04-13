import java.time.LocalDate;

public class TesteAnimal {
    public static void main(String[] args) {

        Cachorro c = new Cachorro("Bolt", LocalDate.of(2024, 04, 10), "Siberiano", true);
        Cavalo cv = new Cavalo("Riot", LocalDate.of(2020, 10, 21), "marcaFerradura");
        Tucano t = new Tucano("Fernando", LocalDate.of(2025, 05, 14), "Preto", 3.50);
        System.out.println(c);
        System.out.println(cv);
        System.out.println(t);
    }

}
