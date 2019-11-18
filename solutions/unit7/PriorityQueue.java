
// The Priority queue is a simple wrapper around a heap
// It supports two operations (at a minimum):
// 1. insert adds a new item to the priority queue
// 2. takeNext takes the most urgent item out from the queue and returns it

public class PriorityQueue<T extends Comparable<T>>
{
    private Heap<T> queue;
    
    public PriorityQueue () {
        queue = new Heap<T> ();
    }
    
    // Uses the insert method on the heap
    public void insert (T item) {
        queue.insert (item);
    }
    
    // uses the removeMax method on the heap
    public T takeNext () {
        return queue.removeMax ();
    }
}
