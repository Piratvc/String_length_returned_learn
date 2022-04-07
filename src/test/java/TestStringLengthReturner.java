import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringLengthReturner {

    @Test
    public void test1() {
        String stringForReturn = "Hello World!";
        int expected = 6;

        int result = Main.returnLastStringLength(stringForReturn);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test2() {
        String stringForReturn = "World!";
        int expected = 6;

        int result = Main.returnLastStringLength(stringForReturn);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test3() {
        String stringForReturn = "Hello World!";
        boolean expected = false;
        boolean result = Main.checkWarningWords(stringForReturn);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test4() {
        String stringForReturn = "Овальный кабинет";
        boolean expected = true;
        boolean result = Main.checkWarningWords(stringForReturn);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test5() {

        Class<Exception> expected = Exception.class;

        Assertions.assertThrows(expected,
                () -> Main.cicleCheck("Война"));


    }


}