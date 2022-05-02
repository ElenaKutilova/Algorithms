import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
//Test Data:
//89, 89
//Expected result: 0
//-89, 89
//Expected result: -1
//89, -89
//Expected result: 1

public class AreNumbersEqualTest {
    @Order(1)
    @Test
    public void areNumbersEqualHappyTestEq () {
        int a = 89;
        int b = 89;
        int expectedResult = 0;
        AreNumbersEqual areEqual = new AreNumbersEqual();
        int actualResult = areEqual.areNumbersEqual(a ,b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void areNumbersEqualHappyTestB () {
        int a = -89;
        int b = 89;
        int expectedResult = -1;
        AreNumbersEqual areEqual = new AreNumbersEqual();
        int actualResult = areEqual.areNumbersEqual(a ,b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void areNumbersEqualHappyTestA () {
        int a = 89;
        int b = -89;
        int expectedResult = 1;
        AreNumbersEqual areEqual = new AreNumbersEqual();
        int actualResult = areEqual.areNumbersEqual(a ,b);
        Assertions.assertEquals(expectedResult, actualResult);
    }


}
