import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {
    // Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}
    @Order(1)
    @Test
    public void testOddIndicesHappyPathOdd() {
        int[] arr = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};
        OddIndices oInd = new OddIndices();
        int[] actualResult = oInd.oddIndices(arr);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
