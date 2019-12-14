public class AdList {
    private ListNodeAd head;
    private Data data;

    // the constructor simply creates the class with a null value for "head"
    public AdList () {
        head = null;
    }

    public ListNodeAd getListNodeAd() {
        return this.head;
        
    }
    
    public ListNodeAd next() {return this.getListNodeAd().getNext();}
    
    
    // the list is empty if it starts with null
    public boolean isEmpty () {
        return head == null;
    }

    public int size () {
        int count = 0;
        ListNodeAd current = head;
        while (current != null) {
            count += 1;
            current = current.getNext ();
        }
        return count;
    }

    public boolean contains (Data data) {
        ListNodeAd current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext ();
        }
        return false;
    }

    // the join method creates a new ListNodeAd for the given item of data
    // and appends the new item to the end of the list
    public  void join (Data data) {
        if (head == null) {                         // <1>
            head = new ListNodeAd (null, data);
            return;                                   // <2>
        }

        ListNodeAd current = head;                    // <3>

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from data and place it in the lastItem
        current.setNext (new ListNodeAd (null, data));
    }

    public Data leave () {
        if (head == null) {
            return null;
        } else {
            Data result = head.getData ();
            head = head.getNext ();
            return result;
        }
    }

    public Data get (int index) {
        ListNodeAd current = head;
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

    public void set (Data data, int index) {
        ListNodeAd current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                current.set(data, index) ;
                return;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); 
    }

    public void insert (Data data, int index) {   

        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {   // set a new first item in list
            head = new ListNodeAd (head, data);
        }

        ListNodeAd current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex+1 == index) {   
                ListNodeAd insertedNode = new ListNodeAd (current.getNext(), data); 
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

        ListNodeAd current = head;
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
    public void deleteItem (ListNodeAd listNodeAd) {
        System.out.println("head: "+head.getData());
        System.out.println("to Remove: "+listNodeAd.getData());
        if (head.getData().equals (listNodeAd.getData())) { // delete the first item
            System.out.print("deleting: "+head.getData());
            head = head.getNext ();
            System.out.println(head);
            return;
        }

        ListNodeAd current = head;
        while (current != null) {

            if (current.getNext().getData().equals(listNodeAd.getData())) {
         
                
                current.setNext (current.getNext().getNext());
               
                return;
            }
            current = current.getNext();
         
        }
    }

    public String toString () {
        String result = "";

        result += "[";
        ListNodeAd current = head;

        while (current != null) {
            result += current.getData();
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
    
    public void deleteSubList( AdList subListToDelete) {
        ListNodeAd current;
        current = subListToDelete.getListNodeAd();
        while( current!=null) {

        

        this.deleteItem(current);

        current = current.getNext();
        System.out.println(this);
        
    }
}
    
    public void showAdList(){
        if (this.getListNodeAd()!=null){
      this.getListNodeAd().showListNodeAd(); 
    }
        
    }
    
    

}
