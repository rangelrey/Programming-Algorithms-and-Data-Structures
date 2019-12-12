
public class Queue
{   int max;
    int size;
    int[] arr;
    int base;
    public Queue(int size, int max){

        arr = new int[max];
        this.size = size;
        this.max = max;
  
       

    }

    public void push (int a){

        if (a<=size){
            arr[size] = a;
            size++;
        }

    }

    public void leave (){

        

    }

    public void set (int value, int index)  { // <1>
      

        arr[index] = value;
    }
    
    public int size(){
        int count=0;
        for (int i =0; i<arr.length; i++){
            count++;
            
        } return count;
    }
    
    public int get(int index){
     return arr[index];   
    }

    public static void main(){

       // int[] a = new int[]{1,2,3,4,5,6};

      
    }
}
