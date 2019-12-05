
public class ListNode<T>
{
    private ListNode<T> next;
    private T item;

    public ListNode (ListNode<T> next,  T item) {
        this.next = next;
        this.item = item;
    }

    // accessor for 'next'
    public ListNode<T> getNext () {
        return next;
    }

    // mutator for 'next'
    public void setNext (ListNode<T> next) {
        this.next = next;
    }

    // accessor for 'item' field
    public T getItem () {
        return item;
    }

    
    public void join (T item) {
        ListNode current = this;

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from item and place it in the lastItem
        current.setNext (new ListNode (null, item));             
    }

    public ListNode<T> get (int i) {
        ListNode current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                return current;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

    public void set (T item, int i) {
        ListNode current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                current.item = item;
                return;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

    public ListNode insert (T item, int index) {
        ListNode current = this;
        int currentIndex = 0;
        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {  
            return new ListNode (current, item);
        }

        while (current != null) {
            if (currentIndex+1 == index) {                                 
                ListNode insertedNode = new ListNode (current.getNext(), item); 
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
        ListNode current = this;
        while (current!=null){

            result +=" - "+current.getItem()+"\n";
            current = current.getNext();
        }
        return result;
    }

    public void showListNode(){
        ListNode current = this;
        while (current!=null){

            System.out.println(" - "+current.getItem());
            current = current.getNext();
        }

    }

    
}
