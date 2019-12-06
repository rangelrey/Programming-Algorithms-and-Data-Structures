
public class TestTreeNode
{
    public static void main(){

        //create the ads
        Data ad0 = new Data("UK",  "ad0text");   
        Data ad1 = new Data("FR",  "ad1text");
        Data ad2 = new Data("FR",  "ad2text");
        Data ad3 = new Data("US",  "ad3text");
        Data ad4 = new Data("IN",  "ad4text");
        Data ad5 = new Data("US",  "ad5text");
        Data ad6 = new Data("UK",  "ad6text"); 
        Data ad7 = new Data("UK",  "ad7text"); 
        Data ad8 = new Data("UK",  "ad8text"); 
        Data ad9 = new Data("UK",  "ad9text"); 
        Data ad10 = new Data("UK",  "ad10text"); 
        Data ad11 = new Data("UK",  "ad11text"); 
        Data ad12 = new Data("UK",  "ad12text"); 
        Data ad13 = new Data("UK",  "ad13text"); 
        Data ad14 = new Data("IN", "ad14text"); 
        Data ad15 = new Data("UK", "ad15text"); 

        //create the main list where all ads will be stored
        List startingList = new List();
        //create the lists that each TreeNode will contain
        List worldList = new List();
        List europeList = new List();
        List asiaList = new List();
        List americaList = new List();
        List ukList = new List();
        List frList = new List();
        List nlList = new List();
        List usList = new List();
        List inList = new List();
        List beList = new List();
        List brList = new List();

        //Join the ads into the main list
        startingList.join(ad0);
        startingList.join(ad1);
        startingList.join(ad2);
        startingList.join(ad3);
        startingList.join(ad4);
        startingList.join(ad5);
        startingList.join(ad7);
        startingList.join(ad8);
        startingList.join(ad9);
        startingList.join(ad10);
        startingList.join(ad11);
        startingList.join(ad12);
        startingList.join(ad13);
        startingList.join(ad14);
        startingList.join(ad15);

        //create the children list of each TreeNode
        List worldChildList = new List();
        List europeChildList = new List();
        List asiaChildList = new List();
        List americaChildList = new List();
        List ukChildList = new List();
        List frChildList = new List();
        List nlChildList = new List();
        List usChildList = new List();
        List inChildList = new List();
        List beChildList = new List();
        List brChildList = new List();

        //create the TreeNodes
        TreeNode world = new TreeNode( "World", worldList, worldChildList);

        //Asia
        TreeNode asia = new TreeNode( "Asia", asiaList, asiaChildList);
        TreeNode in = new TreeNode( "IN", inList, inChildList);
        worldChildList.join(asia);
        asiaChildList.join(in);

        //America
        TreeNode america = new TreeNode( "America", americaList, americaChildList);
        TreeNode br = new TreeNode( "BR", brList, brChildList);
        TreeNode us = new TreeNode( "US", usList, usChildList);
        worldChildList.join(america);
        americaChildList.join(us);

        //Europe
        TreeNode europe = new TreeNode( "Europe", europeList, europeChildList);
        TreeNode uk = new TreeNode( "UK", ukList, ukChildList);
        TreeNode fr = new TreeNode( "FR", frList, frChildList);
        TreeNode nl = new TreeNode( "NL", nlList, nlChildList);
        TreeNode be = new TreeNode( "BE", beList, beChildList);
        worldChildList.join(europe);      
        europeChildList.join(fr);
        europeChildList.join(be);
        europeChildList.join(nl);
        europeChildList.join(uk);

        
        // check that the nodes does not point to  null
        System.out.print("\nComparing TreeNode to null:");
        testEqualBooleans (europe.equals(null), false);

        // check against a node with the same data. Should return an error
        System.out.print("\nComparing TreeNode to another node:");
        testEqualBooleans(europe.equals (new TreeNode("FR",frList,frChildList )), true);

        // check if the following method works as expected
        europe.joinToTreeNodeList(ad0);
        //create a test list with the expected output
        List testList = new List();
        testList.join(ad0);
        testEqualLists(europeList, testList);
        
        // in order to test the assignAdListNode method, we will 
      
        

}
    
    public static void testEqualBooleans (boolean result, boolean expected) {
        if (result == expected) {
            System.out.println(" The test was successful");
        } else {
            System.out.println ( " Error: the result " + result + " does not equal the expected " + expected);
        }
    }

    public static void testEqualLists (List result, List expected){
        if (result.size()==expected.size()){
            for (int i=0; i<result.size(); i++){
                if (!result.get(i).equals(expected.get(i))){
                    System.out.println ( "eError: the result " + result + " does not equal the expected " + expected);
                    break;
                };
            }
            System.out.println("Test was successful");
        }
        else {

        System.out.println ( "wError: the result " + result + " does not equal the expected " + expected);
    }}
}
