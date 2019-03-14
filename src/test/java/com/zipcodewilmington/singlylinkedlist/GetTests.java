package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class GetTests<E> {

    @Test (expected =  Exception.class)
    public void emptyListGetTest() throws Exception{
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.get(0);
    }

    @Test
    public void nonEmptyListGetTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        Integer expected1 = 1324;
        Integer expected2 = 32;
        Integer expected3 = 9;
        linkedList.add(expected1);
        linkedList.add(expected2);
        linkedList.add(expected3);

        // When
        Integer actual1 = (Integer) linkedList.get(0);
        Integer actual2 = (Integer) linkedList.get(1);
        Integer actual3 = (Integer) linkedList.get(2);

        // Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test (expected = Exception.class)
    public void invalidIndexGetTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(123);
        linkedList.add(6543);
        linkedList.add(3);

        // When
        linkedList.get(3);
    }
}
