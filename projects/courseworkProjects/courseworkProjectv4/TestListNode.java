
public class TestListNode extends TestFramework
{
    public static void main(){


        // create ads
        Data ad4 = new Data("IN",  "ad4text");
        Data ad14 = new Data("IN", "ad14text"); 
        
        // instantiate list
        List testList = new List();
        // Join ads to list
        testList.join(ad4);
        testList.join(ad14);

       //check if after joining the two ads ig the result equals the expected.
       //this one returns that the test was successful
        testEqualStrings(testList.toString(),"[IN: \"ad4text\", IN: \"ad14text\"]");       
       // get item 0 and cast it to Data
       Data a = (Data) testList.get(0);
       // check if the object we got is the same as we would expect
       testEqualData(a,ad4);

        
        
    }


 
    
    
}

   
