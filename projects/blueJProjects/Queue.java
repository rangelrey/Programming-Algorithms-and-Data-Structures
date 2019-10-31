public class Queue
{

    public String[] array;
    public int currentSize;
    public int maximumSize;

    public static void main (String[] args) {

        Queue qu1 = new Queue(5);
        qu1.join("katka");
        System.out.println("..");
        qu1.join("lucy");
        System.out.println("..");
        qu1.join("elina");
        System.out.println("..");
        qu1.join("Sonja");
        System.out.println("..");
        qu1.join("Anushari");
        for(int i=0; i< qu1.currentSize ;i=i+1) {
            if(qu1.isEmpty()==true); {
                qu1.leave();
            }
            
        }
        qu1.leave();
        System.out.println(qu1);

    }

    public Queue (int maximumSize) {
        array = new String[maximumSize];
        this.maximumSize = maximumSize;
        this.currentSize = 0;             // our stack starts empty
    }

    public void join (String value) {
        if (currentSize >= maximumSize) {
            System.out.println ("Error: Join has exceeded available space");
        }

        array[currentSize] = value;
        System.out.println("Added "+value);
        currentSize = currentSize + 1;
    }

    public void leave() { 
        //tienes que hacer el delete

        if ( currentSize<=maximumSize) {
            for (int i=0 ; i<currentSize-1 ; i=i+1) {

                array[i] = array[i+1];
            }
            currentSize = currentSize -1;
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
            System.out.println("Queue is not empty");
            result = false;
        }
        return result;
    }

}