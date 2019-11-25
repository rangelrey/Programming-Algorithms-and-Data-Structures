
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
     Data ad9 = new Data("Europe", "Europe", "ad9text"); 
     Data ad10 = new Data("Europe", "Europe", "ad10text"); 
     Data ad11 = new Data("Europe", "Europe", "ad11text"); 
     Data ad12 = new Data("Europe", "Europe", "ad12text"); 
     Data ad13 = new Data("America", "America", "ad13text"); 
     Data ad14 = new Data("Asia", "Asia", "ad14text"); 
     Data ad15 = new Data("Asia", "Asia", "ad15text"); 
     
     
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
     startingList.join(ad6);
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
     
     TreeNode world = new TreeNode( "World", worldList, worldChildList);
     TreeNode europe = new TreeNode( "Europe", europeList, europeChildList);
     TreeNode asia = new TreeNode( "Asia", asiaList, asiaChildList);
     TreeNode america = new TreeNode( "America", americaList, americaChildList);
     TreeNode uk = new TreeNode( "UK", ukList, ukChildList);
     TreeNode fr = new TreeNode( "FR", frList, frChildList);
     TreeNode nl = new TreeNode( "NL", nlList, nlChildList);
     TreeNode us = new TreeNode( "US", usList, usChildList);
     TreeNode in = new TreeNode( "IN", inList, inChildList);
     TreeNode be = new TreeNode( "BE", beList, beChildList);
     TreeNode br = new TreeNode( "BR", brList, brChildList);

     
     
     
     
     worldChildList.join(europe);
     worldChildList.join(asia);
     worldChildList.join(america);
     europeChildList.join(fr);
     europeChildList.join(be);
     europeChildList.join(nl);
     europeChildList.join(uk);
     asiaChildList.join(in);
     americaChildList.join(us);
     
     Tree tree = new Tree(world);
     
     tree.classify(startingList, 2);
     
     world.displayTreeNode();
     
     
     


     
     
     

     
     
  
    
}
}