
public class TestList
{
    public static void main(){
        Data ad0 = new Data("UK", "FR", "ad0text");   
        Data ad1 = new Data("FR", "UK", "ad1text");
        Data ad2 = new Data("FR", "BE", "ad2text");

        List startingList = new List();

        startingList.join(ad0);
        startingList.join(ad1);
        startingList.join(ad2);
 
        System.out.println("These are the items of the list:");
        startingList.showList();
        
        testEqualStrings(startingList.toString(),"[UK-FR: \"ad0text\", FR-UK: \"ad1text\", FR-BE: \"ad2text\"]");
        

        
    }
    
      public static void testEqualStrings (String result, String expected) {
        if (result.equals (expected)) {   // Strings are objects, so use the equals method
            System.out.println("Test was successful!");

        } else {
            System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
        }
    }

}
