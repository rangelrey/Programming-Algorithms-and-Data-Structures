import java.util.HashMap;
public class TestTreeNode extends TestFramework
{
    public static void main(){

        System.out.println("Creating ads");
        //create the ads
        Data ad0 = new Data("UK",  "ad0text");   
        Data ad1 = new Data("UK",  "ad1text");
        Data ad2 = new Data("UK",  "ad2text");
        Data ad3 = new Data("UK",  "ad3text");
        Data ad4 = new Data("UK",  "ad4text");
        Data ad5 = new Data("US",  "ad5text");
        Data ad6 = new Data("US",  "ad6text"); 
        Data ad7 = new Data("US",  "ad7text"); 
        Data ad8 = new Data("FR",  "ad8text"); 
        Data ad9 = new Data("FR",  "ad9text"); 
        Data ad10 = new Data("FR",  "ad10text"); 
        Data ad11 = new Data("FR",  "ad11text"); 
        Data ad12 = new Data("FR",  "ad12text"); 
        Data ad13 = new Data("IN",  "ad13text"); 
        Data ad14 = new Data("IN", "ad14text"); 
        Data ad15 = new Data("BR", "ad15text"); 

        System.out.println("\nCreating lists...");
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

        System.out.println("Joining ads to startingList");
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

        System.out.println("Creating children lists...");
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

        System.out.println("Creating Tree root Data");
        Data TreeNodeDataWorld = new Data("World", worldList); 
        System.out.println("Does getRegion() method work as expected?");
        testEqualStrings(TreeNodeDataWorld.getRegion(), "World");

        System.out.println("Does getDataItem() method work as expected?");
        List worldListTest = (List) TreeNodeDataWorld.getDataItem();
        testEqualLists(worldListTest, worldList);

        System.out.println("Creating Tree root...");
        TreeNode world = new TreeNode( TreeNodeDataWorld, worldChildList);

        System.out.println("Does getData() method work as expected?");
        testEqualData(world.getData(), TreeNodeDataWorld);

        //Asia
        System.out.println("Creating Tree Node Data...");
        Data TreeNodeDataAsia = new Data("Asia", asiaList);
        Data TreeNodeDataIn = new Data("IN", inList);

        TreeNode asia = new TreeNode( TreeNodeDataAsia, asiaChildList);
        TreeNode in = new TreeNode( TreeNodeDataIn, inChildList);
        worldChildList.join(asia);
        asiaChildList.join(in);

        //America
        Data TreeNodeDataAmerica = new Data("America", americaList);
        Data TreeNodeDataBr = new Data("BR", brList);
        Data TreeNodeDataUs = new Data("US", usList);

        TreeNode america = new TreeNode( TreeNodeDataAmerica, americaChildList);
        //TreeNode br = new TreeNode( TreeNodeDataBr, brChildList);
        TreeNode us = new TreeNode( TreeNodeDataUs, usChildList);
        worldChildList.join(america);
        americaChildList.join(us);

        //Europe

        Data TreeNodeDataEurope = new Data("Europe", europeList);
        Data TreeNodeDataUk = new Data("UK", ukChildList);
        Data TreeNodeDataFr = new Data("FR", frChildList);
        Data TreeNodeDataNl = new Data("NL", nlChildList);
        Data TreeNodeDataBe = new Data("BE", beChildList);

        TreeNode europe = new TreeNode( TreeNodeDataEurope, europeChildList);
        TreeNode uk = new TreeNode( TreeNodeDataUk, ukChildList);
        TreeNode fr = new TreeNode( TreeNodeDataFr, frChildList);
        TreeNode nl = new TreeNode( TreeNodeDataNl, nlChildList);
        TreeNode be = new TreeNode( TreeNodeDataBe, beChildList);
        worldChildList.join(europe);      
        europeChildList.join(fr);
        europeChildList.join(be);
        europeChildList.join(nl);
        europeChildList.join(uk);

        System.out.println("Testing getting child");
        TreeNode childTest = (TreeNode) worldChildList.get(0);
        testEqualTreeNodes(childTest,asia);
        System.out.println(childTest.getClass().getName());

        // check if the following method works as expected
        europe.joinToAdList(ad0);
        //create a test list with the expected output
        List testList = new List();
        testList.join(ad0);
        testEqualLists(europeList, testList);

        // in order to test the assignAdListNode method, we will 

        worldList.join(ad0);
        asiaList.join(ad1);
        americaList.join(ad2);

        List testList2 = new List();
        testList2.join(ad0); 
        testList2.join(ad1);
        testList2.join(ad2);
        testList2.join(ad0);
        testEqualLists(europeList, testList);

 
        System.out.println("Does the method getAllListsFromNodeAndChildren() work");
        List<Data> allListsFromWorld = world.getAllListsFromNodeAndChildren();
        testEqualLists(allListsFromWorld, testList2);

        List testList3 = new List();
        testList3.join(ad0);
        testList3.join(ad1);
        testList3.join(ad2);
        testList3.join(ad0);

        System.out.println("Does the method getHashMapOfNodeAndChildren() work");
        HashMap<String,List> testHashMap = new HashMap();
        testHashMap.put("World", testList3);

        HashMap<String,List<Data>> hashMapWorld= world.getHashMapOfNodeAndChildren();

        testEqualStrings(hashMapWorld.toString(), testHashMap.toString());


        frList.join(ad8);
        frList.join(ad9);
        frList.join(ad10);
        frList.join(ad11);
        inList.join(ad13);
        inList.join(ad14);
        usList.join(ad5);
        usList.join(ad6);
        usList.join(ad7);
        ukList.join(ad0);
        ukList.join(ad1);
        ukList.join(ad2);
        ukList.join(ad3);
        ukList.join(ad4);

        


    }

