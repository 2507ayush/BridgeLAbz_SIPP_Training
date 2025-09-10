import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionDemoTest {

    private final ExceptionDemo exceptionDemo = new ExceptionDemo();

    @Test
    public void testDivide() {
        assertEquals(2, exceptionDemo.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> exceptionDemo.divide(1, 0));
    }
}
