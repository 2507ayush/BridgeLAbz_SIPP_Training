import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    private final ListManager listManager = new ListManager();

    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 5);
        assertEquals(1, listManager.getSize(list));
        assertTrue(list.contains(5));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        listManager.removeElement(list, 5);
        assertEquals(0, listManager.getSize(list));
        assertFalse(list.contains(5));
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, listManager.getSize(list));
        list.add(1);
        assertEquals(1, listManager.getSize(list));
    }
}
