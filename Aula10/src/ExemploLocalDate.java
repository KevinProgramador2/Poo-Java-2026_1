import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class ExemploLocalDate {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataManual = LocalDate.of(2026, 4, 5);
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        LocalTime hora = LocalTime.now();

        System.out.println(hora);
        System.out.println(dataAtual.minusDays(30));
        System.out.println(dataManual.isLeapYear() ? "É bisexto" : "Não é bisexto");
        System.out.println(dataHoraAtual);
        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        for (String horario : ZoneId.getAvailableZoneIds()) {
            System.out.println(horario);
        }

    }

}
