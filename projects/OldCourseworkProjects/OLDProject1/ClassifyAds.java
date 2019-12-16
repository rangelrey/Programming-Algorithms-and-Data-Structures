public class ClassifyAds
{   private Tree tree;
    private List startingList;
    
    public static void  insertAdInTree(ListNode adListNode, Tree tree ) {
        TreeNode currentTreeNode = tree.getTreeNode();
        if (currentTreeNode==null){  System.out.println("The Tree Head is null");
            return;}
        currentTreeNode.assignAdListNode( adListNode); 
    }
  //insert ads in their corresponding TreeNode
    public static void insertAdsInTree(List startingList, Tree tree){
        ListNode currentListNodeAd = startingList.getListNode();
        while (currentListNodeAd!=null){
            insertAdInTree(currentListNodeAd, tree);
            currentListNodeAd = currentListNodeAd.getNext();
        }
    }
  //count the number of ads per TreeNode and create a group, also print the output
  
    public static void groupAds(int limit, Tree tree){
        TreeNode currentTreeNode = tree.getTreeNode();
        if (currentTreeNode!=null){
            currentTreeNode.groupAdsInTreeNode(limit);}}
}
