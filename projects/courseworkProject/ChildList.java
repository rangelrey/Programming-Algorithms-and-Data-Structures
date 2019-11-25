public class ChildList {
    private ChildNodeList head;
  
    private ChildNodeList childNodeList;

    // the constructor simply creates the class with a null value for "head"
    public ChildList () {
        head = null;
    }

    // the list is empty if it starts with null
    public boolean isEmpty () {
        return head == null;
    }

    public int size () {
        int count = 0;
        ChildNodeList current = head;
        while (current != null) {
            count += 1;
            current = current.getNext ();
        }
        return count;
    }

    public boolean contains (TreeNode treeNode) {
        ChildNodeList current = head;
        while (current != null) {
            if (current.getTreeNode().equals(treeNode)) {
                return true;
            }
            current = current.getNext ();
        }
        return false;
    }

    // the join method creates a new ChildNodeList for the given item of country
    // and appends the new item to the end of the list
    public void join (  TreeNode treeNode) {
        if (head == null) {                         // <1>
            head = new ChildNodeList (null,  treeNode);
            return;                                   // <2>
        }

        ChildNodeList current = head;                    // <3>

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a cnew node from country and place it in the lastItem
        current.setNext (new ChildNodeList (null, treeNode));
    }

    public TreeNode leave () {
        if (head == null) {
            return null;
        } else {
            TreeNode result = head.getTreeNode();
            head = head.getNext ();
            return result;
        }
    }

    public TreeNode get (int index) {
        ChildNodeList current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                return current.getTreeNode ();
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);
    }

    public void set (TreeNode treeNode, int index) {
        ChildNodeList current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                current.set(treeNode, index) ;
                return;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); 
    }

    public void insert (TreeNode treeNode, int index) {   

        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {   // set a new first item in list
            head = new ChildNodeList (head,  treeNode);
        }

        ChildNodeList current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex+1 == index) {   
                ChildNodeList insertedNode = new ChildNodeList (current.getNext(), treeNode); 
               current.setNext(insertedNode);   
                return; 
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);   
    }

    public void delete (int index) {

        if (index == 0) { 
            head = head.getNext ();
            return;
        }

        ChildNodeList current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex+1 == index) {
                // the node to delete is the next one
                // so we set the current node's next to the next of the next
                current.setNext ( current.getNext().getNext());

                return; 
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); 
    }

    // version of delete which deletes a node containing the given 'item'
    // -- it follows the pattern above closely, but matches the value, 
    //    not the index
    public void deleteItem (String item) {
        if (head.getTreeNode().equals (item)) { // delete the first item
            head = head.getNext ();
            return;
        }

        ChildNodeList current = head;
        while (current != null) {
            if (current.getNext().getTreeNode().equals(item)) {
                current.setNext (current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public String toString () {
        String result = "";

        result += "[";
        ChildNodeList current = head;

        while (current != null) {
            result += current.getTreeNode();
            if (current.getNext() != null) {
                result += ", ";
            }
            current = current.getNext();
        }

        result += "]";

        return result;
    }
}
