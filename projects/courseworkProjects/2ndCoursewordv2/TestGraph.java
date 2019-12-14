public class TestGraph extends TestFramework{

    public static void testGraph() {
        Audible holocaust = new Audible("Explanation of the murder, torture and violence in concentration camps in WW2", "7");
        Text treatyOfPeace = new Text("Copy of the final peace treaty between allies", "2");
        Text memories = new Text("memories of a mother missing his child during the war","3");
        Visual introduction = new Visual("Video: Introduction to the WW2 museum","1");
        Visual cookingInWW2 = new Visual("Film of how soldiers ate and who cooked","4");
        Visual bombs = new Visual("Exposition Old bombs found under the sea", "5");
        Audible victoryAudio = new Audible("Recording of the declaration of victory of the allies","6");   

        Graph<Exposition> graph = new Graph<> ();       

        GNode<Exposition> node1 = graph.addNode ( introduction);
        GNode<Exposition> node2 = graph.addNode (treatyOfPeace);
        GNode<Exposition> node3 = graph.addNode (memories);
        GNode<Exposition> node4 = graph.addNode (cookingInWW2);
        GNode<Exposition> node5 = graph.addNode (bombs);
        GNode<Exposition> node6 = graph.addNode (victoryAudio);
        GNode<Exposition> node7 = graph.addNode (holocaust);

        graph.addUndirectedLink (node1, node2);
        graph.addUndirectedLink (node2, node3);
        graph.addUndirectedLink (node3, node4);
        graph.addUndirectedLink (node4, node5);
        graph.addUndirectedLink (node5, node6);
        graph.addUndirectedLink (node6, node1);
        graph.addUndirectedLink (node7, node6);

        System.out.println("Get nodes that contain the word violence");
        List<GNode> nodesToRemove = graph.getGNodesThatContain("violence");
        List<GNode> testNodesToRemove = new List();
        testNodesToRemove.join(node7);
        testEqualLists(nodesToRemove,testNodesToRemove);

        System.out.println("Removing nodes from the graph");
        graph.removeGNodes(nodesToRemove); 
        List<GNode> testNodes = new List();
        testNodes.join(node1);
        testNodes.join(node2);
        testNodes.join(node3);
        testNodes.join(node4);
        testNodes.join(node5);
        testNodes.join(node6);
        
        testEqualLists(graph.getNodes(),testNodes);
        
        System.out.println("\nDoes the graph have a circuit? " +graph.hasCircuit());
        testEqualBooleans(graph.hasCircuit(),true);
        List<GNode> testCircuit = new List();
        testCircuit.join(node1);    
        testCircuit.join(node6);
        testCircuit.join(node5);
        testCircuit.join(node4);
        testCircuit.join(node3);
        testCircuit.join(node2);
        System.out.println("Does it return the correct circuit ?");
        testEqualStrings(graph.getCircuit().toString(), testCircuit.toString());

    }
   
}