
public class TestList
{
    public static void main(){
        Data ad0 = new Data("UK","ad0text");   
        Data ad1 = new Data("FR","ad1text");
        Data ad2 = new Data("FR","ad2text");

        List startingList = new List();

        startingList.join(ad0);
        startingList.join(ad1);
        startingList.join(ad2);
 
        System.out.println("These are the items of the list:");
        startingList.showList();
        
        testEqualStrings(startingList.toString(),"[UK: \"ad0text\", FR: \"ad1text\", FR: \"ad2text\"]");
        
        testEqualInt(startingList.size(),3);

        
    }
    
      public static void testEqualStrings (String result, String expected) {
        if (result.equals (expected)) {   // Strings are objects, so use the equals method
            System.out.println("Test was successful!");

        } else {
            System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
        }
    }
    
     public static void testEqualInt (int result, int expected) {
        if (result == expected) {   // Since int is not an object, we cannot use the method equals and in strings
            System.out.println("Test was successful!");

        } else {
            System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
        }
    }

}
