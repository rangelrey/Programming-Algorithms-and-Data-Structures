public class ListString {
  private ListNode head;

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
    if (head != null) { 
        
        ListNode current = head;  
        
        while (current.getNext().getNext () == null) {
            current = current.getNext ();
            
        }
        current.setNext (null);
    }

      
      
    
    return "";
  }

  public String get (int index) {
    // COMPLETE THIS METHOD
    return "";
  }

  public void set (String data, int index) {
    // COMPLETE THIS METHOD
  }

  public void insert (String data, int index) {   // <4>
    // COMPLETE THIS METHOD
  }

  public void delete (int index) {
    // COMPLETE THIS METHOD
  }
}
