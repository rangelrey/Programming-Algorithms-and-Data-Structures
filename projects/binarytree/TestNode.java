
public class TestNode{ 
    private Node<String> node;

    public TestNode() {
        Node<String> node0 = new Node<>("A");
        Node<String> node1 = new Node<>("B");
        Node<String> node2 = new Node<>("C");

        node0.setLeftChild(node1);

        node0.setRightChild(node2);

        node = node0;

        System.out.println(node.countNodes());
    }

    public static void main (String[] args){
        // tree of one node
        Node<String> node0 = new Node<> ("Node0");

        //System.out.println ("Number of nodes in 1: " + node0.countNodes ());

        // tree of three nodes - we use node0 as a base
        Node<String> node1 = new Node<> ("Node0Left");
        Node<String> node2 = new Node<> ("Node0Right");
        node0.setLeftChild (node1);
        node0.setRightChild (node2);

        //System.out.println ("Number of nodes in 3: " + node0.countNodes ());

        // tree of six nodes - we continue to use node0 as a base
        Node<String> node3 = new Node<> ("Node1Left");
        Node<String> node4 = new Node<> ("Node1Right");
        Node<String> node5 = new Node<> ("Node2Left");
        Node<String> node6 = new Node<> ("Node2Right");
        Node<String> node7 = new Node<> ("Node3Left");
        node1.setLeftChild (node3);
        node1.setRightChild (node4);
        node2.setLeftChild (node5);
        node2.setRightChild (node6);
        node3.setLeftChild (node7);

        //System.out.println ("Number of nodes in 6: " + node0.countNodes ());

        System.out.println("Make Tree Strings");

        //node0 = makeTreeStrings(5);

        node0.showTreeRoman();
        //System.out.println(node0.depth());

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

    public static Node<String> makeTreeStrings (int n) {
        Node<String>[] nodes = new Node[n];

        for (int i=0; i<nodes.length; i+=1) {
            nodes[i]=new Node<String> ("node-" + (i+1));
        }
        for (int i=0; i<nodes.length; i+=1) {
            if (2*i+1 < nodes.length) {
                nodes[i].setLeftChild ( nodes[2*i+1] );
            }
            if (2*i+2 < nodes.length) {
                nodes[i].setRightChild ( nodes[2*i+2] );
            }
        }
        return nodes[0];
    }

    public static void testEquals(){

        String testString = "testString";
        Node<String> node0 = new Node<>("A");
        Node<String> node1 = new Node<> ("Node1");
        Node<String> node2 = new Node<> ("Node2");
        node0.setLeftChild (node1);
        node0.setRightChild (node2);
        
        node0.equals(testString);
        
        System.out.println(testString.equals(node0));

    }

}
