package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class AddTests {
    @Test
    public void addTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        String expected1 = "expected";
        String expected2 = "another one";

        // When
        linkedList.add(expected1);
        linkedList.add(expected2);
        String actual1 = (String) linkedList.get(0);
        String actual2 = (String) linkedList.get(1);

        // Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }
}
