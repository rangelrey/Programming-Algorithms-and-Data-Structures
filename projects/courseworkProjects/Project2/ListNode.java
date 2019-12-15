public class ListNode<T> {
    ListNode<T> next;
    T data;

    ListNode (ListNode<T> next, T data) {
        this.next = next;
        this.data = data;
    } 

    public T getData () {
        return data;
    }

    public ListNode<T> getNext () {
        return next;
    }

    public void setNext (ListNode<T> next) {
        this.next = next;
    }

}