import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {
    @Order(1)
    @Test
    public void isPositiveNumberHappyPathPositive () {
        int a = 555;
        boolean expectedResult = true;
        IsPositiveNumber isPositive = new IsPositiveNumber();
        boolean actualResult = isPositive.isPositiveNumber(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void isPositiveNumberHappyPathNull () {
        int a = 0;
        boolean expectedResult = true;
        IsPositiveNumber isPositive = new IsPositiveNumber();
        boolean actualResult = isPositive.isPositiveNumber(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void isPositiveNumberHappyPathNegative() {
        int a = -555;
        boolean expectedResult = false;
        IsPositiveNumber isPositive = new IsPositiveNumber();
        boolean actualResult = isPositive.isPositiveNumber(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }


}
