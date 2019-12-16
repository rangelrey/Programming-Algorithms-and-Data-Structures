import java.util.HashMap;
public class TreeNode {
    private List<TreeNode> childList;
    private TreeNode child;
    Data treeNodeData;
    List<Data> treeList;
    //the constructor takes a Data Object which will be formed by(String region, List adlList) and the childlist
    public TreeNode ( Data treeNodeData ,List childList) {
        this.childList = childList;  //the children of the tree node will be saved here
        this.treeNodeData = treeNodeData; // the data of the tree node will be saved here
        this.treeList =  this.getData().getDataItem();
    }
    // these are accessor methods, one per field
    public Data<List> getData() { return treeNodeData; }

    public List getChildList () { return childList; }

    public TreeNode getChild(int i) {
        child = childList.get(i);
        return child;
    }

    public void joinChild( TreeNode child) {childList.join( child);}

    public void joinToAdList(Data ad){ treeList.join(ad);}
    //prints the tree node and its children
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
    //assigns each ad of the list into the tree nodes if the string regions matches with the tree node data region
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
    //return the size of the lists that is in he tree node
    public int adListSize(){
        List<Data> adList = this.getData().getDataItem();
        int numberOfItemsInAdList= adList.size();
        return numberOfItemsInAdList;
    }
    //returns the total sum of the nomber of ads (items in the tree node lists) of the tree node and its children
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
    //Checks if the number of items in the list of the tree noed and its children exceeds the limit we specify
    public boolean limitExceeded(int limit){
        int numberOfItemsInAdListNode= this.countAdsInNodeAndChidren();
        if (numberOfItemsInAdListNode > limit){
            return true;
        }
        else {return false;}
    }
    //prints the groups the algorithm would generate based on the limit 
    public void showGroupAdsInTreeNode(int limit){
        TreeNode currentTreeNode = this;
        // BASE CASE
        if (currentTreeNode.limitExceeded(limit)){
            List childList = currentTreeNode.getChildList();

            int numberOfChildren = childList.size();
            for (int i=0; i<numberOfChildren; i++){
                child = (TreeNode) childList.get(i);
                child.showGroupAdsInTreeNode(limit);
            }
        }
        else {
            System.out.println("\n"+currentTreeNode.getData().getRegion());
            currentTreeNode.showAllListsOfNodeAndChildren();
        }

    }
    // returns a hasmhmap where the key is the name of the group (region) and the value a list with all ads that pertain to the group
    //based on the limit
    public HashMap<String,List<Data>>extractGroups(int limit){
        TreeNode currentTreeNode = this;
        HashMap<String,List<Data>> hashMap = new HashMap<>();
        if (!currentTreeNode.limitExceeded(limit)){
            hashMap.putAll(currentTreeNode.getHashMapOfNodeAndChildren());
            return hashMap;
        } else{
            List childList = currentTreeNode.getChildList();
            int numberOfChildren = childList.size();
            for (int i=0; i<numberOfChildren; i++){
                child = (TreeNode) childList.get(i);
                hashMap.putAll(child.extractGroups(limit));
            } 
            return hashMap;
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
    //returns a hashmap of tree node. The key is the region and the value the list of all ads 
    public HashMap<String,List<Data>> getHashMapOfNodeAndChildren(){
        TreeNode currentTreeNode = this;
        HashMap<String,List<Data>> hmap = new HashMap<>();
        String region = currentTreeNode.getData().getRegion();
        List<Data> allLists = this.getAllListsFromNodeAndChildren();
        hmap.put(region, allLists);
        return hmap;
    }
    //returns a concatenated list of all lists of a node and its children. 
    public List<Data> getAllListsFromNodeAndChildren(){
        TreeNode currentTreeNode = this;
        List<TreeNode> childList = currentTreeNode.getChildList();
        int numberOfChildren = childList.size();
        List<Data> currentAdList = currentTreeNode.getData().getDataItem();

        if (numberOfChildren==0){ //if it has no children, end of the tree
            return currentAdList;
        }
        else{        
            List<Data> adListOfChildren = new List();
            for (int i=0; i<numberOfChildren; i++){
                TreeNode child =  childList.get(i);
                List<Data> adListChildren = child.getAllListsFromNodeAndChildren();
                adListOfChildren= adListOfChildren.concatenate(adListChildren);
            }
            return currentAdList.concatenate(adListOfChildren);
        } 
    }

}