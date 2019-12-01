public class arr
{
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

    public static void selectionSort(int[] a){
        for (i=0;i<a.length;i++){
            
            
        }
        
    }

    
    
    public static void main() {
        int[] a = {1,2,3,-4,5};

        search(a, 5);
    }
    
    
}

