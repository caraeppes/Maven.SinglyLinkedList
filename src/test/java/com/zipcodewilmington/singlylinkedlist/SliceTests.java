package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class SliceTests {

    @Test
    public void sliceWholeListTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        Integer expected1 = 3;
        Integer expected2 = 12;
        int expectedSize = 2;
        linkedList.add(expected1);
        linkedList.add(expected2);

        // When
        SinglyLinkedList slicedList = linkedList.slice(0,2);
        Integer actual1 = (Integer) slicedList.get(0);
        Integer actual2 = (Integer) slicedList.get(1);
        int actualSize = slicedList.size();

        // Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void slicePartOfListTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        Integer expected = 3;
        int expectedSize = 1;
        linkedList.add(324);
        linkedList.add(expected);
        linkedList.add(23);
        linkedList.add(333);

        // When
        SinglyLinkedList slicedList = linkedList.slice(1,2);
        Integer actual = (Integer) slicedList.get(0);
        int actualSize = slicedList.size();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedSize, actualSize);
    }


    @Test (expected = Exception.class)
    public void invalidSliceTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(324);
        linkedList.add(4);
        linkedList.add(23);
        linkedList.add(333);

        // When
        linkedList.slice(1,5);
    }

}
