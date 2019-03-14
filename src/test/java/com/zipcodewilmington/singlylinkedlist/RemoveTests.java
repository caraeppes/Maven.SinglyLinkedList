package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTests {

    @Test
    public void removeFirstElementTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add("hello");
        linkedList.add("jello");
        String expectedHead = "jello";
        int expectedSize = 1;
        int expectedFindHello = -1;
        int expectedFindJello = 0;

        // When
        linkedList.remove("hello");
        String actualHead = (String) linkedList.getHead().getElement();
        int actualSize = linkedList.size();
        int actualFindHello = linkedList.find("hello");
        int actualFindJello = linkedList.find("jello");

        // Then
        Assert.assertEquals(expectedHead, actualHead);
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertEquals(expectedFindHello, actualFindHello);
        Assert.assertEquals(expectedFindJello, actualFindJello);
    }

    @Test
    public void removeLastElementTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        int expectedSize = 2;
        int expectedFind3 = -1;

        // When
        linkedList.remove(3);
        int actualSize = linkedList.size();
        int actualFind3 = linkedList.find(3);

        // Then
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertEquals(expectedFind3, actualFind3);
        Assert.assertNull(linkedList.getHead().getNext().getNext());
    }

    @Test
    public void removeMiddleElementTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        String expectedHeadNext = "c";
        int expectedSize = 2;

        // When
        linkedList.remove("b");
        String actualHeadNext = (String) linkedList.getHead().getNext().getElement();
        int actualSize = linkedList.size();

        // Then
        Assert.assertEquals(expectedHeadNext, actualHeadNext);
        Assert.assertEquals(expectedSize, actualSize);
    }


    @Test (expected = Exception.class)
    public void removeFromEmptyListTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();

        // When
        linkedList.remove("anything");
    }

    @Test (expected = Exception.class)
    public void removeNotPresentElementTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add("cara");

        // When
        linkedList.remove("not cara");
    }

}
