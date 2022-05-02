import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
//({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

public class MinMaxAveTest {
    @Order(1)
    @Test
    public void testMinMaxAveHappyPath () {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;
        int[] expectedResult = {3, 7, 5};
        MinMaxAve arrResult = new MinMaxAve();
        int[] actualResult = arrResult.minMaxAve(arr, a, b);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


}
