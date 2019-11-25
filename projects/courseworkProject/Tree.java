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

    
    




    public void  classify(AdList startingList,  int limit) {
        String origin;

        int i;
        int countLimit = 0;
        boolean limitExceeded = false;
        boolean treeNodeListIsComplete = false;
        ListNodeAd currentAdListNode;
        TreeNode currentTreeNode = this.getTreeNode();
        currentAdListNode = startingList.getListNodeAd();
        
        if (currentTreeNode!=null){
        
        treeNodeListIsComplete = currentTreeNode.itemsFitInTreeNodeList( currentAdListNode, 0,  limit); 
                    
        System.out.println("finished treeNodeListIsComplete");  }
        
        else { System.out.println("The Tree Node is null");
           
    
        if (treeNodeListIsComplete == true) {
            System.out.println("13");
            startingList.deleteSubList(this.getAdListFromTreeNode());
            System.out.println("14");
            for (i=0; i<currentTreeNode.getChildList().size(); i++) {

                child = currentTreeNode.getChildList().get(i);
                System.out.println("Child "+ child.getCountry());
                Tree treeChild = new Tree(child);
                System.out.println("Finished for this TreeNode. Staring next node");
                treeChild.classify( startingList,  limit);
    

        
            }

        }

    
    }

   


}
}
