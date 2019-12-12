public class ArrayInt2
{ int currentSize;
    int maxSize;
    int[] array;

    public ArrayInt2(int currentSize, int maxSize){
        this.currentSize = currentSize;
        this.maxSize = maxSize;
        array = new int[maxSize];
    }

    public void set(int i, int j){
        array[i] = j;

    }

    public void insert(int i, int j){

        for (int h = i; h<array.length-1; h++){

            array[h+1] = array[h];
            if ( i == h){
                array[i] = j;
                currentSize++;
            }
        }
    }
    
    public void delete(int i){
        for (int h = i; h<array.length-1; h++){

            array[h] = array[h+1];
        }
        currentSize--;
                
            
        
    }
    

    public String toString(){
        String result = "";        
        for (int i=0 ;i<array.length;i++){
            result += array[i]; 
        }
        return result;      
    }

    public static void main(){

        ArrayInt2 a = new ArrayInt2(5,10);

        a.insert(0,0);
        a.insert(1,1);
        a.insert(2,2);
        a.insert(3,3);
        a.insert(4,4);
        
        a.delete(3);
        
        
        System.out.println(a);

    }
}

