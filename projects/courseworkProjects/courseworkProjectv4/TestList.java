
public class TestList extends TestFramework
{       public static void main(){
        Data ad0 = new Data("UK","ad0text");   
        Data ad1 = new Data("FR","ad1text");
        Data ad2 = new Data("FR","ad2text");
        List startingList = new List();
        startingList.join(ad0);
        startingList.join(ad1);
        startingList.join(ad2);
        
        //In order to have a clear understanding of how the list looks like,
        //instead of printing a typical list horizontal [a,b,c,d...] format
        // we will print it in a vertical forma
        System.out.println("These are the items of the list:");
        startingList.showList();
        testEqualStrings(startingList.toString(),"[UK: \"ad0text\", FR: \"ad1text\", FR: \"ad2text\"]");        
        testEqualInt(startingList.size(),3);
        
        
        System.out.println("Testing equals data");
        Data testData = (Data) startingList.get(0);
        testEqualData(testData, ad0);
    }
    

    


}
