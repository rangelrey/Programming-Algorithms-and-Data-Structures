public class List<T> {
    private ListNode<T> head;

    // the constructor simply creates the class with a null value for "head"
    public List () {
        head = null;
    }

    // the list is empty if it starts with null
    public boolean isEmpty () {
        return head == null;
    }
    
    public int size () {
        int count = 0;
        ListNode<T> current = head;
        while (current != null) {
            count += 1;
            current = current.getNext ();
        }
        return count;
    }
    
    public boolean contains (T data) {
        ListNode<T> current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext ();
        }
        return false;
    }
    
    // the join method creates a new ListNode for the given item of data
    // and appends the new item to the end of the list
    public void join (T data) {
        if (head == null) {                         // <1>
            head = new ListNode (null, data);
            return;                                   // <2>
        }

        ListNode current = head;                    // <3>

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from data and place it in the lastItem
        current.setNext (new ListNode<T> (null, data));
    }

    public T leave () {
        if (head == null) {
            return null;
        } else {
            T result = head.getData ();
            head = head.getNext ();
            return result;
        }
    }

    public T get (int index) {
        ListNode<T> current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                return current.getData ();
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);
    }

    public void set (T data, int index) {
        ListNode current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                current.data = data;
                return;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); 
    }

    public void insert (T data, int index) {   

        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {   // set a new first item in list
            head = new ListNode<T> (head, data);
        }

        ListNode<T> current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex+1 == index) {   
                ListNode<T> insertedNode = new ListNode<> (current.getNext(), data); 
                current.next = insertedNode;   
                return; 
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);   
    }

    public void delete (int index) {

        if (index == 0) { 
            head = head.getNext ();
            return;
        }

        ListNode<T> current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex+1 == index) {
                // the node to delete is the next one
                // so we set the current node's next to the next of the next
                current.setNext ( current.getNext().getNext());

                return; 
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); 
    }
    
    // version of delete which deletes a node containing the given 'item'
    // -- it follows the pattern above closely, but matches the value, 
    //    not the index
    public void deleteItem (T item) {
        if (head.getData().equals (item)) { // delete the first item
            head = head.getNext ();
            return;
        }
        
        ListNode<T> current = head;
        while (current != null) {
            if (current.getNext().getData().equals(item)) {
                current.setNext (current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public String toString () {
        String result = "";

        result += "[";
        ListNode current = head;

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
