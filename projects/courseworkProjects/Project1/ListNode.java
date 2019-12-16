
public class ListNode<T>{
     private ListNode<T> next;
     private T item;

    public ListNode (ListNode<T> next,  T item) {
        this.next = next;
        this.item = item;
    }
    // accessor for 'next'
    public ListNode<T> getNext () {return next;}
    // mutator for 'next'
    public void setNext (ListNode<T> next) {this.next = next;}

    // accessor for 'item' field
    public T getItem () {return item;}
    
    public  void setItem(T newItem) {this.item= newItem;}

    public String toString () {
        String result = "";
        ListNode current = this;
        while (current!=null){

            result +=" - "+current.getItem()+"\n";
            current = current.getNext();
        }
        return result;
    }
}
