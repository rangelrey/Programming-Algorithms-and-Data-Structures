public class ListString {
    private ListNode head;



    public static void main() {
        ListString miLista = new ListString();
        miLista.join("a");
        miLista.join("b");
        miLista.join("C");

        System.out.println(miLista);
  
        miLista.delete(2);
        System.out.println(miLista);
        
        miLista.size();
        
        
    }

    // the constructor simply creates the class with a null value for "head"
    public ListString () {
        head = null;
    }

    // the join method creates a new ListNode for the given item of data
    // and appends the new item to the end of the list
    public void join (String data) {
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
        current.setNext (new ListNode (null, data));
    }

    public String leave () {
        if (head == null) {
            return null;
        } else {
            String result = head.getData ();
            head = head.getNext ();
            return result;
        }
    }

    public String get (int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            return head.get (index);
        }
    }

    public void set (String data, int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            head.set(data,index);
        }
    }

    public void insert (String data, int index) {   // <4>
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            head.insert(data,index);
        }
    }

    public void delete (int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            head.delete(index);
        }
    }

    public void clear() {
        if (head == null) {
            return ;
        }
        else {
            head = null;
        }
    }
    
    public int size() {
        int i =1;
      
        while(head!=null) {

            i +=1;
            head =head.getNext();
        }
        System.out.println(i);
        return i;
    }

    public String toString () {
        if (head == null) {
            return "[]";
        } else {
            return head.toString ();
        }
    }

}
