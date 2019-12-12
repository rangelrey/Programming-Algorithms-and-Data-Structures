
public class ArrayInt
{
    private int[]  array;
    private int currentSize;
    private int maximumSize;

    public ArrayInt(int maximumSize, int currentSize){
        array = new int[maximumSize];
        this.maximumSize = maximumSize;
        this.currentSize = currentSize;       
    }

    public void set(int index, int j){
        array[index] = j; 
    }

    public int get (int index){
        int result = array[index];
        return result;

    }

    public void join(int i){

        array[currentSize] = i;

    }

    public String toString(){
        String result = "";        
        for (int i=0 ;i<array.length;i++){
            result += array[i]; 
        }
        return result;      
    }

    public static int findSmallestNumberIndex (int[] array, int start) {
        int smallest = start;

        for (int current = smallest; current < array.length; current += 1) {
            if (array[current] < array[smallest]) {
                System.out.println(current);
                smallest = current;
            }
        }
        return smallest;
    }        

    public  static void swap( int[] array , int i, int j){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j]=temp;            
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

    public static void insertionSort(int[] numbers){
        int t =0; 
        do {
            doInsert(t,numbers);
            t++;

        } while (t<numbers.length);
    }

    public static void doInsert(int top, int[] numbers){

        for (int i=0; i<top;i++){
            if (numbers[i]   <numbers[top]){
                swap(numbers,i,top);
            }

        }
    }
    public static int binarySearch(int b, int[] a){
        int l = 0;
        int r = a.length -1;

        while(l<=r){

            int mid = ( (l+r)/2);

            if (b== a[mid]){

                return mid;

            }
            else if (b>a[mid]){

                l++;}
            else{
                r--;   

            }

        }

        return -1;
    }

    public static  void main(){

        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(0,a));

        /*for (int i=0; i<a.length;i++){
        System.out.println(a[i]); */

    }


    


}

    
    

