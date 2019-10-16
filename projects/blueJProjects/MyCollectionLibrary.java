/*import java.utils.Arrays;*/
public class MyCollectionLibrary {
    public static void main (String[] args) {
        int[] array1 = {1};
        int[] array2 = {1};
        String[] s = {"a","bb","ccc","edke","kkk"};
        int[] numbers = {2,3,4,1};
        int[] result = returnLengths(s);

    

        for (int i = 0; i < result.length; i = i+1) {
            System.out.println ( result[i]);
        }

    }

    public static int[] returnLengths (String[] strings) {
        int[] result = new int[strings.length];

        for (int i = 0; i < strings.length; i = i+1) {
            result[i] = strings[i].length();
        }

        return result;
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

    


    public static void swap (int[] numbers, int i1, int i2) {
        int temp;
        
        temp = numbers[i1];
        numbers[i1] = numbers[i2];
        numbers[i2] = temp;
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

    public static void selectionSort (int[] numbers) {
        int t;

        t = 0;                                                  // <1>
        do {
            int smallest = findSmallestNumberIndex (numbers, t);  // <2>
            swap (numbers, t, smallest);                          // <3>
            t = t + 1;                                            // <4>
        } while (t != numbers.length);                          // <5>
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

    public static int findNumber (int[] numbers, int toFind) {
        int result;
        int t = 0;
        do{ if(toFind==numbers[t]){
                result = toFind;

                break;

            }else{ result = -1;
                t = t+1;}
        }

        while (t<numbers.length);
        return result;
    }

    public static int binarySearch (int[] numbers, int toFind) {
        int l = 0;
        int r = numbers.length - 1;

        while (l <= r) {
            int m = (l + r)/2;  // compute index of middle-ish number

            if (toFind == numbers[m]) {       // SUCCESS! We found our number, so return its index
                return m;
            } else if (toFind < numbers[m]) { // choose the LEFT part
                r = m-1;
            } else { // (toFind > numbers[m])  choose the RIGHT part
                l = m+1;
            }
        }

        // we get here if the number has not been found
        return -1;
    }



}
