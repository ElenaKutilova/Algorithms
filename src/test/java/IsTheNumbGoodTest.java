import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
//If M is multiple of 3 and 5 then return "Good Number".
//If M is only multiple of 3 and not of 5 then return "Bad Number"
//If M is only multiple of 5 and not of 3 then return "Poor Number"
//If M doesn't satisfy any of the above conditions then return "-1"

public class IsTheNumbGoodTest {
    @Order(1)
    @Test
    public void testIsTheNumbGoodHappyPathMulti3And5(){
        int a = 15;
        IsTheNumbGood goodNumb = new IsTheNumbGood();
        String expectedResult = "Good Number";
        String actualResult = goodNumb.isTheNumbGood(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIsTheNumbGoodHappyPathMulti3(){
        int a = 99;
        IsTheNumbGood goodNumb = new IsTheNumbGood();
        String expectedResult = "Bad Number";
        String actualResult = goodNumb.isTheNumbGood(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIsTheNumbGoodHappyPathMulti5(){
        int a = -125;
        IsTheNumbGood goodNumb = new IsTheNumbGood();
        String expectedResult = "Poor Number";
        String actualResult = goodNumb.isTheNumbGood(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testIsTheNumbGoodHappyPathMultiNeitherNo(){
        int a = 17;
        IsTheNumbGood goodNumb = new IsTheNumbGood();
        String expectedResult = "-1";
        String actualResult = goodNumb.isTheNumbGood(a);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
