import java.util.Calendar;
import java.util.Date;

public class ExemploDate {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data.getYear());

        Calendar calendar = Calendar.getInstance();
        // System.out.println(calendar);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.HOUR_OF_DAY);

    }
}