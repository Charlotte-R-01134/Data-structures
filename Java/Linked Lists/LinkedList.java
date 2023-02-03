import com.sun.istack.internal.NotNull;

import java.util.Collection;
import java.util.List;

/**
 * A basic implementation of a singly linked list data structure.
 * A linked list is a chain of ListNode objects
 * The head of the list is the first node of the chain
 * or null in the case of an empty list)
 *
 * @version 1.0
 * @author Charlotte
 */

public class LinkedList {
    private ListNode head;
    private int size;

    /**
     * Constructor for an empty linked list
     */
    public LinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
     */
    public LinkedList(Collection<Object> c) {
        // TODO
        ;
    }

    /**
     * Adds specified node to the beginning of the list
     * @param node A node to add to the list
     */
    public void addFirst(ListNode node) {
        node.setNext(head);
        head = node;
        size++;
    }

    /**
     * Adds a specified Object to the beginning of the linked list by creating a new ListNode
     * @param data A data item to be inputted
     */
    public void addFirst(Object data) {
        head = new ListNode(data, head);
        size++;
    }



    public void addLast(ListNode node) {
        if (size == 0) {
            head = node;
            size = 1;
        }
    }
}