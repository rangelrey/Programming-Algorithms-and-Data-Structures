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
                System.out.println("     Checking the child node: "+child.getCountry());

                joined = child.assignAdListNode( currentAdListNode);
                
                System.out.println("    Current child node: "+child.getCountry());
                System.out.println("     joined? "+joined);
                System.out.println("     currentTreeNode is(2.1): "+currentTreeNode.getCountry());
                if (currentTreeNode.getParent()!= null){
                    System.out.println("     currentTreeNode parent (1): "+currentTreeNode.getParent().getCountry());
                }
                else {System.out.println("\n _ _ _ the parent is null (2)");};

                // el loop se queda en allado con europs debido al las children
        
                }} return joined;} 
            
        

        public boolean assignListNodesToTreeNodesReserva(ListNodeAd currentAdListNode) {
        int i;
        String childOrigin;
        String origin;
        int numberOfChildsChecked = 0;
        int numberOfChildren =0;
        boolean lastChildren = true;
        boolean ListNodeWasAdded = false;
        boolean joined = false;

        TreeNode currentTreeNode = this;
        while (currentAdListNode!=null    && lastChildren==true ) {
            lastChildren=false;
            joined=false;
            System.out.println("\n \n__arriba ARRIBA ARRIBA ARRIBA ");
            System.out.println("  was added (1) ?"+joined);
            if (currentTreeNode.getParent()!= null){
                System.out.println("  currentTreeNode parent (1): "+currentTreeNode.getParent().getCountry());
            }
            else {System.out.println("   the parent is null");}
            System.out.println("  - currentTreeNode is(1): "+currentTreeNode.getCountry());
            System.out.println("  - Current AdNode: "+currentAdListNode.getData());
            origin = currentAdListNode.getOrigin();
            System.out.println("  - Origin: "+origin);
            System.out.println("  - OriginToCompare :" +currentTreeNode.getCountry());
            if (origin == currentTreeNode.getCountry()) {
                currentTreeNode.joinToTreeNodeList(currentAdListNode.getData());
                System.out.println("   !!!!!!!!!!!!!!!!!!!!!!Joined!!!!!!!!!!!!!!!!!!!!!!!");
                return true;
            }

            ChildList childList = currentTreeNode.getChildList();
            numberOfChildren = childList.size();
            System.out.println("   number of children: "+ numberOfChildren);
            if (numberOfChildren >0) {
                System.out.println("   Checking CHILDREN,...");
                for (i=0; i<numberOfChildren; i++){
                    System.out.println("   was added (2)?"+joined);
                    System.out.println("   currentTreeNode is(2): "+currentTreeNode.getCountry());
                    child = childList.get(i);
                    System.out.println("     Checking the child node: "+child.getCountry());
                    if (i+1==numberOfChildren) {
                        System.out.println("   Checking the last children \n");
                        lastChildren = true;}
                    else {lastChildren = false;}
                    joined = child.assignListNodesToTreeNodesReserva( currentAdListNode);
                    System.out.println("    Current child node: "+child.getCountry());
                    System.out.println("     joined? "+joined);
                    System.out.println("     currentTreeNode is(2.1): "+currentTreeNode.getCountry());
                    if (currentTreeNode.getParent()!= null){
                        System.out.println("     currentTreeNode parent (1): "+currentTreeNode.getParent().getCountry());
                    }
                    else {System.out.println("\n _ _ _ the parent is null (2)");};
                    if (joined == true) {
                        System.out.println("break");
                        lastChildren= false; 
                        break;};

                    // el loop se queda en allado con europs debido al las children
                } 

            } if ((currentTreeNode.getParent()==null && lastChildren ==true) || (currentTreeNode.getParent()==null && joined==true) ){
                System.out.println("    ---currentTreeNode is (3): "+currentTreeNode.getCountry());
                System.out.println("     ---Last children was checked");
                if (currentTreeNode.getParent()==null){ lastChildren=true;}
                currentAdListNode = currentAdListNode.getNext();
                System.out.println("\n \nStarting with new adlistnode"+currentAdListNode);}
            System.out.println("currentTreeNode is(4): "+currentTreeNode.getCountry());

            System.out.println("\n \n -_-_-_-_-___");

        }return joined; }

    public void displayTreeNode() {
        int i;

        System.out.println(this.getCountry() +": "+this.getAdList());

        for (i=0; i<this.getChildList().size(); i++){
            this.getChildList().get(i).displayTreeNode();

        }

    }
}