package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class SizeTests {

    @Test
    public void emptySizeTest(){
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        int expected = 0;

        // When
        int actual = linkedList.size();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void nonEmptyizeTest(){
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add("one");
        linkedList.add("two");
        int expected = 2;

        // When
        int actual = linkedList.size();

        // Then
        Assert.assertEquals(expected, actual);

    }
}
