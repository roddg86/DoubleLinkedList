package test;

import myLinkedList.DoubleLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleLinkedListTest {

    @Test
    void getTest() {
        DoubleLinkedList<String> strings = new DoubleLinkedList<>();
        strings.addFirst("1");
        assertEquals("1", strings.get(0));
    }

    @Test
    void getNegativeTest(){
        DoubleLinkedList<String> strings = new DoubleLinkedList<>();
        strings.addFirst("1");
        assertNotEquals("2",strings.get(0));
    }

    @Test
    public void testIsEmptySizeIsZero() {
        DoubleLinkedList<String> strings = new DoubleLinkedList<>();
        assertEquals(0, strings.size());
    }

    /**
     * Результат должен быть: [4,3,2,1,0]
     */
    @Test
    public void testInsertAtFirst() {
        DoubleLinkedList<Integer> integers = new DoubleLinkedList<>();
        for (int i = 0; i < 5; i++) {
            integers.addFirst(i);
        }
        assertEquals("[4,3,2,1,0]", integers.toString());
    }

    /**
     * Результат должен быть: [0,1,2,3,4]
     */
    @Test
    public void testInsertAtLast() {
        DoubleLinkedList<Integer> integers = new DoubleLinkedList<>();
        for (int i = 0; i < 5; i++) {
            integers.addLast(i);
        }
        assertEquals("[0,1,2,3,4]", integers.toString());
    }

    @Test
    public void testIsEmptyReturnsTrue() {
        DoubleLinkedList<Integer> integers = new DoubleLinkedList<>();
        assertTrue(integers.isEmpty());
    }
}
