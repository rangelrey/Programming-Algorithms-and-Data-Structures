public class ArrayInt
{
    private int[] array;
    private int currentSize;
    private int maximumSize;

    
    public static void main (String[] args) {
        ArrayInt arr1 = new ArrayInt (10, 10);

        System.out.println ("Array 1: " + arr1);

        ArrayInt arr2 = new ArrayInt (10, 5);

        System.out.println ("Array 2: " + arr2);

        ArrayInt arr3 = new ArrayInt (10, 0);

        System.out.println ("Array 3: " + arr3);
    }

    public String toString () {
        String result = "";

        result = result + "[";
        for (int i=0; i<currentSize; i=i+1) {
            result = result + array[i];
            if (i+1<currentSize) {     // only add the ", " if we are not at the end
                result = result + ", ";
            }
        }
        result = result + "]";

        return result;
    }

    public ArrayInt (int maximumSize, int currentSize) {
        array = new int[maximumSize];
        this.maximumSize = maximumSize;
        this.currentSize = currentSize;
    }
}
