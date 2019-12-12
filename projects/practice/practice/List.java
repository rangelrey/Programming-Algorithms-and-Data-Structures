
public class List<T>
{   ListNode<T> head;

    List(){
        head = null;}

    public boolean isEmpty(){
        return head ==null;

    }

    public boolean contains(T data){

        ListNode<T> current = head;

        while (current!= null){

            if (current.getData() == data){
                return true;}

            else {
                current = current.getNext();

            }

        } return false;
    }

    public void join (T data) {
        if (head == null) {                         // <1>
            head = new ListNode (data, null);
            return;                                   // <2>
        }

        ListNode current = head;                    // <3>

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from data and place it in the lastItem
        current.setNext (new ListNode<T> (data, null));
    }

    public void set (T data, int index) {
        ListNode current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                current.data = data;
                return;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); 
    }

    public void insert( T data, int index){
        int currentIndex = 0;
        ListNode current = head;
        while (current != null) {
            if (currentIndex == index) {
                current.setNext(new ListNode<T>(data, current.getNext()));
                return;
            }
            currentIndex += 1;
            current = current.getNext ();
        }

        
    }

    public void delete (int index){
        int currentIndex =0;
        if (index < 0){
            return;}

        if(index==0){
            head = head.getNext();
        }
        
        else{
             ListNode current = head;
             
            while (current != null) {
                if (currentIndex == index-1) {
                    current.setNext( current.getNext().getNext());
                    return;
                }
                currentIndex += 1;
                current = current.getNext ();

            }
    
        }
    

    }
    public static void main(){
        
        List a = new List();
        a.join("a");
        a.join("b");
        a.join("c");
        a.join("d");
        
        a.delete(2);
        System.out.println(a);
        
        
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
