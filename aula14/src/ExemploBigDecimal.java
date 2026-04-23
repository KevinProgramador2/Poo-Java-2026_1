
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExemploBigDecimal {
    public static void main(String[] args) {
        Double num1 = 0.1;
        Double num2 = 0.2;

        BigDecimal num3 = new BigDecimal("0.1");
        BigDecimal num4 = new BigDecimal("0.2");

        System.out.println(num3.add(num4));
        System.out.println(num3.subtract(num4));
        System.out.println(num3.multiply(num4));
        System.out.println(num3.divide(num4, 1, RoundingMode.HALF_DOWN));
        System.out.println(num3.divide(num4, 1, RoundingMode.HALF_DOWN));

    }
}