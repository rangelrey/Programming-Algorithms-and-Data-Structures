
public class Integer implements Orderable<Integer>{
    private int i;
    private int thisIntValue;
    public int getIntValue(){
        return i;
    }

    public boolean isLessThan (Integer i) {
        return thisIntValue < i.getIntValue ();
    }

    public static void test(char A, char B) {
     
    if (A>B){
        System.out.println("ja");
    }
    else{
     System.out.println("nein");   
    }
        
    }
    
  
    
    public static void main(){
 
      System.out.println("a".compareTo("b"));
       System.out.println("b".compareTo ("a"));
       System.out.println("abaa".compareTo ("aba"));
       System.out.println("a".compareTo ("a"));
    }

}
