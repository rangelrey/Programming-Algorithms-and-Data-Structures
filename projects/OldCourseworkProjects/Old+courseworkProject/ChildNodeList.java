
public class ChildNodeList
{
   private ChildNodeList next;

   private TreeNode treeNode;


    public ChildNodeList ( ChildNodeList next, TreeNode treeNode) {
        this.next = next;

        this.treeNode = treeNode;

    }

    // accessor for 'next'
    public ChildNodeList getNext () {
        return next;
    }

    // mutator for 'next'
    public void setNext (ChildNodeList next) {
        this.next = next;
    }
    
  
    
     public TreeNode getTreeNode () {
        return treeNode;
    }

    public void join ( TreeNode treeNode) {
        ChildNodeList current = this;

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from country and place it in the lastItem
        current.setNext (new ChildNodeList (null, treeNode));             
    }

    public TreeNode get (int i) {
        ChildNodeList current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                return current.getTreeNode ();
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

    public void set (TreeNode treeNode, int i) {
        ChildNodeList current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                current.treeNode = treeNode;
                return;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

    public ChildNodeList insert (TreeNode treeNode, int index) {
        ChildNodeList current = this;
        int currentIndex = 0;
        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {  
            return new ChildNodeList (current, treeNode);
        }

        while (current != null) {
            if (currentIndex+1 == index) {                                 
                ChildNodeList insertedNode = new ChildNodeList (current.getNext(), treeNode); 
                current.next = insertedNode;                                    
                return this;    
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); 
    }

    // deletes node at given index number, and returns head of new list
    public ChildNodeList delete (int index) {
        ChildNodeList current = this;
        int currentIndex = 0;

        if (index == 0) { // delete first node, so just return the next node
            return next;
        }

        while (current != null) {
            if (currentIndex+1 == index) {
                // the node to delete is the next one
                // so we set the current node's next to the next of the next
                current.setNext ( current.getNext().getNext());

                return this; // remember, the delete method was called on the first item
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);  
    }

    public String toString () {
        String result = "";

        result += "[";
        ChildNodeList current = this;

        while (current != null) {
            result += current.treeNode;
            if (current.next != null) {
                result += ", ";
            }
            current = current.next;
        }

        result += "]";

        return result;
    }
}
