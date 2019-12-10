public class Tree{
    private TreeNode head;
    private List treeList;

    public Tree (TreeNode head) {
        this.head=head;
        this.treeList = (List) this.getTreeNode().getData().getDataItem();
    }

    public TreeNode getTreeNode() {return this.head;}

    public List getAdListFromTreeNode(){ return treeList;}

    public void showTree(){this.getTreeNode().showTreeNode();}

    public void classifyAds(List startingList){
        ListNode currentListNodeAd = startingList.getListNode();
        while (currentListNodeAd!=null){
            this.classifyAd(currentListNodeAd);
            currentListNodeAd = currentListNodeAd.getNext();
        }
    }

    public void  classifyAd(ListNode adListNode ) {
        TreeNode currentTreeNode = this.getTreeNode();
        if (currentTreeNode==null){  System.out.println("The Tree Head is null");
            return;}
        currentTreeNode.assignAdListNode( adListNode); 
    }

    public void groupAds(int limit){
        TreeNode currentTreeNode = this.getTreeNode();
        if (currentTreeNode!=null){
            currentTreeNode.groupAdsInTreeNode(limit);}}
            
    

   
}
