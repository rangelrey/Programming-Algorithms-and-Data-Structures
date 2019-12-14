public class TreeNode {

    private ChildList childList;
    private AdList finalTreeNodeList;
    private TreeNode child;
    private String country;

    public TreeNode ( String country, AdList finalTreeNodeList,ChildList childList) {

        this.finalTreeNodeList = finalTreeNodeList;
        this.childList = childList;
        this.country = country;

    }

    // these are accessor methods, one per field
    public String getCountry(){return country;}

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

    public boolean itemsFitInTreeNodeList(ListNodeAd currentAdListNode,  int countLimit, int limit) {
        int i;
        String childOrigin;
        boolean itemsFitInTreeNodeList = true;
        String origin;
        
        int numberOfChildsChecked = 0;
        int numberOfChildren =0;
        boolean lastChildren = true;
        boolean ListNodeAdWasAdded = false;
        while (currentAdListNode!=null    && lastChildren==true && ListNodeAdWasAdded != true) {
            lastChildren=false;
            TreeNode currentTreeNode = this;
            System.out.println(" \nCurrent AdNode: "+currentAdListNode.getData());
            origin = currentAdListNode.getOrigin();
            System.out.println(" Origin: "+origin);
            System.out.println(" OriginToCompare :" +currentTreeNode.getCountry());
            if (origin == currentTreeNode.getCountry()) {
                currentTreeNode.joinToTreeNodeList(currentAdListNode.getData());
                System.out.println("  Joined!!!!!!!!!!!!!!!!!!!!!!!");
                countLimit++;
                ListNodeAdWasAdded = true;
                if (countLimit > limit) {
                    System.out.println("LIMIT EXCEEDED!!!!!");
                    itemsFitInTreeNodeList = false;
                    currentTreeNode.getAdList().reset();  
                    break;}}
                    
            numberOfChildren = currentTreeNode.getChildList().size();
            System.out.println("number of children: "+ numberOfChildren);
            if (numberOfChildren >0) {
                System.out.println(" Checking CHILDREN,...");
                for (i=0; i<numberOfChildren; i++){
                    if (ListNodeAdWasAdded == false) {
                    System.out.println("currentTreeNode is: "+currentTreeNode.getCountry());
                    child = currentTreeNode.getChildList().get(i);
                    System.out.println("Checking the child node: "+child.getCountry());
                    child.itemsFitInTreeNodeList( currentAdListNode,countLimit,limit); 
                    if (i+1==numberOfChildren) {
                        System.out.println("   Checking the last children \n");
                        lastChildren = true;}
                    else {lastChildren = false;}
                } }//el problema es que currentNode se updatea con el ultimo nodo que no tiene children y cuando el loop de antes sigue runeando el valor de
                //currentNode ...

            } if (lastChildren ==true){
                System.out.println("    Last children was checked");
                ListNodeAdWasAdded = false;
                currentAdListNode = currentAdListNode.getNext();
            System.out.println("\n \nStarting with new adlistnode");}
            
            if (itemsFitInTreeNodeList==false){
                System.out.println("Breaking while loop!!!");
                break;} }
        return itemsFitInTreeNodeList;}

    public void displayTreeNode() {
        int i;

        System.out.println(this.getCountry() +": "+this.getAdList());

        for (i=0; i<this.getChildList().size(); i++){
            this.getChildList().get(i).displayTreeNode();

        }

    }
}