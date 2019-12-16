public class TreeNode {
    private List childList;
    private TreeNode child;
    Data treeNodeData;
    List treeList;

    public TreeNode ( Data treeNodeData ,List childList) {
        this.childList = childList;
        this.treeNodeData = treeNodeData;
        this.treeList = (List) this.getData().getDataItem();
    }
    // these are accessor methods, one per field

    public Data getData() { return treeNodeData; }

    public List getChildList () { return childList; }

    public TreeNode getChild(int i) {
        child = (TreeNode) childList.get(i);
        return child;
    }

    public void joinChild( TreeNode child) {childList.join( child);}

    public void joinToAdList(Data ad){ treeList.join(ad);}

    public void showTreeNode(){
        TreeNode currentTreeNode = this;
        System.out.println(currentTreeNode.getData().getRegion());
        List childList  =  currentTreeNode.getChildList();
        int numberOfChildren = childList.size();
        for (int i=0; i<numberOfChildren; i++){
            TreeNode child = (TreeNode) childList.get(i);
            child.showTreeNode();
        }
    }

    public void assignAdListNode(ListNode currentAdListNode) {
        TreeNode currentTreeNode = this;
        Data listData = (Data) currentAdListNode.getItem();
        String region = listData.getRegion();
        if (region.equals(currentTreeNode.getData().getRegion())) {
            currentTreeNode.joinToAdList(listData);
            return;
        }
        else {
            List childList = currentTreeNode.getChildList();
            int numberOfChildren = childList.size();          
            for (int i=0; i<numberOfChildren; i++){
                child = (TreeNode) childList.get(i);                     
                child.assignAdListNode( currentAdListNode);
            }
        } 
    } 

    public int adListSize(){
        List adList = (List) this.getData().getDataItem();
        int numberOfItemsInAdList= adList.size();
        return numberOfItemsInAdList;
    }

    public int countAdsInNodeAndChidren(){
        TreeNode currentTreeNode = this;
        int numberOfItemsInAdList= currentTreeNode.adListSize();
        List childList = currentTreeNode.getChildList();
        int numberOfChildren = childList.size();
        for (int i=0; i<numberOfChildren; i++){
            child = (TreeNode) childList.get(i);
            numberOfItemsInAdList += child.countAdsInNodeAndChidren();
        }
        return numberOfItemsInAdList;
    }
    //Checks if the number of items in the list exceeds the limit we specify
    public boolean limitExceeded(int limit){
        int numberOfItemsInAdListNode= this.countAdsInNodeAndChidren();
        if (numberOfItemsInAdListNode > limit){
            return true;
        }
        else {return false;}
    }

    public void groupAdsInTreeNode(int limit){
        TreeNode currentTreeNode = this;
        if (currentTreeNode.limitExceeded(limit) == true){
            List childList = currentTreeNode.getChildList();
            int numberOfChildren = childList.size();
            for (int i=0; i<numberOfChildren; i++){
                child = (TreeNode) childList.get(i);
                child.groupAdsInTreeNode(limit);
            }
        }
        else {
            System.out.println("\n"+currentTreeNode.getData().getRegion());
            currentTreeNode.showAllListsOfNodeAndChildren();
        }
    }
    //prints all lists of the tree from a node and its children
    public void showAllListsOfNodeAndChildren(){
        TreeNode currentTreeNode = this;
        if (currentTreeNode!=null){
            treeList.showList();
            List childList = currentTreeNode.getChildList();
            int numberOfChildren = childList.size();
            for (int i=0; i<numberOfChildren; i++){
                child = (TreeNode) childList.get(i);
                child.showAllListsOfNodeAndChildren();
            }
        }
    }
}