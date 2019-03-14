package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class ContainsTests {

    @Test
    public void emptyContainsTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();

        // When
        boolean actual = linkedList.contains("false");

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void nonEmptyContainsTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        String expectedTrue = "true";
        String expectedFalse = "false";
        linkedList.add("hi");
        linkedList.add("hello");
        linkedList.add(expectedTrue);
        linkedList.add("bye");

        // When
        boolean actualTrue = linkedList.contains(expectedTrue);
        boolean actualFalse = linkedList.contains(expectedFalse);

        // Then
        Assert.assertTrue(actualTrue);
        Assert.assertFalse(actualFalse);
    }
}
