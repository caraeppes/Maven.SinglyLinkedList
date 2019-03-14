package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class SortTests {

    @Test
    public void sortIntegersTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(2);
        int expectedFind1 = 0;
        int expectedFind2 = 1;
        int expectedFind3 = 2;
        int expectedFind5 = 3;

        // When
        linkedList.sort();
        int actualFind1 = linkedList.find(1);
        int actualFind2 = linkedList.find(2);
        int actualFind3 = linkedList.find(3);
        int actualFind5 = linkedList.find(5);

        // Then
        Assert.assertEquals(expectedFind1, actualFind1);
        Assert.assertEquals(expectedFind2, actualFind2);
        Assert.assertEquals(expectedFind3, actualFind3);
        Assert.assertEquals(expectedFind5, actualFind5);
    }

    @Test
    public void sortStringsTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add("mother");
        linkedList.add("of");
        linkedList.add("dragons");
        int expectedFindMother = 1;
        int expectedFindOf = 2;
        int expectedFindDragons = 0;

        // When
        linkedList.sort();
        int actualFindMother = linkedList.find("mother");
        int actualFindOf = linkedList.find("of");
        int actualFindDragons = linkedList.find("dragons");

        // Then
        Assert.assertEquals(expectedFindMother, actualFindMother);
        Assert.assertEquals(expectedFindOf, actualFindOf);
        Assert.assertEquals(expectedFindDragons, actualFindDragons);
    }


    @Test
    public void sortOneElementTest(){
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add("alone");
        SinglyLinkedList.Node expectedHead = linkedList.getHead();

        // When
        linkedList.sort();
        SinglyLinkedList.Node actualHead = linkedList.getHead();

        // Then
        Assert.assertEquals(expectedHead, actualHead);
    }

}
