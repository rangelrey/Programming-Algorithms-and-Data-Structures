
public class TestListNode
{
    public static void main(){

        testToString();

     
    }
    public static void testToString(){
        Data ad4 = new Data("IN", "IN", "ad4text");
        Data ad14 = new Data("IN", "IN", "ad14text"); 

        List inList = new List();
        inList.join(ad4);
        inList.join(ad14);

        testEqualStrings(inList.toString(),"[IN-IN: \"ad4text\", IN-IN: \"ad14text\"]");
       
        
        
    }

    public static void testEqualStrings (String result, String expected) {
        if (result.equals (expected)) {   // Strings are objects, so use the equals method
            System.out.println("Test was successful!");
            
        } else {
            System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
        }
    }
}

   
