public class TreeNode {

    private List childList;
    private List finalTreeNodeList;
    private TreeNode child;
    private String region;
    
    public TreeNode ( String region, List finalTreeNodeList,List childList) {

        this.finalTreeNodeList = finalTreeNodeList;
        this.childList = childList;
        this.region = region;


    }

    // these are accessor methods, one per field
    public String getRegion(){return region;}



    public List getAdList() { return finalTreeNodeList; }

    public List getChildList () { return childList; }

    public TreeNode getChild(int i) {
        child = (TreeNode) childList.get(i);
        return child;
    }

    public void joinChild( TreeNode child) {

        childList.join( child);

    }

    public void joinToAdList(Data ad){

        this.getAdList().join(ad);

    }

    public void showTreeNode(){

        TreeNode currentTreeNode = this;
        System.out.println(currentTreeNode.getRegion());

        List childList  =  currentTreeNode.getAdList();
        int numberOfChildren = childList.size();

        for (int i=0; i<numberOfChildren; i++){
            System.out.println("ja");
            TreeNode child = (TreeNode) childList.get(i);
            child.showTreeNode();

        }

    }

    public void assignAdListNode(ListNode currentAdListNode) {
  

        TreeNode currentTreeNode = this;
        Data data = (Data) currentAdListNode.getItem();
        String region = data.getRegion();

        if (region.equals(currentTreeNode.getRegion())) {
            currentTreeNode.joinToAdList(data);
            return;
        }
        else {
            List childList = currentTreeNode.getChildList();
            int numberOfChildren = childList.size();

            for (int i=0; i<numberOfChildren; i++){
                child = (TreeNode) childList.get(i);
                System.out.println(child.getRegion());

                child.assignAdListNode( currentAdListNode);

                
            }} } 

    public int adListSize(){
        int numberOfItemsInAdList= this.getAdList().size();
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
            System.out.println("\n"+currentTreeNode.getRegion());
            currentTreeNode.showAllAdListsOfNodeAndChildren();

        }

    }

    public void showAllAdListsOfNodeAndChildren(){
        TreeNode currentTreeNode = this;
        if (currentTreeNode!=null){
            currentTreeNode.getAdList().showList();

            List childList = currentTreeNode.getChildList();
            int numberOfChildren = childList.size();
            for (int i=0; i<numberOfChildren; i++){

                child = (TreeNode) childList.get(i);

                child.showAllAdListsOfNodeAndChildren();

            }
        }

    }

    public void displayTreeNode() {
        int i;

        System.out.println(this.getRegion() +": "+this.getAdList());

        for (i=0; i<this.getChildList().size(); i++){
            TreeNode node = (TreeNode) this.getAdList().get(i);
            node.displayTreeNode();

        }

    }
    
    
}