import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class ExemploInstant {
    public static void main(String[] args) {
        Instant dataAtual = Instant.now();
        System.out.println(dataAtual);

        Instant data2 = Instant.parse("2026-04-02T01:00:22Z");
        LocalDate dataLocal = LocalDate.ofInstant(data2, ZoneId.systemDefault());
        System.out.println(dataLocal);
    }
}