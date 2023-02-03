public class list1 {
    public static void main(String[] args) {
        // create a new "blank" list
        LinkedList l1 = new LinkedList();
        // now create some items (Integer objects)
        Integer i1 = new Integer(74);
        Integer i2 = new Integer(-5);
        Integer i3 = new Integer(28);
        Integer i4 = new Integer(52);
        Integer i5 = new Integer(-27);
        //  add them to the list
        l1.addFirst(new ListNode(i1, null));
        l1.addFirst(new ListNode(i2, null));
        l1.addFirst(new ListNode(i3, null));
        l1.addFirst(i4);
        // and check they are displayed as expected
        l1.display();
    }
}
