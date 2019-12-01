public class Sorts {

    public static String arrayToString (int[] array) {
        String result = "";

        result += "[";
        for (int i=0; i<array.length; i+=1) {
            result += array[i] + ", ";
        }
        result += "]";

        return result;
    }

    public static void swap (int[] numbers, int i1, int i2) {
        int temp;

        temp = numbers[i1];
        numbers[i1] = numbers[i2];
        numbers[i2] = temp;
    }

    public static void bubbleSort (int[] numbers) {
        boolean madeSwap;                                     // <1>

        do {                                                  // <2>
            madeSwap = false;                                   // <3>
            for (int i = 0; i < numbers.length-1; i = i + 1) {  // <4>
                if (numbers[i] > numbers[i+1]) {                  // <5>
                    swap (numbers, i, i+1);                         // <6>
                    madeSwap = true;                                // <7>
                }
            }
        } while (madeSwap);                                 // <8>
    }

    public static void selectionSort (int[] numbers) {
        int t;

        t = 0;                                                  // <1>
        do {
            int smallest = findSmallestNumberIndex (numbers, t);  // <2>
            swap (numbers, t, smallest);                          // <3>
            t = t + 1;                                            // <4>
        } while (t != numbers.length);                          // <5>
    }

    public static int findSmallestNumberIndex (int[] array, int start) {
        int smallest = start;

        for (int current = smallest; current < array.length; current += 1) {
            if (array[current] < array[smallest]) {
                smallest = current;
            }
        }

        return smallest;
    }

    public static void insertionSort (int[] numbers) {
        int t;

        t = 0;                                                  // <1>
        do {
            doInsert (numbers, t);                                // <2>
            t = t + 1;                                            // <3>
        } while (t != numbers.length);                          // <4>
    }

    public static void doInsert (int[] numbers, int top) {
        for (int i=0; i<top; i=i+1) {
            if (numbers[i] > numbers[top]) {
                swap (numbers, i, top);
            }
        }
    }

    public static void main (String[] args) {
        testBubbleSort ();
        testSelectionSort ();
        testInsertionSort ();
    }

    private static void testBubbleSort () {
        System.out.println ("BubbleSort:");
        int[] numbers = {3, 1, 5, 7, 2, 4, 6};
        System.out.println ("Start: " + arrayToString(numbers));
        bubbleSort (numbers);
        System.out.println ("After: " + arrayToString(numbers));
    }

    private static void testInsertionSort () {
        System.out.println ("InsertionSort:");
        int[] numbers = {3, 1, 5, 7, 2, 4, 6};
        System.out.println ("Start: " + arrayToString(numbers));
        insertionSort (numbers);
        System.out.println ("After: " + arrayToString(numbers));
    }

    private static void testSelectionSort () {
        System.out.println ("SelectionSort:");
        int[] numbers = {3, 1, 5, 7, 2, 4, 6};
        System.out.println ("Start: " + arrayToString(numbers));
        selectionSort (numbers);
        System.out.println ("After: " + arrayToString(numbers));
    }
}