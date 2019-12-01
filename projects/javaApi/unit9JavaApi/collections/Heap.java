package collections;



/**
 * This class implements a Heap, as described in Unit 7 of the notes.
 * 
 * Note that due to how Java implements generics, we need to store 
 * everything as Object and use casts where necessary. 
 */
public class Heap<T extends Comparable<T>>
{
    // we store our data in an array of type Object
    private T[] data;

    // To make the array 'work' as a binary tree, we need to access the 
    // left/right/parent parents for any position
    // Here we write methods which compute those positions for us

    // implements 2*i
    public int leftPosn (int posn) {
        return 2*posn;
    }

    // implements 2*i+1
    public int rightPosn (int posn) {
        return 2*posn + 1;
    }

    // implements floor(i/2) - note that division is integer, 
    // so any remainder is discarded automatically
    public int parent (int posn) {
        return posn/2;
    }

    // this checks if a given posn is valid, i.e. within the array limits
    public boolean isValid (int posn) {
        return (posn >= 1 && posn <= data.length);
    }

    // convenience method to check if one cell larger than another
    private boolean isLarger (int i, int j) {
        return (data[i-1].compareTo(data[j-1]) > 0);
    }

    // a swap method is used later
    private void swapValues (int i, int j) {
        T temp = data[i-1];
        data[i-1] = data[j-1];
        data[j-1] = temp;
    }

    // constructor sets up an empty array
    public Heap () {
        // creating a generic array is difficult 
        // - this approach works
        // - a better approach needs reflection
        data = (T[])(new Comparable[0]);
    }
    
    public T[] getData(){
     return this.data;   
    }

    // insert: add a new item to the heap
    // 1. we increase the size of the array, and add the item to the end
    // 2. we ensure we have a heap, by checking with parent
    public void insert (T value) {
        extendArray ();                 // makes room in the array
        data[data.length-1] = value;    // adds value to the end
        reheap (data.length);           // method to make sure we have a heap
    }

    // removeMax: remove the root item from the heap, returning it
    public T removeMax () {
        if (data.length == 0) { // do something sensible if the heap is empty
            return null;
        }
        T result = data[0];
        deleteMax ();
        return result;
    }

    // extends the array by one item - we have to copy the old array
    // we take advantage of a library method to achieve this
    //
    // Note: extending by one item at a time can be slow
    // More efficiently, double the array size each time, and keep a
    // pointer to the top of the array. 
    // i.e. instead of data.length-1 compare to 'top'
    private void extendArray () {
        data = java.util.Arrays.copyOf(data, data.length+1);
    }

    // if the given position has a value 'larger' than that in its 
    // parent, then swap them, and repeat from the parent
    // NB: 'posn' uses tree-index (starting from 1)
    // we need to subtract 1 when looking in the array (starting from 0)
    private void reheap (int posn) {
        int parentPosn = parent(posn);

        if (isValid(parentPosn)) {
            if (isLarger(posn, parentPosn)) {
                swapValues (posn, parentPosn);
                // repeat from parent
                reheap (parentPosn);
            }
        } 
        // if the parentPosn is invalid, then do nothing - we should 
        // be at the root
    }

    private void deleteMax () {
        // copy the last item to the front, replacing the root node
        data[0] = data[data.length-1];
        // reduce the array size by one item
        data = java.util.Arrays.copyOfRange (data, 0, data.length-1);
        reverseReheap (1);
    }

    // if the given position has a value 'smallers' than that in its 
    // children, then swap with the largest child, and repeat from that child
    // NB: 'posn' uses tree-index (starting from 1)
    // we need to subtract 1 when looking in the array (starting from 0)
    private void reverseReheap (int posn) {
        int left = leftPosn(posn);
        int right = rightPosn(posn);

        if (isValid(left) && isValid(right)) { // when both children are present
            int largestChild = left;
            if (isLarger(right, left)) {
                largestChild = right;
            }
            if (isLarger (largestChild, posn)) {
                swapValues (largestChild, posn);
                reverseReheap (largestChild);
            }
        } else if (isValid(left)) { // only the left child is present
            if (isLarger (left, posn)) {
                swapValues (left, posn);
                reverseReheap (left);
            }
        } else if (isValid(right)) { // only the right child is present
            if (isLarger (right, posn)) {
                swapValues (right, posn);
                reverseReheap (right);
            }
        }
    }
    
       
    }
    
    

