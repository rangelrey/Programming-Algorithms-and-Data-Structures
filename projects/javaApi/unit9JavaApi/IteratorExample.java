import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
  public static void main (String[] args) {
    // initialise a list
    List<String> list = new ArrayList<> ();
    list.add("Alice");
    list.add("Bill");
    list.add("Charles");
    list.add("Dave");

    // now starts the iteration
    Iterator<String> it = list.iterator ();  
    
    for (
    // <1>
    while (it.hasNext ()) {                     // <2>
      String item = it.next();                  // <3>
      System.out.println ("List contains: " + item);
    }
  }
}
