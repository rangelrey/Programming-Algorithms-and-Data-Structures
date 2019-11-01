public class ListNode
{   private ListNode next;
    private String data;
    public ListNode (ListNode next, String data) {
        this.next = next;
        this.data = data;
    }

    public String getData () {
        return data;
    }

    public ListNode getNext () {
        return next;
    }

    public void setNext (ListNode next) {
        this.next = next;   
    }

    public static void main(){
        ListNode forthItem = new ListNode (null, "forth item");
        ListNode thirdItem = new ListNode (forthItem, "third item");
        ListNode middleItem = new ListNode (thirdItem, "middle item");
        ListNode firstItem = new ListNode (middleItem, "first item");

        System.out.println("this is how the list looks like: "+ firstItem);

        ListNode myList = new ListNode (firstItem,"0 item");
        System.out.println(myList);
        // Process the current item
        System.out.println ("The head of the list is: " + myList.getData ());
        myList.join("new last item");

        // Update the list to "remove" the first item
        myList = firstItem.getNext ();
        System.out.println(myList);
        myList.set ("changed name", 1);
        System.out.println(myList);
        myList.set ("setted item", 1);
        System.out.println(myList);
        myList.insert("inserted item",2);
        System.out.println(myList);
        myList.delete(0);
        System.out.println(myList);
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
        throw new ArrayIndexOutOfBoundsException (i);
    }

    public ListNode insert (String data, int index) {
        ListNode current = this;
        int currentIndex = 0;
        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {   // <1>
            return new ListNode (current, data);
        }

        while (current != null) {
            if (currentIndex+1 == index) {                                    // <2>
                ListNode insertedNode = new ListNode (current.getNext(), data); // <3>
                current.next = insertedNode;                                    // <4>
                return this;                                                    // <5>
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); // <6> 

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
    //tienes que pulir el codigo y ver por que es diferente del profe
    //testea varios numeros

}
