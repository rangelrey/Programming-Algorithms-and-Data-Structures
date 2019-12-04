
public class test
{ public static void main(){
    
    int[] a = {5,4,3,3};
    //System.out.println(selectionSort( a));
    System.out.println(factorial(4));
    
    
    
    
    
}


public static int factorial(int a ){
  int result =a;
  int i;
  
  
    for ( i =1 ;i< a; i++) {
        result *= (a-i);
    }
    
return result;    


}
}










