public class TestGraph {

    // example of setting up an undirected graph and finding its size
    public static void eg1 () {
        Graph<Integer> graph = new Graph<> ();

        GNode<Integer> node1 = graph.addNode (1);
        GNode<Integer> node2 = graph.addNode (2);
        GNode<Integer> node3 = graph.addNode (3);
        GNode<Integer> node4 = graph.addNode (4);

        graph.addUndirectedLink (node1, node2);
        graph.addUndirectedLink (node1, node4);
        graph.addUndirectedLink (node2, node4);
        graph.addUndirectedLink (node2, node3);
        graph.addUndirectedLink (node3, node4);

        System.out.println ("" + graph + " size " + graph.size());

    }

    // example of setting up the graph in the unit and finding a circuit
    public static void testCircuit () {
        Graph<String> graph = new Graph<> ();

        GNode<String> nodeA = graph.addNode ("A");
        GNode<String> nodeB = graph.addNode ("B");
        GNode<String> nodeC = graph.addNode ("C");
        GNode<String> nodeD = graph.addNode ("D");
        GNode<String> nodeE = graph.addNode ("E");

        
        graph.addUndirectedLink (nodeA, nodeB);
        graph.addUndirectedLink (nodeA, nodeD);
        graph.addUndirectedLink (nodeB, nodeC);
        graph.addUndirectedLink (nodeC, nodeD);
        graph.addUndirectedLink (nodeB, nodeC);
        graph.addUndirectedLink (nodeE, nodeD);

        System.out.println ("Cycle is: " + graph.getCircuit().toString());
    }

    // create the getting-dressed directed graph
    public static Graph<String> dressGraph () {
        Graph<String> graph = new Graph<> ();

        GNode<String> nodeA = graph.addNode ("underwear");
        GNode<String> nodeB = graph.addNode ("shirt");
        GNode<String> nodeC = graph.addNode ("socks");
        GNode<String> nodeD = graph.addNode ("trousers");
        GNode<String> nodeE = graph.addNode ("shoes");
        GNode<String> nodeF = graph.addNode ("jacket");        
        GNode<String> nodeG = graph.addNode ("gloves");

        graph.addDirectedLink (nodeA, nodeB);
        graph.addDirectedLink (nodeA, nodeC);
        graph.addDirectedLink (nodeA, nodeD);
        graph.addDirectedLink (nodeB, nodeD);
        graph.addDirectedLink (nodeB, nodeF);
        graph.addDirectedLink (nodeC, nodeE);
        graph.addDirectedLink (nodeD, nodeE);
        graph.addDirectedLink (nodeD, nodeF);
        graph.addDirectedLink (nodeF, nodeG);
        
        return graph;
    }
}