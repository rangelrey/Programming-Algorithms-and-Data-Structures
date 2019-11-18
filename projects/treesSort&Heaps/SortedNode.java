public class SortedNode<T extends Comparable<T>> {
    private T key;
    private T insertKey;
    private SortedNode<T> leftChild;
    private SortedNode<T> rightChild;

    public SortedNode (T key) {
        this.key = key;

        this.leftChild = null;
        this.rightChild = null;
    }

    public SortedNode<T> getLeftChild() {
        return this.leftChild; }

    public SortedNode<T> getRightChild() {
        return this.rightChild; }

    public SortedNode<T> find (T searchkey) {
        if (key.equals (searchkey)) {               // <1>
            return this;                              // <2>
        } else if (key.compareTo (searchkey) > 0) { // <3>
            if (leftChild == null) {                  // <4>
                return null;
            } else {
                return leftChild.find (searchkey);      // <5>
            }
        } else {                                    // <6>
            if (rightChild == null) {
                return null;
            } else {
                return rightChild.find (searchkey);
            }
        }
    }

    public void insert (T insertkey) {

        if (key.equals (insertkey)) {                 // <1>
            return;                                     // <2>
        } else if (key.compareTo (insertkey) > 0) {   // <3>
            if (leftChild == null) {                    // <4>
                leftChild = new SortedNode<T>(insertkey); // <5>

            } else {
                leftChild.insert (insertkey);        // <6>
            }
        } else {                                      // <7>
            if (rightChild == null) {
                rightChild = new SortedNode<T>(insertKey);
            } else {
                rightChild.insert (insertkey);
            }
        }

    }

    public boolean contains (T searchkey) {
        return null != find(searchkey);
    }

    public void prettyPrint (String insert) {
        System.out.println (insert + "Node: " + key);
        if (leftChild != null) {
            leftChild.prettyPrint (insert+"L-");
        }
        if (rightChild != null) {
            rightChild.prettyPrint (insert+"R-");
        }
    }

    public int sizeNodes(){
        int sum = 0;

        sum+=1;
        if (key==null) {
            return 1;

        }
        else { if (leftChild != null) {

                sum += leftChild.sizeNodes();

            }
            if (rightChild != null) {
       
                sum += rightChild.sizeNodes();
            }
            

        }
     return sum;   
    }
}


