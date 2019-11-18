// Run 'main' to see an example of HeapSort
// If you create an instance of TestHeap, you can explore the contents of 
// the heap from within the BlueJ workbench.
public class TestHeap
{
    public Heap<Integer> h;

    public TestHeap () {
        h = new Heap<Integer> ();

        int[] numbers = {4, 9, 2, 10, 5, 3, 6, 1, 8, 7};
        
        // build the heap by adding all the numbers
        for (int i = 0; i < numbers.length; i = i+1) {
            h.insert (numbers[i]);
        }

    }

    public static void main (String[] args) {
        // demonstrate use of heap by sorting an array of numbers
        Heap<Integer> h = new Heap<> ();
        int[] numbers = {4, 9, 2, 10, 5, 3, 6, 1, 8, 7};
        
        // build the heap by adding all the numbers
        for (int i = 0; i < numbers.length; i = i+1) {
            h.insert (numbers[i]);
        }
        
        // create a sorted array
        int[] sorted = new int[numbers.length];
        for (int i=sorted.length-1; i>=0; i=i-1) {
            sorted[i] = h.removeMax ();
        }
        
        // display the sorted array
        for (int i=0; i<sorted.length; i=i+1) {
            System.out.println ("i = " + i + " value: " + sorted[i]);
        }
    }
}