    public static void testCreateHashMap() {
        System.out.println("Creating ads");
        //create the ads
        Data ad0 = new Data("UK",  "ad0text");   
        Data ad1 = new Data("UK",  "ad1text");
        Data ad2 = new Data("UK",  "ad2text");
        Data ad3 = new Data("UK",  "ad3text");
        Data ad4 = new Data("UK",  "ad4text");
        Data ad5 = new Data("US",  "ad5text");
        Data ad6 = new Data("US",  "ad6text"); 
        Data ad7 = new Data("US",  "ad7text"); 
        Data ad8 = new Data("FR",  "ad8text"); 
        Data ad9 = new Data("FR",  "ad9text"); 
        Data ad10 = new Data("FR",  "ad10text"); 
        Data ad11 = new Data("FR",  "ad11text"); 
        Data ad12 = new Data("FR",  "ad12text"); 
        Data ad13 = new Data("IN",  "ad13text"); 
        Data ad14 = new Data("IN", "ad14text"); 
        Data ad15 = new Data("BR", "ad15text"); 
        System.out.println("\nCreating lists...");
        //create the main list where all ads will be stored, this will be the list we will use to insert it in the tree
        List startingList = new List();

        //create the lists that each TreeNode will contain, those lists will be filled by the algorithm
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

        System.out.println("Joining ads to startingList");
        //Join the ads into the main list
        startingList.join(ad0);
        startingList.join(ad1);
        startingList.join(ad2);
        startingList.join(ad3);
        startingList.join(ad4);
        startingList.join(ad6);
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

        System.out.println("Creating children lists...");
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

        System.out.println("Creating Tree root Data");
        Data TreeNodeDataWorld = new Data("World", worldList); 
        System.out.println("Creating Tree root...");
        TreeNode world = new TreeNode( TreeNodeDataWorld, worldChildList);

        //Asia
        System.out.println("Creating Tree Node Data...");
        Data TreeNodeDataAsia = new Data("Asia", asiaList);
        Data TreeNodeDataIn = new Data("IN", inList);

        TreeNode asia = new TreeNode( TreeNodeDataAsia, asiaChildList);
        TreeNode in = new TreeNode( TreeNodeDataIn, inChildList);
        worldChildList.join(asia);
        asiaChildList.join(in);

        //America
        Data TreeNodeDataAmerica = new Data("America", americaList);
        Data TreeNodeDataBr = new Data("BR", brList);
        Data TreeNodeDataUs = new Data("US", usList);

        TreeNode america = new TreeNode( TreeNodeDataAmerica, americaChildList);
        TreeNode br = new TreeNode( TreeNodeDataBr, brChildList);
        TreeNode us = new TreeNode( TreeNodeDataUs, usChildList);
        worldChildList.join(america);
        americaChildList.join(us);

        //Europe
        Data TreeNodeDataEurope = new Data("Europe", europeList);
        Data TreeNodeDataUk = new Data("UK", ukList);
        Data TreeNodeDataFr = new Data("FR", frList);
        Data TreeNodeDataNl = new Data("NL", nlList);
        Data TreeNodeDataBe = new Data("BE", beList);

        TreeNode europe = new TreeNode( TreeNodeDataEurope, europeChildList);
        TreeNode uk = new TreeNode( TreeNodeDataUk, ukChildList);
        TreeNode fr = new TreeNode( TreeNodeDataFr, frChildList);
        TreeNode nl = new TreeNode( TreeNodeDataNl, nlChildList);
        TreeNode be = new TreeNode( TreeNodeDataBe, beChildList);
        worldChildList.join(europe);      
        europeChildList.join(fr);
        europeChildList.join(be);
        europeChildList.join(nl);
        europeChildList.join(uk);

       
        
        ukList.join(ad0);
        ukList.join(ad1);
        ukList.join(ad2);
        ukList.join(ad3);
        ukList.join(ad4);
        usList.join(ad5);
        usList.join(ad6);
        usList.join(ad7);
        frList.join(ad8);
        frList.join(ad9);
        frList.join(ad10);
        frList.join(ad11);
        frList.join(ad12);


        
        System.out.println(world.extractGroups(5));
        
        
        
        
        

    }}
