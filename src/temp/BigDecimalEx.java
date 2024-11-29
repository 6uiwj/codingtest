package temp;

import java.math.BigDecimal;

public class BigDecimalEx {
    public static void main(String[] args) {
        BigDecimal a = BigDecimal.ZERO;

        for(int i = 1; i <=10; i++) {
            BigDecimal bi = new BigDecimal(i);
            a = a.add(bi);
            a = a.multiply(bi);
        }
        System.out.println(a);
    }
}
