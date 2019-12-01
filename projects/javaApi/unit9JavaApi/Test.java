  import collections.*;
public class Test
{ 
    
   public static void main(){
       
       PriorityQueue qu = new PriorityQueue();
       qu.insert("a");
       qu.insert("q");
       qu.insert("q");
       qu.insert("q");
       qu.insert("z");
       qu.insert("q");
       qu.insert("d");
       qu.insert("q");
       qu.insert("q");
       qu.insert("q");
       qu.insert("q");
       qu.getHeap();
       

       for (heap name : qu) {                                   // <4>
      System.out.println ("Name " + name);
    }
    }
    
}
