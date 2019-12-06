
public class TestData
{
    public static void main(){

        
        //Class instantiation. We create 2 Data Objects i.e 2 ads
        Data ad0 = new Data("UK","ad0text");   
        Data ad1 = new Data("FR","ad1text");
        
        //Check if get methods work properly:
        testEqualStrings(ad0.getRegion(),"UK");
        
        testEqualStrings(ad1.getAdText(),"ad1text");

    }

    public static void testEqualStrings (String result, String expected) {
        if (result.equals (expected)) {   
            System.out.println("Test was successful!");

        } else {
            System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
        }
    }
}
