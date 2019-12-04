
public class ListNodeAd
{
   private ListNodeAd next;
   private Data data;


    public ListNodeAd (ListNodeAd next,  Data data) {
        this.next = next;
        this.data = data;
    }

    // accessor for 'next'
    public ListNodeAd getNext () {
        return next;
    }

    // mutator for 'next'
    public void setNext (ListNodeAd next) {
        this.next = next;
    }

    // accessor for 'data' field
    public Data getData () {
        return data;
    }
    
    public String getOrigin() {
        return data.getOrigin();
    }
    

    public void join (Data data) {
        ListNodeAd current = this;

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from data and place it in the lastItem
        current.setNext (new ListNodeAd (null, data));             
    }

    public Data get (int i) {
        ListNodeAd current = this;
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

    public void set (Data data, int i) {
        ListNodeAd current = this;
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

    public ListNodeAd insert (Data data, int index) {
        ListNodeAd current = this;
        int currentIndex = 0;
        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {  
            return new ListNodeAd (current, data);
        }

        while (current != null) {
            if (currentIndex+1 == index) {                                 
                ListNodeAd insertedNode = new ListNodeAd (current.getNext(), data); 
                current.next = insertedNode;                                    
                return this;    
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); 
    }

    // deletes node at given index number, and returns head of new list
    public ListNodeAd delete (int index) {
        ListNodeAd current = this;
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

        result = "Node: ";
        ListNodeAd current = this;

       
          result += current.data;
          
       

        

        return result;
    }
}
