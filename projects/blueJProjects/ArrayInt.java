public class ArrayInt
{
    private int[] array;
    private int currentSize;
    private int maximumSize;

    public static void main (String[] args) {

        ArrayInt arr1 = new ArrayInt (10, 9);
        arr1.insert(99,3);

        System.out.println ("Array 1: " + arr1);
        arr1.delete(3);
        System.out.println ("Array 1: " + arr1);

      
        ArrayInt arr2 = new ArrayInt (10, 5);

        System.out.println ("Array 2: " + arr2);

        ArrayInt arr3 = new ArrayInt (10, 0);

        System.out.println ("Array 3: " + arr3);
    }

    public String toString () {
        String result = "";
        result = result + "[";

        if(currentSize>maximumSize) {
            System.out.println("Current Size cannot be superior than the Maximum Size");
        }

        else {
            for (int i=0; i<currentSize; i=i+1) {

                result = result + array[i];
                if (i+1<currentSize) {     // only add the ", " if we are not at the end
                    result = result + ", ";
                }
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

    public int get (int index) {
        if (index < 0 || index >= currentSize) {
            // For now, print and ignore, but we will change this later.
            System.out.println ("Error in get: index is out of bounds");
            return -1;    // <1>
        }

        return array[index];
    }

    public void insert (int value, int index) {

        if (index < 0 || index >= currentSize || currentSize>maximumSize) {
            System.out.println ("Index out of range");}
        else {
            for (int i=currentSize-2; i>=index ; i=i-1) {
                array[i+1]=array[i];

            }
        }
        array[index]=value;

        currentSize = currentSize + 1;

    }

    public void delete(int index) { 
        //tienes que hacer el delete
        if (index <= 0 || currentSize>=index) {
            for (int i=index ; i<currentSize-1 ; i=i+1) {
                System.out.println(i);
                array[i] = array[i+1];
            }
            currentSize = currentSize -1;
        }
    }  
} 
