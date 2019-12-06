public class List<T> {
    private ListNode<T> head;
    private T item;

    // the constructor simply creates the class with a null value for "head"
    public List () {
        head = null;
    }

    public ListNode<T> getListNode() {
        return this.head;
        
    }
    
    public ListNode<T>next() {return this.getListNode().getNext();}
    
    
    // the list is empty if it starts with null
    public boolean isEmpty () {
        return head == null;
    }

    public int size () {
        int count = 0;
        ListNode<T>current = head;
        while (current != null) {
            count += 1;
            current = current.getNext ();
        }
        return count;
    }

    public boolean contains (T item) {
        ListNode<T>current = head;
        while (current != null) {
            if (current.getItem().equals(item)) {
                return true;
            }
            current = current.getNext ();
        }
        return false;
    }

    // the join method creates a new ListNode<T>for the given item of item
    // and appends the new item to the end of the list
    public  void join (T item) {
        if (head == null) {                         // <1>
            head = new ListNode<T>(null, item);
            return;                                   // <2>
        }

        ListNode<T>current = head;                    // <3>

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from item and place it in the lastItem
        current.setNext (new ListNode<T>(null, item));
    }

    public T leave () {
        if (head == null) {
            return null;
        } else {
            T result = head.getItem ();
            head = head.getNext ();
            return result;
        }
    }

    public T get (int index) {
        ListNode<T> current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                return current.getItem ();
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);
    }

    public void set (T item, int index) {
        ListNode<T> current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                current.item = item; ;
                return;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); 
    }

    public void insert (T item, int index) {   

        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {   // set a new first item in list
            head = new ListNode<T>(head, item);
        }

        ListNode<T>current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex+1 == index) {   
                ListNode<T>insertedNode = new ListNode<T>(current.getNext(), item); 
               current.setNext(insertedNode);   
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

        ListNode<T>current = head;
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
    public void deleteItem (ListNode<T>ListNode) {
        System.out.println("head: "+head.getItem());
        System.out.println("to Remove: "+ListNode.getItem());
        if (head.getItem().equals (ListNode.getItem())) { // delete the first item
            System.out.print("deleting: "+head.getItem());
            head = head.getNext ();
            System.out.println(head);
            return;
        }

        ListNode<T>current = head;
        while (current != null) {

            if (current.getNext().getItem().equals(ListNode.getItem())) {
         
                
                current.setNext (current.getNext().getNext());
               
                return;
            }
            current = current.getNext();
         
        }
    }

    public String toString () {
        String result = "";

        result += "[";
        ListNode<T>current = head;

        while (current != null) {
            result += current.getItem();
            if (current.getNext() != null) {
                result += ", ";
            }
            current = current.getNext();
        }

        result += "]";

        return result;
    }
    
    public void  reset(){
        head = null;
         
    }
    
    public void deleteSubList( List subListToDelete) {
        ListNode<T>current;
        current = subListToDelete.getListNode();
        while( current!=null) {

        

        this.deleteItem(current);

        current = current.getNext();
        System.out.println(this);
        
    }
}
    
    public void showList(){
        if (this.getListNode()!=null){
      this.getListNode().showListNode(); 
    }
        
    }
    
    

}
