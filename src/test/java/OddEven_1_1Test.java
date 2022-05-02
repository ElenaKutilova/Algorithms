import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddEven_1_1Test {
    //Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
    /*    -345 →  “Odd”
            0 →  “Even”
            222222 →  “Even”
            2147483647 + 1 →  “Undefined” */

    @Order(1)
    @Test
    public void testOddEvenHappyPathOdd () {
        long a = -345;
        String expectedResult = "Odd";
        OddEven_1_1 oE = new OddEven_1_1();
        String actualResult = oE.OddEven(a);
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(2)
    @Test
    public void testOddEvenHappyPathNull () {
        long a = 0;
        String expectedResult = "Even";
        OddEven_1_1 oE = new OddEven_1_1();
        String actualResult = oE.OddEven(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void testOddEvenHappyPathEven () {
        long a = 222222;
        String expectedResult = "Even";
        OddEven_1_1 oE = new OddEven_1_1();
        String actualResult = oE.OddEven(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathLong () {
        long a = 2147483647 + 1;
        String expectedResult = "Even";
        OddEven_1_1 oE = new OddEven_1_1();
        String actualResult = oE.OddEven(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }




}
