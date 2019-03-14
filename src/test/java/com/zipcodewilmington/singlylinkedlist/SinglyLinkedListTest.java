package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addRemoveSortEverythingTogetherTest() throws Exception {
        // Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        String expected1 = "bonjour";
        String expected2 = "hello";
        String expected3 = "hola";
        String expected4 = "aloha again";
        int expectedSize = 4;

        // When
        linkedList.add("aloha");
        linkedList.add("hola");
        linkedList.add("adios");
        linkedList.add("bonjour");
        linkedList.remove("adios");
        linkedList.add("hello");
        linkedList.remove("aloha");
        linkedList.sort();
        linkedList.add("aloha again");

        String actual1 = (String) linkedList.get(0);
        String actual2 = (String) linkedList.get(1);
        String actual3 = (String) linkedList.get(2);
        String actual4 = (String) linkedList.get(3);

        int actualSize = linkedList.size();

        // Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
        Assert.assertEquals(expectedSize, actualSize);
    }

}
