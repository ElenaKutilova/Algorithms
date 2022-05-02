import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
    //{0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10
    @Order(1)
    @Test
    public void sumArrayHappyPathPositive () {
        int [] arr = new int[] {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;
        SumArray sOA = new SumArray();
        int actualResult = sOA.sumOfArray(arr);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void sumArrayHappyPathNegative () {
        int [] arr = new int[] {-7, -3};
        int expectedResult = -10;
        SumArray sOA = new SumArray();
        int actualResult = sOA.sumOfArray(arr);
        Assertions.assertEquals(expectedResult, actualResult);
    }




}
