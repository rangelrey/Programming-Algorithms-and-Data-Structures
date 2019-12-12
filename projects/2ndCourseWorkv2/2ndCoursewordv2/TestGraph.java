public class TestGraph {

    public static void testEurlerianGraph() {
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

        System.out.println("Is the graph eulerian?");
        
        System.out.println("Node1 has the following edges to: "+node1.getLinks().toString());
        System.out.println("Does the node have neighbours? "+node1.hasNeighbours());
        System.out.println("Node7 has the following edges to: "+node7.getLinks().toString());
        System.out.println("Does the node have neighbours? "+node7.hasNeighbours());
        System.out.println("Node6 has the following edges to: "+node6.getLinks().toString());
        System.out.println("Does the node have neighbours? "+node6.hasNeighbours());

        System.out.println("Get nodes that contain the word violence");
        List<GNode> nodesToRemove = graph.getGNodesThatContain("violence");
        System.out.println("Does the node have neighbours? "+node7.hasNeighbours());
        System.out.println("Nodes To Remove: "+ nodesToRemove);

       
        System.out.println(nodesToRemove);
        System.out.println("Removing nodes from the graph");
        graph.removeGNodes(nodesToRemove); 
        System.out.println("Does the graph have a circuit? " +graph.hasCircuit());
        node7.disconnect();
        System.out.println("Does the node now have neighbours? "+node7.hasNeighbours());
        System.out.println("Show the edges of the node that was connected to 7 "+node6.getLinks().toString());
        System.out.println("Cicle:"+graph.getCircuit().toString());

    }
   
}