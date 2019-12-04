public class Tree
{    private TreeNode head;
    private String country;
    private String childOrigin;
    private Data ad;
    private TreeNode child;

    public Tree (TreeNode head) {
        this.head=head;
    }

    public TreeNode getTreeNode() {
        return this.head;
    }

    public AdList getAdListFromTreeNode(){ return this.getTreeNode().getAdList();}

    public void showTree(){
        this.getTreeNode().showTreeNode();

    }

    public void classifyAds(AdList startingList, int limit){
        
        while (startingList.next()!=null){
            this.classifyAd(startingList.getListNodeAd(), limit);
        }
        
    }
    
    public void  classifyAd(ListNodeAd adListNode ,  int limit) {
        TreeNode currentTreeNode = this.getTreeNode();
        if (currentTreeNode==null){  System.out.println("The Tree Head is null");
            return;}
            
        currentTreeNode.assignAdListNode( adListNode); 
        
    }
}


