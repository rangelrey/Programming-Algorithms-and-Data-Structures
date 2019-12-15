public class Tree{
    private TreeNode head;
    private List treeList;
    public Tree (TreeNode head) {
        this.head=head;
        this.treeList = (List) this.getTreeNode().getData().getDataItem();
    }
    public TreeNode getTreeNode() {return this.head;}

    public List getListFromTreeNode(){ return treeList;}

    public void showTree(){this.getTreeNode().showTreeNode();}
}
