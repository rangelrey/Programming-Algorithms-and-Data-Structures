public class SortedTree<T extends Comparable<T>> {
    private SortedNode<T> root;

    public SortedTree () {
        root = null;
    }

    public boolean contains (T key) {
        return root.contains(key);

        // REPLACE THIS WITH YOUR OWN IMPLEMENTATION
    }

    public void add (T key) {
        if (root == null) {
            root = new SortedNode<T> (key);
        } else {
            root.insert (key); // insert 'adds' a node
        }
    }

    public void showTree () {
        root.prettyPrint("");
    }
    
    public int size() {
        return root.sizeNodes();
        
    }
    
    
    
    
}