public class DListNode
{   private DListNode next;
    private DListNode previous;
    private String data;
    public DListNode (DListNode next, DListNode previous, String data) {
        this.next = next;
        this.previous = previous;
        this.data = data;
    }

    public String getData () {
        return data;
    }

    public DListNode getNext () {
        return next;
    }

    public DListNode getPrevious() {
        return previous;   
    }

    public void setNext (DListNode next) {
        this.next = next;   
    }

    public static void main(){

        System.out.println("Starting list");
        DListNode myList = new DListNode (null,null,"0 item");
        System.out.println(myList);
        // Process the current item
        myList.join("1 Item");
        myList.join("2 Item");
        myList.join("3 Item");
        System.out.println (myList);

        System.out.println("Starting list");
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(3));
        
        myList.set("0 item.0",0);
        myList.set("1 item.1",1);
        myList.set("2 item.2",2);
        myList.set("3 item.3",3);
        
        System.out.println(myList);
        
        myList.insert("2.1 item",2);
        myList.insert("0.1 item",0);
        myList.insert("3.1 item",3);
        
        System.out.println(myList);
        
        myList.delete(2);
        
        
    }

    public String toString () {
        String result = "";

        result += "[";
        DListNode current = this;

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

    public void join (String data) {
        DListNode current = this;

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from data and place it in the lastItem
        current.setNext (new DListNode (null, current, data));              // <1>
    }

    public String get (int i) {
        DListNode current = this;
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
        DListNode current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                current.data = data;
                return;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i);
    }

    public DListNode insert (String data, int index) {
        DListNode current = this;
        int currentIndex = 0;
        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {   // <1>
            return new DListNode (current, null, data);
        }

        while (current != null) {
            if (currentIndex+1 == index) {                                    // <2>
                DListNode insertedNode = new DListNode (current.getNext(),current, data); // <3>
                current.next = insertedNode;                                    // <4>
                return this;                                                    // <5>
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); // <6> 

    }

    // deletes node at given index number, and returns head of new list
    public DListNode delete (int index) {
        DListNode current = this;
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
    //tienes que pulir el codigo y ver por que es diferente del profe
    //testea varios numeros

}
