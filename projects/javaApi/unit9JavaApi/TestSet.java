import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;

public class TestSet {

  public static void main (String[] args) {
    // example of using a set
    Set<String> myset = new HashSet<> ();                         // <1>
    myset.add ("Peter");
    myset.add ("John");
    myset.add ("Luke");
    myset.add ("Matthew");
    myset.add ("Peter");                                          // <2>

    
    
    System.out.println ("Number of names is: " + myset.size ());  // <3>
    for (String name : myset) {                                   // <4>
      System.out.println ("Name " + name);
    }
    System.out.println(reverse("Jamon"));
    System.out.println ("Is 'John' in the set? " + myset.contains ("John"));   // <5>
    System.out.println ("Is 'David' in the set? " + myset.contains ("David"));

    
  }
  
  public static String reverse(String item){
    String result = "";
     for (int i = item.length()-1; i >=0 ; i--) {
            result += item.charAt(i);
      
      
    } return result;
}

  
}
