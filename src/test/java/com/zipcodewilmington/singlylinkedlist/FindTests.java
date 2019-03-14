package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class FindTests {

    @Test
    public void emptyFindTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        int expected = -1;

        // When
        int actual = linkedList.find("anything");

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsElementFindTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(99);
        int expected1 = 0;
        linkedList.add(23);
        int expected2 = 1;
        linkedList.add(33);
        int expected3 = 2;

        // When
        int actual1 = linkedList.find(99);
        int actual2 = linkedList.find(23);
        int actual3 = linkedList.find(33);

        // Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void doesNotContainElementFindTest() throws Exception {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add("linked");
        linkedList.add("list");
        linkedList.add("tests");
        int expected = -1;

        // When
        int actual = linkedList.find("woo");

        // Then
        Assert.assertEquals(expected,actual);
    }
}
