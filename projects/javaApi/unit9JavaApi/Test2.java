import java.util.ArrayList;
public class Test2
{
   public static void main() {
       
       
       ArrayList<String> list = new ArrayList<> ();
        list.add ("Apple");
        list.add ("Banana");
        list.add ("Guava");
        list.add ("Mango");
               
       
       for (int i=0; i<list.size(); i++){
         System.out.print(list.get(i)+"\n");
        }
        
        for (String item: list) {
            
            System.out.print(item+"\n");
    }
    
    

}

}
