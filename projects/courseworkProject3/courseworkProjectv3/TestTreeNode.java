
public class TestTreeNode
{
    public static void main(){

        Data ad0 = new Data("UK", "FR", "ad0text");   
        Data ad1 = new Data("FR", "UK", "ad1text");
        Data ad2 = new Data("FR", "BE", "ad2text");
        Data ad3 = new Data("US", "US", "ad3text");
        Data ad4 = new Data("IN", "IN", "ad4text");
        Data ad5 = new Data("US", "US", "ad5text");
        Data ad6 = new Data("UK", "BE", "ad6text"); 
        Data ad7 = new Data("UK", "FR", "ad7text"); 
        Data ad8 = new Data("UK", "UK", "ad8text"); 
        Data ad9 = new Data("UK", "UK", "ad9text"); 
        Data ad10 = new Data("UK", "NL", "ad10text"); 
        Data ad11 = new Data("UK", "NL", "ad11text"); 
        Data ad12 = new Data("UK", "IR", "ad12text"); 
        Data ad13 = new Data("UK", "UK", "ad13text"); 
        Data ad14 = new Data("IN", "IN", "ad14text"); 
        Data ad15 = new Data("UK", "UK", "ad15text"); 

        List startingList = new List();
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

        //World
        TreeNode world = new TreeNode( "World", worldList, worldChildList, null);

        //Asia
        TreeNode asia = new TreeNode( "Asia", asiaList, asiaChildList,world);
        TreeNode in = new TreeNode( "IN", inList, inChildList, asia);
        worldChildList.join(asia);
        asiaChildList.join(in);

        //America
        TreeNode america = new TreeNode( "America", americaList, americaChildList,world);
        TreeNode br = new TreeNode( "BR", brList, brChildList, america);
        TreeNode us = new TreeNode( "US", usList, usChildList, america);
        worldChildList.join(america);
        americaChildList.join(us);

        //Europe
        TreeNode europe = new TreeNode( "Europe", europeList, europeChildList, world);
        TreeNode uk = new TreeNode( "UK", ukList, ukChildList, europe);
        TreeNode fr = new TreeNode( "FR", frList, frChildList, europe);
        TreeNode nl = new TreeNode( "NL", nlList, nlChildList, europe);
        TreeNode be = new TreeNode( "BE", beList, beChildList, europe);
        worldChildList.join(europe);      
        europeChildList.join(fr);
        europeChildList.join(be);
        europeChildList.join(nl);
        europeChildList.join(uk);

        //System.out.println(europe.getCountry());

        //System.out.println(world.limitExceeded(40));

        //world.showAllAdListsOfNodeAndChildren();


   

        // check node against a String (or an object of any other type)
        System.out.print("\nComparing TreeNode to String:");
        testEqualBooleans(europe.equals("X"), false);
        
        // check node against null
        System.out.print("\nComparing TreeNode to null:");
        testEqualBooleans (europe.equals(null), false);

        // check against a node with the same data
        System.out.print("\nComparing TreeNode to another node:");
        testEqualBooleans(europe.equals (new TreeNode("FR",frList,frChildList, europe )), true);
        
   
    }
    public static void testEqualBooleans (boolean result, boolean expected) {
        if (result == expected) {
            System.out.println(" The test was successful");
        } else {
            System.out.println ( "Error: the result " + result + " does not equal the expected " + expected);
        }
    }
}
