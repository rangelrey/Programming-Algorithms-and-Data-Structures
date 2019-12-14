
public class TestGNode extends TestFramework
{
    public static void testDisconnect () {

        Audible holocaust = new Audible("Explanation of the murder, torture and violence in concentration camps in WW2", "The Holocaust");
        Text treatyOfPeace = new Text("Copy of the final peace treaty between allies", "Treaty of peace");
        Text memories = new Text("memories of a mother missing his child during the war","Memories");
        Visual introduction = new Visual("Video: Introduction to the WW2 museum","Introduction");
        Visual cookingInWW2 = new Visual("Film of how soldiers ate and who cooked","Cooking in WW2");
        Visual bombs = new Visual("Exposition Old bombs found under the sea", "Bombs");
        Audible victoryAudio = new Audible("Recording of the declaration of victory of the allies","Victory");        

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
        graph.addUndirectedLink (node5, node7); 

        //Print the list of nodes
        System.out.println("The node is connected with: " +node7.getLinks().toString());
        //Disconnect node from the rest
        node7.disconnect();
        System.out.println("disconnecting...Should return an empty list:");
        List emptyList = new List();
        testEqualLists(node7.getLinks(),emptyList ); 
        System.out.println("Does the node have neighbours?");
        testEqualBooleans(node7.hasNeighbours(), false);
        
        //Node6 should have 2 edges
        System.out.println("Checking if getDegree() method works: ");
       testEqualInt(node6.getLinks().size(), node6.getDegree());
       
      
        
        
    }
}
