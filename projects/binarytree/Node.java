public class Node<T> {
    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node (T data) {     // <1>
        this.data = data;

        this.leftChild = null;
        this.rightChild = null;
    }
    
    
  
    
    
    
    public T getData() {
        return data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void  setLeftChild(Node<T> node){
        leftChild = node;
    }

    public void  setRightChild(Node<T> node){
        rightChild = node;
    }

    public String toString(){
        return "Data: " + data.toString();  
    }

    public int countNodes () {
        int sum = 0;
        System.out.println ("Counting nodes for node: " + this.data);
        sum += 1;                           // <1>
        if (leftChild != null) {            // <2>
            sum += leftChild.countNodes ();   // <3>
        }
        if (rightChild != null) {           // <4>
            sum += rightChild.countNodes ();  // <5>
        }

        return sum;
    }

    public void showTree () {
        System.out.println ("Node: " + data);   // <1>

        if (leftChild != null) {
            leftChild.showTree ();          // <2>
        }

        if (rightChild != null) {
            rightChild.showTree ();             // <3>

        }
    }
    
    
    public void showTreeRoman () {
          // <1>

        if (leftChild != null) {
            leftChild.showTree ();          // <2>
        }
        
        System.out.println ("Node: " + data); 
        
        if (rightChild != null) {
            rightChild.showTree ();             // <3>

        }
    }

    public void showTreeInOrder () {
        if (leftChild != null) {
            System.out.println ("Node: " + leftChild.data);
            System.out.println ("Node: " + data);
            if (rightChild != null) {
                System.out.println ("Node: " + rightChild.data);
                rightChild.showTreeInOrder();
            }
            leftChild.showTreeInOrder ();    

        }

    }
    public int depth() {
        int sum = 0;
        sum += 1;
        if (leftChild!=null) {

           //System.out.println("left");

            leftChild.depth();

        }

        if (rightChild!=null) {

            //System.out.println("right");
            rightChild.depth();

        }

        return sum;
    }

    public boolean equals (Object o) {
        if (o == null) { System.out.println("Object is null"); return false; }
        if (o instanceof Node) {

            Node n = (Node)o;                                                       // <1>

            if (!data.equals (n.getData ())) { System.out.println("Data from the nodes is diferent"); return false; }                      // <2>

            if (leftChild == null && n.getLeftChild () != null) { System.out.println("left childs are different"); return false; }   // <3>
            if (leftChild != null &&
            !leftChild.equals (n.getLeftChild ())) { System.out.println("left childs are different");return false; }            // <4>

            if (rightChild == null && n.getRightChild () != null) { System.out.println("right childs are different");return false; } // <5>
            if (rightChild != null &&
            !rightChild.equals (n.getRightChild ())) { return false; }          // <6>

            return true;                                                            // <7>

        } else {  // given object is not a Node, so return false
            System.out.println("Object is not a node");
            return false;
        }
    }

}
