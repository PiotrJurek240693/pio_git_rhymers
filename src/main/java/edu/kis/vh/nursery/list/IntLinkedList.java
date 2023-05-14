package edu.kis.vh.nursery.list;

/**
 * This class represents a singly linked list that stores integer values.
 */
public class IntLinkedList {

    private static final int IF_EMPTY = -1;
    private Node last;
    private int i;

    /**
     * Adds an integer value to the end of the linked list.
     *
     * @param i the integer value to be added
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Checks if the linked list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks if the linked list is full.
     * In this implementation, the linked list is never full.
     *
     * @return always false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Retrieves the value of the last element in the linked list.
     *
     * @return the value of the last element, or IF_EMPTY if the list is empty
     */
    public int top() {
        if (isEmpty())
            return IF_EMPTY;
        return last.getVALUE();
    }

    /**
     * Removes and returns the last element from the linked list.
     *
     * @return the value of the removed element, or IF_EMPTY if the list is empty
     */
    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
        int ret = last.getVALUE();
        last = last.getPrev();
        return ret;
    }

}
