package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class CopyTests {

    @Test
    public void copyEmptyTest(){
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        int expectedSize = 0;

        // When
        SinglyLinkedList copy = linkedList.copy();
        int actualSize = copy.size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertNull(copy.getHead());
        Assert.assertNotEquals(linkedList, copy);
    }

    @Test
    public void copyTest(){
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        String expected1 = "copy";
        linkedList.add(expected1);
        String expected2 = "cat";
        linkedList.add(expected2);
        String expected3 = "meow";
        linkedList.add(expected3);
        int expectedSize = 3;

        // When
        SinglyLinkedList copy = linkedList.copy();
        int actualSize = copy.size();
        String actual1 = (String) linkedList.getHead().getElement();
        String actual2 = (String) linkedList.getHead().getNext().getElement();
        String actual3 = (String) linkedList.getHead().getNext().getNext().getElement();

        // Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expectedSize, actualSize);
    }
}
