public class StackString {

    public String[] array;
    public int currentSize;
    public int maximumSize;

    public static void main (String[] args) {

        StackString arr1 = new StackString(5);

        arr1.push("g");
        System.out.println(arr1);
        arr1.isEmpty();
        System.out.println(arr1.pop());

    }

    public StackString (int maximumSize) {
        array = new String[maximumSize];
        this.maximumSize = maximumSize;
        this.currentSize = 0;             // our stack starts empty
    }

    public void push (String value) {
        if (currentSize >= maximumSize) {
            System.out.println ("Error: Stack push has exceeded available space");
        }

        array[currentSize] = value;
        currentSize = currentSize + 1;
    }

    public void print(String [] array) {
        for(int i=0; i>array.length; i=i+1){
            System.out.println(array[i]);
        }

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

    public boolean isEmpty () {
        boolean result;
        if (currentSize == 0){
            result = true;
        }
        else{
            System.out.println("Stack is not empty");
            result = false;
        }
        return result;
    }

         public String pop () {
        if (currentSize == 0) {
            System.out.println ("Error: No elements on stack");
            return "";
        }

        String result = array[currentSize-1];
        //System.out.println(array[currentSize]);
        currentSize = currentSize - 1;
        return result;  // <1>
    }
        }
