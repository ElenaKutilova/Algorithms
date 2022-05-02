import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Order(1)
    @Test
    public void BiggerVallueHappyTestB () {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;
        BiggerValue bigVal = new BiggerValue();
        int actualResult = bigVal.BiggerVal(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
