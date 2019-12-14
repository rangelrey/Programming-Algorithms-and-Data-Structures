public class TreeNode {

    private ChildList childList;
    private AdList finalTreeNodeList;
    private TreeNode child;
    private String country;
    private TreeNode parent;

    public TreeNode ( String country, AdList finalTreeNodeList,ChildList childList, TreeNode parent) {

        this.finalTreeNodeList = finalTreeNodeList;
        this.childList = childList;
        this.country = country;
        this.parent = parent;

    }

    // these are accessor methods, one per field
    public String getCountry(){return country;}

    public TreeNode getParent(){return parent;}

    public AdList getAdList () { return finalTreeNodeList; }

    public ChildList getChildList () { return childList; }

    public TreeNode getChild(int i) {
        child = childList.get(i);
        return child;
    }

    public void joinChild( TreeNode child) {

        childList.join( child);

    }

    public void joinToTreeNodeList(Data ad){

        this.getAdList().join(ad);

    }

    public void showTreeNode(){

        TreeNode currentTreeNode = this;
        System.out.println(currentTreeNode.getCountry());

        ChildList childList  =  currentTreeNode.getChildList();
        int numberOfChildren = childList.size();

        for (int i=0; i<numberOfChildren; i++){
            System.out.println("ja");
            TreeNode child = childList.get(i);
            child.showTreeNode();

        }

    }

    public boolean assignAdListNode(ListNodeAd currentAdListNode) {
        boolean joined=false;

        TreeNode currentTreeNode = this;
        String origin = currentAdListNode.getOrigin();

        if (origin == currentTreeNode.getCountry()) {
            currentTreeNode.joinToTreeNodeList(currentAdListNode.getData());
            System.out.println("   !!!!!!!!!!!!!!!!!!!!!!Joined!!!!!!!!!!!!!!!!!!!!!!!");
            return true;
        }
        else {
            ChildList childList = currentTreeNode.getChildList();
            int numberOfChildren = childList.size();
            System.out.println("   number of children: "+ numberOfChildren);

            for (int i=0; i<numberOfChildren; i++){
                child = childList.get(i);

                joined = child.assignAdListNode( currentAdListNode);

                // el loop se queda en allado con europs debido al las children
            }} return joined;} 

    public int AdListSize(){
        int numberOfItemsInAdList = this.getAdList().size();
        return numberOfItemsInAdList;
    }

    public int countAdsInNodeAndChidren(){

        TreeNode currentTreeNode = this;
        int numberOfItemsInAdList = currentTreeNode.AdListSize();

        ChildList childList = currentTreeNode.getChildList();
        int numberOfChildren = childList.size();
        for (int i=0; i<numberOfChildren; i++){

            child = childList.get(i);

            numberOfItemsInAdList += child.countAdsInNodeAndChidren();

        }

        return numberOfItemsInAdList;
    }

    public boolean limitExceeded(int limit){
        int numberOfItemsInAdListNode = this.countAdsInNodeAndChidren();
        if (numberOfItemsInAdListNode > limit){
            return true;
        }
        else {return false;}
    }

    public void groupAdsInTreeNode(int limit){
        TreeNode currentTreeNode = this;

        if (currentTreeNode.limitExceeded(limit) == true){

            ChildList childList = currentTreeNode.getChildList();
            int numberOfChildren = childList.size();
            for (int i=0; i<numberOfChildren; i++){

                child = childList.get(i);

                child.groupAdsInTreeNode(limit);

            }
        }
        else {
            System.out.println("\n"+currentTreeNode.getCountry());
            currentTreeNode.showAllAdListsOfNodeAndChildren();

        }

    }

    public void showAllAdListsOfNodeAndChildren(){
        TreeNode currentTreeNode = this;
        if (currentTreeNode!=null){
            currentTreeNode.getAdList().showAdList();

            ChildList childList = currentTreeNode.getChildList();
            int numberOfChildren = childList.size();
            for (int i=0; i<numberOfChildren; i++){

                child = childList.get(i);

                child.showAllAdListsOfNodeAndChildren();

            }
        }

    }



public void displayTreeNode() {
int i;

System.out.println(this.getCountry() +": "+this.getAdList());

for (i=0; i<this.getChildList().size(); i++){
this.getChildList().get(i).displayTreeNode();

}

}
}