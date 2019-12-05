package pl.adam.hometask.impl;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


/**
 * @author denys.berezanskyi
 */
class CustomLinkedListTest {
    private static CustomLinkedList linkedList;

    @BeforeAll
    public static void init() {
        linkedList = new CustomLinkedList();
    }

    @Test
    void addToEndifEmpty() {
        String test = "TestEnd";
        linkedList.addToEnd(test);
        Assert.assertEquals(test, linkedList.getLast());
    }

    @Test
    void addToBeginningIfEmpty() {
        String test = "TestBeginning";
        linkedList.addToBeginning(test);
        Assert.assertEquals(test, linkedList.getFirst());
    }

    @Test
    void removeOneFromEndIfNotEmpty() {
        linkedList.addToEnd("one");
        linkedList.addToEnd("two");
        linkedList.removeOneFromEnd();
        Assert.assertTrue(linkedList.getFirst() != null && linkedList.getFirst().equals("one"));
    }

    @Test
    void removeOneFromBeginning() {
        linkedList.addToEnd("one");
        linkedList.addToEnd("two");
        linkedList.removeOneFromEnd();
        Assert.assertTrue(linkedList.getFirst() != null && linkedList.getLast().equals("two"));
    }

    @Test
    void clear() {
        linkedList.addToEnd("one");
        linkedList.addToEnd("two");
        linkedList.clear();
        Assert.assertTrue(linkedList.isEmpty());
    }

    @Test
    void addAll() {
        List<String> collection = Arrays.asList("one", "two");
        linkedList.addAll(collection);
        Assert.assertEquals("one", linkedList.getFirst());
        Assert.assertEquals("two", linkedList.getLast());
    }

    @Test
    void getFirst() {
        linkedList.addToBeginning("first");
        Assert.assertEquals("first", linkedList.getFirst());
    }

    /**
     * Tricky
     */
    @Test
    void getLast() {
        linkedList.addToBeginning("last");
        Assert.assertEquals("last", linkedList.getLast());
    }

    @Test
    void getItem() {
        String one = "one";
        String two = "two";
        String three = "three";
        linkedList.addToBeginning(one);
        linkedList.addToEnd(two);
        linkedList.addToEnd(three);
        Assert.assertEquals(two, linkedList.getItem(two));
    }

    @Test
    void removeItem() {
        String one = "one";
        String two = "two";
        String three = "three";
        linkedList.addToBeginning(one);
        linkedList.addToEnd(two);
        linkedList.addToEnd(three);
        linkedList.removeItem(one);
        Assert.assertFalse(linkedList.contains(one));
    }

    @Test
    void getLength() {
        linkedList.addToBeginning("one");
        linkedList.addToEnd("two");
        Assert.assertEquals(2, linkedList.getLength());
    }
}