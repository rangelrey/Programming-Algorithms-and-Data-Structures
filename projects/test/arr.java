public class arr
{
    int[] array;
    int maxSize;
    int currentSize;

    public arr(int maxSize, int currentSize) {
        array = new int[maxSize];
        this.maxSize = maxSize;
        this.currentSize = currentSize;   

    }
    
    public int get(int i){
        return array[i];}
    
    public int size(){
        int count=0;
     for (int i =0; i<array.length;   i++){
         count++;
    }
    return count;}
    

    public void set (int value, int index) {
        array[index] = value;
    }

    public void delete( int index){
       for (int i=index; i<array.length-1; i++){
           
           array[i] = array[i+1];}
           
           currentSize = currentSize-1;
        }
           
  

    public static int search(int[] a, int x) {
        System.out.println("result");
        int result=0;
        for (int item: a){

            if (item == x) {
                System.out.println(item);
                result ++;
            }

        }
        if (result>0) {
            return 1;}
        else {return -1;}
    }

    public static int findSmallest (int[] a, int t){

        int smallest= t;
        for (int current=smallest; current<a.length;current++){
            if  (a[current]>a[smallest]){
                smallest = current;   
            }

        }
        return smallest;
    }

    public static void swap (int[] numbers, int i1, int i2) {
        int temp;

        temp = numbers[i1];
        numbers[i1] = numbers[i2];
        numbers[i2] = temp;
    }

}
