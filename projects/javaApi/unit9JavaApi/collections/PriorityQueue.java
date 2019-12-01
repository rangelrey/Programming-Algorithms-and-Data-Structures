package collections;

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
    public Heap<T> getHeap() {
     return queue;   
    }

    // Uses the insert method on the heap
    public void insert (T item) {
        queue.insert (item);
    }

    // uses the removeMax method on the heap
    public T takeNext () {
        return queue.removeMax ();
    }

    public String toString(){
        String result = "";
        int i;
        for (i=0; i>queue.getData().length; i++){
       
            result += queue.getData()[i];
        }
        return result;

    }
}
