import java.math.BigDecimal;
import java.util.List;

public class Multiplier {
    public int multiply(int a, int b) {
        return a * b;
    }
    public int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    }
    public double multiply (double a, double b) {
        return a * b;
    }
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
public class Adder{
        public int add(int a, int b) {
            return a + b;
        }
        public BigDecimal add(List<BigDecimal> list) {
            BigDecimal result = BigDecimal.ZERO;
            for (BigDecimal b : list) {
                result = result.add(b);
            }

            return result;
        }

}
}