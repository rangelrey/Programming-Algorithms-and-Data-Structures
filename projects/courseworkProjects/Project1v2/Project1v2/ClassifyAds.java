import java.util.HashMap;
public class ClassifyAds
{   private Tree tree;
    private List startingList;

    public static void  classifyAd(ListNode adListNode, Tree tree ) {
        TreeNode currentTreeNode = tree.getTreeNode();
        if (currentTreeNode==null){  System.out.println("The Tree Head is null");
            return;}
        currentTreeNode.assignAdListNode( adListNode); 
    }
    //insert ads in their corresponding TreeNode
    public static void insertAdsInTree(List startingList, Tree tree){
        ListNode currentListNodeAd = startingList.getListNode();
        while (currentListNodeAd!=null){
            classifyAd(currentListNodeAd, tree);
            currentListNodeAd = currentListNodeAd.getNext();
        }
    }
    //count the number of ads per TreeNode and also print the group created

    public static void printGroupAds(int limit, Tree tree){
        TreeNode currentTreeNode = tree.getTreeNode();
        
        if (currentTreeNode!=null){
            currentTreeNode.groupAdsInTreeNode(limit);}}

    public static HashMap<String,List<Data>> generateOutput(int limit, Tree tree){
        TreeNode currentTreeNode = tree.getTreeNode();
        HashMap<String,List<Data>> hashMap = new HashMap();
        if (currentTreeNode!=null){
            hashMap =currentTreeNode.createHashmap(limit);
        }
        else{
            System.out.println(" Error creating HashMap");}
        return hashMap;
         }  

            
    
}
