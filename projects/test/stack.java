
public class stack
{
    int currentSize;
    String[] array;
    int maximumSize;

    public stack (int maximumSize) {
        array = new String[maximumSize];
        this.maximumSize = maximumSize;
        this.currentSize = 0;}

    public void push(String toAdd){
        array[currentSize-1] = toAdd;   
    }

    public String pop(){
        return array[currentSize-1];   

    }

    public String toString () {
        String result = "";
        result = result + "[";
        for (int i=0; i<currentSize; i=i+1) {
            result = result + array[i];
            if (i+1<currentSize) {
                // only add the ", " if we are not at the end
                result = result + ", ";
            }
        }
        result = result + "]";

        return result;}
}
