
public class Test
{
    public static void main() {

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

        AdList startingList = new AdList();
        AdList worldList = new AdList();
        AdList europeList = new AdList();
        AdList asiaList = new AdList();
        AdList americaList = new AdList();
        AdList ukList = new AdList();
        AdList frList = new AdList();
        AdList nlList = new AdList();
        AdList usList = new AdList();
        AdList inList = new AdList();
        AdList beList = new AdList();
        AdList brList = new AdList();

     
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

        ChildList worldChildList = new ChildList();
        ChildList europeChildList = new ChildList();
        ChildList asiaChildList = new ChildList();
        ChildList americaChildList = new ChildList();
        ChildList ukChildList = new ChildList();
        ChildList frChildList = new ChildList();
        ChildList nlChildList = new ChildList();
        ChildList usChildList = new ChildList();
        ChildList inChildList = new ChildList();
        ChildList beChildList = new ChildList();
        ChildList brChildList = new ChildList();

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

        

      

      

        Tree tree = new Tree(world);

        tree.classifyAds(startingList);
        //tree.classifyAd(startingList.getListNodeAd(), 20);
        
        world.displayTreeNode();

        //System.out.println(europe.getParent().getCountry());
        System.out.println("\nPrinting result:");
        tree.groupAds(14);

      
        //tree.showTree();

     
    }
}