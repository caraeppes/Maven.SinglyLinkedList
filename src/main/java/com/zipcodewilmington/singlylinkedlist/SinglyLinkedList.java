package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<E extends Comparable<E>> {

    private Node head = null;
    private Integer size = 0;


    public void add(E element) {
        if (head == null) {
            head = new Node(element);
        } else {
            Node nextNode = head;
            while (nextNode.next != null) {
                nextNode = nextNode.next;
            }
            nextNode.next = new Node(element);
        }
        size++;
    }


    public void remove(E element) throws Exception {
        int index = find(element);
        if (index == -1) {
            throw new Exception("Element does not exist in list!");
        }
        if (index == 0) {
            head = head.next;
            size--;
        } else {
            Node previousNode = head;
            for (int i = 1; i < index; i++) {
                previousNode = previousNode.next;
            }
            previousNode.setNext(previousNode.next.next);
            size--;
        }
    }


    public boolean contains(E element) throws Exception {
        for (int i = 0; i < size; i++) {
            if (element.equals(get(i))) {
                return true;
            }
        }
        return false;
    }


    public int find(E element) throws Exception {
        for (int i = 0; i < size; i++) {
            if (element.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }


    public int size() {
        return size;
    }


    public E get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Invalid index.");
        }
        Node nextNode = head;
        for (int i = 1; i <= index; i++) {
            nextNode = nextNode.next;
        }
        return (E) nextNode.getElement();
    }


    public SinglyLinkedList<E> copy() {
        SinglyLinkedList returnList = new SinglyLinkedList<>();
        Node nodeToCopy = head;
        for (int i = 0; i < size; i++) {
            returnList.add(nodeToCopy.element);
            nodeToCopy = nodeToCopy.next;
        }
        return returnList;
    }


    public void sort() {
        if (size > 1) {
            for (int i = 0; i < size; i++) {
                Node currentNode = head;
                Node nextNode = head.getNext();
                for (int j = 0; j < size - 1; j++) {
                    if ((currentNode.element).compareTo(nextNode.element) > 0) {
                        E temp = (E) currentNode.element;
                        currentNode.setElement(nextNode.element);
                        nextNode.setElement(temp);
                    }
                    currentNode = nextNode;
                    nextNode = nextNode.next;
                }
            }
        }
    }


    public Node getHead() {
        return head;
    }


    static class Node<E extends Comparable<E>> {

        private Node next;
        private E element;

        public Node(E element) {
            this.element = element;
            this.next = null;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }
    }
}
