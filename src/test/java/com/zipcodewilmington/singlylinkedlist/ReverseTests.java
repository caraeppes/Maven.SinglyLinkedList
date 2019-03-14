package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class ReverseTests {

    @Test
    public void reverseOneElementTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        Integer expected = 3;
        linkedList.add(expected);

        // When
        linkedList.reverse();
        Integer actual = (Integer) linkedList.get(0);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseTwoElementsTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        Integer expected1 = 123;
        Integer expected2 = 321;
        linkedList.add(expected1);
        linkedList.add(expected2);

        // When
        linkedList.reverse();
        Integer actual1 = (Integer) linkedList.get(1);
        Integer actual2 = (Integer) linkedList.get(0);

        // Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }

    public void reverseManyElementsTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        String expected1 = "a";
        String expected2 = "r";
        String expected3 = "a";
        String expected4 = "C";
        linkedList.add(expected1);
        linkedList.add(expected2);
        linkedList.add(expected3);
        linkedList.add(expected4);

        // When
        linkedList.reverse();
        String actual1 = (String) linkedList.get(3);
        String actual2 = (String) linkedList.get(2);
        String actual3 = (String) linkedList.get(1);
        String actual4 = (String) linkedList.get(0);

        // Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
        System.out.println(linkedList.size());

    }
}
