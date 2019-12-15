public class Stack<T> {
    private ListNode<T> head;

    // the constructor simply creates the class with a null value for "head"
    public Stack () {head = null;}

    // the stack is empty if it starts with null
    public boolean isEmpty () {return head == null;}

    // push an item to the front, by putting it at the head
    public void push (T item) {head = new ListNode<T> (head, item);}
    
    // return an item by removing it from the front
    // -- assume the stack is not empty
    public T pop () {
        T result = head.getData ();
        head = head.getNext ();
        return result;
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