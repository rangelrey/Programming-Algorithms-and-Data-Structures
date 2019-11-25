public class ListNode {
    private ListNode next;
    private String data;

    public ListNode (ListNode next, String data) {
        this.next = next;
        this.data = data;
    }

    // accessor for 'next'
    public ListNode getNext () {
        return next;
    }

    // mutator for 'next'
    public void setNext (ListNode next) {
        this.next = next;
    }

    // accessor for 'data' field
    public String getData () {
        return data;
    }

    public void join (String data) {
        ListNode current = this;

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from data and place it in the lastItem
        current.setNext (new ListNode (null, data));              // <1>
    }

    public String get (int i) {
        ListNode current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                return current.getData ();
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

    public void set (String data, int i) {
        ListNode current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                current.data = data;
                return;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

    public ListNode insert (String data, int index) {
        ListNode current = this;
        int currentIndex = 0;
        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {  
            return new ListNode (current, data);
        }

        while (current != null) {
            if (currentIndex+1 == index) {                                 
                ListNode insertedNode = new ListNode (current.getNext(), data); 
                current.next = insertedNode;                                    
                return this;    
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); 
    }

    // deletes node at given index number, and returns head of new list
    public ListNode delete (int index) {
        ListNode current = this;
        int currentIndex = 0;

        if (index == 0) { // delete first node, so just return the next node
            return next;
        }

        while (current != null) {
            if (currentIndex+1 == index) {
                // the node to delete is the next one
                // so we set the current node's next to the next of the next
                current.setNext ( current.getNext().getNext());

                return this; // remember, the delete method was called on the first item
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);  
    }

    public String toString () {
        String result = "";

        result += "[";
        ListNode current = this;

        while (current != null) {
            result += current.data;
            if (current.next != null) {
                result += ", ";
            }
            current = current.next;
        }

        result += "]";

        return result;
    }
}