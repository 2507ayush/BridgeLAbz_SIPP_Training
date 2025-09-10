import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @Test
    public void testReverse() {
        assertEquals("cba", stringUtils.reverse("abc"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("aba"));
        assertFalse(stringUtils.isPalindrome("abc"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("ABC", stringUtils.toUpperCase("abc"));
    }
}
