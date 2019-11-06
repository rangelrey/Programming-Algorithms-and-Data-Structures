
public class TestNode{ 
    private Node<String> node;

    public TestNode() {
        Node<String> nodeA = new Node<>("A");
        Node<String> nodeB = new Node<>("B");
        Node<String> nodeC = new Node<>("C");

        nodeA.setLeftChild(nodeB);

        nodeA.setRightChild(nodeC);

        node = nodeA;

        System.out.println(node.countNodes());
    }

    public static void main (String[] args){
        // tree of one node
        Node<String> nodeA = new Node<> ("A");

        System.out.println ("Number of nodes in 1: " + nodeA.countNodes ());

        // tree of three nodes - we use nodeA as a base
        Node<String> nodeB = new Node<> ("B");
        Node<String> nodeC = new Node<> ("C");
        nodeA.setLeftChild (nodeB);
        nodeB.setRightChild (nodeC);

        System.out.println ("Number of nodes in 3: " + nodeA.countNodes ());

        // tree of six nodes - we continue to use nodeA as a base
        Node<String> nodeD = new Node<> ("D");
        Node<String> nodeE = new Node<> ("E");
        Node<String> nodeF = new Node<> ("F");
        nodeA.setRightChild (nodeD);
        nodeB.setLeftChild (nodeE);
        nodeE.setLeftChild (nodeF);

        System.out.println ("Number of nodes in 6: " + nodeA.countNodes ());

    }

    public static int sumTreeIntegers (Node<Integer> node) {
        if (node == null) { return 0; } // check we have an actual node
        int sum = node.getData ();
        if (node.getLeftChild () != null) {
            sum += sumTreeIntegers (node.getLeftChild());
        }
        if (node.getRightChild () != null) {
            sum += sumTreeIntegers (node.getRightChild());
        }
        return sum;
    }



    
}
