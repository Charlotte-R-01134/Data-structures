/**
 * ListNode implementation for a singly linked list
 *
 * @version 1.0
 * @author Charlotte
 */
public class ListNode {

    private Object data; // data in a node
    private ListNode next; // pointer for next node

    /**
     * Construct for a new node with the given data and pointer
     * @param Object data
     * @param ListNode next
     */
    public ListNode(Object data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Construct for a new node with no specified data
     * @param ListNode next
     */
    public ListNode(ListNode next){
        this.data = null;
        this.next = next;
    }

    /**
     * Construct for a new node with no specified next
     * @param Object data
     */
    public ListNode(Object data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Set the next node of the current node
     * @param ListNode node
     */
    public void setNext(ListNode node) {
        this.next = node;
    }

    /**
     * get te next node of the current node
     * @return the next ListNode
     */
    public ListNode getNext() {
        return next;
    }

    /**
     * Set the data of the current node
     * @param Object data
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Get the data of the current node
     * @return Object the data Object stored in the node
     */
    public Object getData() {
        return data;
    }
}