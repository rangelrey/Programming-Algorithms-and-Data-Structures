import java.util.HashMap;
public class ClassifyAds
{   private Tree tree;
    private List startingList;
    //classifies one ad into the tree. It checks if the region string matches or if the children also match the region
    public static void  insertAd(ListNode adListNode, Tree tree ) {
        TreeNode currentTreeNode = tree.getTreeNode();
        if (currentTreeNode==null){  System.out.println("The Tree Head is null");
            return;}
        currentTreeNode.assignAdListNode( adListNode); 
    }
    //insert the ads in their corresponding TreeNode
    public static void insertAdsInTree(List startingList, Tree tree){
        ListNode currentListNodeAd = startingList.getListNode();
        while (currentListNodeAd!=null){
            insertAd(currentListNodeAd, tree);
            currentListNodeAd = currentListNodeAd.getNext();
        }
    }
    //count the number of ads per TreeNode and also print the group created
    public static void printGroupAds(int limit, Tree tree){
        TreeNode currentTreeNode = tree.getTreeNode();
        
        if (currentTreeNode!=null){
            currentTreeNode.showGroupAdsInTreeNode(limit);}}

    //create the output file: a hashmap with all groups and its respective lists
    public static HashMap<String,List<Data>> generateOutput(int limit, Tree tree){
        TreeNode currentTreeNode = tree.getTreeNode();
        HashMap<String,List<Data>> hashMap = new HashMap();
        if (currentTreeNode!=null){
            hashMap =currentTreeNode.extractGroups(limit);
        }
        else{
            System.out.println(" Error creating HashMap");}  
        return hashMap;   //return empty hashmap
         }  

            
    
}
