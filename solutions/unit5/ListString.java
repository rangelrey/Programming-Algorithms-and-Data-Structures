public class ListString {
    private ListNode head;

    // the constructor simply creates the class with a null value for "head"
    public ListString () {
        head = null;
    }

    // the join method creates a new ListNode for the given item of data
    // and appends the new item to the end of the list
    public void join (String data) {
        if (head == null) {      
            head = new ListNode (null, data);
            return;              
        } else {
            head.join (data);
        }
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
            head.set (data, index);
        }
    }

    public void insert (String data, int index) {  
        if (head == null) {
            join (data);
        } else {
            head = head.insert (data, index);
        }
    }

    public void delete (int index) {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException (index);
        } else {
            head = head.delete (index);
        }
    }

    public String toString () {
        if (head == null) {
            return "[]";
        } else {
            return head.toString ();
        }
    }
}