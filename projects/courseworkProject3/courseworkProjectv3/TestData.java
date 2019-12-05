
public class TestData
{
    public static void main(){

        Data ad0 = new Data("UK", "FR", "ad0text");   
        Data ad1 = new Data("FR", "UK", "ad1text");
        
        
        testEqualStrings(ad0.getOrigin(),"UK");

    }

    public static void testEqualStrings (String result, String expected) {
        if (result.equals (expected)) {   // Strings are objects, so use the equals method
            System.out.println("Test was successful!");

        } else {
            System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
        }
    }
}
