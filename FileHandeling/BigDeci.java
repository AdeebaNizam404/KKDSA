package FileHandeling;
import java.math.BigDecimal;
public class BigDeci {
    public static void main(String[] args) {
        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans = Y.subtract(X);
        System.out.println(ans);
        BigDecimal a = new BigDecimal("445.9837489750");
        BigDecimal b= new BigDecimal("234.713654637285");
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(b.pow(2));
        //Constants
        BigDecimal cons = BigDecimal.ONE;
        System.out.println(cons);

    }
}
 