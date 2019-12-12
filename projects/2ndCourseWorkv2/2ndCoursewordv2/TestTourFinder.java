
public class TestTourFinder extends TourFinder
{
    
    
     public static void testEulerianGraph() {

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
        
      
        
        /* List<GNode> nodesToRemove = new List();
        nodesToRemove.join(node7);
        graph.removeGNodes(nodesToRemove); */
        String[] exclusions = new String[]{"violence", "sex"};
        
        System.out.println("Circuit:"+ findTour(graph,exclusions).toString());
       
    
    }
    
    
    public static void testNonEulerianGraph() {

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
        graph.addUndirectedLink (node3, node5);
        graph.addUndirectedLink (node4, node5);
        graph.addUndirectedLink (node5, node1);
        
      
        
        /* List<GNode> nodesToRemove = new List();
        nodesToRemove.join(node7);
        graph.removeGNodes(nodesToRemove); */
        String[] exclusions = new String[]{"violence", "sex"};
        
        System.out.println("Circuit:"+ findTour(graph,exclusions).toString());
       
    
    }
    
    
     public static void testEulerianToNonEulerian() {

       Audible holocaust = new Audible("Explanation of the murder, torture and violence in concentration camps in WW2", "7");
        Text treatyOfPeace = new Text("Peace treaty", "2");
        Text memories = new Text("memories of a mother","3");
        Visual introduction = new Visual("Introduction to the WW2 museum","1");
        Visual cookingInWW2 = new Visual("cousine in WW2","4");
        Visual bombs = new Visual("Bombs under the sea", "5");
        Audible victoryAudio = new Audible("Declaration of victory","6");   
        Audible music = new Audible("Music in WW2", "8");
        Visual art = new Visual("Art in WW2", "9");
        Text declaration = new Text("War manifesto", "10");
        
        
        Graph<Exposition> graph = new Graph<> ();       
        
        GNode<Exposition> node1 = graph.addNode ( introduction);
        GNode<Exposition> node2 = graph.addNode (treatyOfPeace);
        GNode<Exposition> node3 = graph.addNode (memories);
        GNode<Exposition> node4 = graph.addNode (cookingInWW2);
        GNode<Exposition> node5 = graph.addNode (bombs);
        GNode<Exposition> node6 = graph.addNode (victoryAudio);
        GNode<Exposition> node7 = graph.addNode (holocaust);
        GNode<Exposition> node8 = graph.addNode (music);
        GNode<Exposition> node9 = graph.addNode (art);
        GNode<Exposition> node10 = graph.addNode (declaration);

        graph.addUndirectedLink (node1, node2);
        graph.addUndirectedLink (node2, node3);
        graph.addUndirectedLink (node3, node4);
        graph.addUndirectedLink (node4, node5);
        graph.addUndirectedLink (node5, node6);
        graph.addUndirectedLink (node6, node7);
        graph.addUndirectedLink (node7, node9);
        graph.addUndirectedLink (node9, node1);
        graph.addUndirectedLink (node1, node10);
        graph.addUndirectedLink (node10, node8); 
        graph.addUndirectedLink (node8, node5);
      
        
        /* List<GNode> nodesToRemove = new List();
        nodesToRemove.join(node7);
        graph.removeGNodes(nodesToRemove); */
        String[] exclusions = new String[]{"violence", "sex"};
        
        System.out.println("Circuit:"+ findTour(graph,exclusions).toString());
       
    
    }
    
    public static void testNonEulerianToEulerian() {

       Audible holocaust = new Audible("Explanation of the murder, torture and violence in concentration camps in WW2", "7");
        Text treatyOfPeace = new Text("Peace treaty", "2");
        Text memories = new Text("memories of a mother","3");
        Visual introduction = new Visual("Introduction to the WW2 museum","1");
        Visual cookingInWW2 = new Visual("cousine in WW2","4");
        Visual bombs = new Visual("Bombs under the sea", "5");
        Audible victoryAudio = new Audible("Declaration of victory","6");   
        Audible music = new Audible("Music in WW2", "8");
        Visual art = new Visual("Art in WW2", "9");
        Text declaration = new Text("War manifesto", "10");
        
        
        Graph<Exposition> graph = new Graph<> ();       
        
        GNode<Exposition> node1 = graph.addNode ( introduction);
        GNode<Exposition> node2 = graph.addNode (treatyOfPeace);
        GNode<Exposition> node3 = graph.addNode (memories);
        GNode<Exposition> node4 = graph.addNode (cookingInWW2);
        GNode<Exposition> node5 = graph.addNode (bombs);
        GNode<Exposition> node6 = graph.addNode (victoryAudio);
        GNode<Exposition> node7 = graph.addNode (holocaust);
        GNode<Exposition> node8 = graph.addNode (music);
        GNode<Exposition> node9 = graph.addNode (art);
        GNode<Exposition> node10 = graph.addNode (declaration);

        graph.addUndirectedLink (node1, node2);
        graph.addUndirectedLink (node2, node3);
        graph.addUndirectedLink (node3, node4);
        graph.addUndirectedLink (node4, node5);
        graph.addUndirectedLink (node5, node6);
        graph.addUndirectedLink (node6, node7);
      
      
        
        /* List<GNode> nodesToRemove = new List();
        nodesToRemove.join(node7);
        graph.removeGNodes(nodesToRemove); */
        String[] exclusions = new String[]{"violence", "sex"};
        
        System.out.println("Circuit:"+ findTour(graph,exclusions).toString());
       
    
    }
    
    public static void testEulerianToNonEulerian2() {

       Audible holocaust = new Audible("Explanation of the murder, torture and violence in concentration camps in WW2", "7");
        Text treatyOfPeace = new Text("Peace treaty", "2");
        Text memories = new Text("memories of a mother","3");
        Visual introduction = new Visual("Introduction to the WW2 museum","1");
        Visual cookingInWW2 = new Visual("cousine in WW2","4");
        Visual bombs = new Visual("Bombs under the sea", "5");
        Audible victoryAudio = new Audible("Declaration of victory","6");   
        Audible music = new Audible("Music in WW2", "8");
        Visual art = new Visual("Art in WW2", "9");
        Text declaration = new Text("War manifesto", "10");
        
        
        Graph<Exposition> graph = new Graph<> ();       
        
        GNode<Exposition> node1 = graph.addNode ( introduction);
        GNode<Exposition> node2 = graph.addNode (treatyOfPeace);
        GNode<Exposition> node3 = graph.addNode (memories);
        GNode<Exposition> node4 = graph.addNode (cookingInWW2);
        GNode<Exposition> node5 = graph.addNode (bombs);
        GNode<Exposition> node6 = graph.addNode (victoryAudio);
        GNode<Exposition> node7 = graph.addNode (holocaust);
        GNode<Exposition> node8 = graph.addNode (music);
        GNode<Exposition> node9 = graph.addNode (art);
        GNode<Exposition> node10 = graph.addNode (declaration);

        graph.addUndirectedLink (node1, node2);
        graph.addUndirectedLink (node2, node3);
        graph.addUndirectedLink (node3, node4);
        graph.addUndirectedLink (node4, node5);
        graph.addUndirectedLink (node5, node6);
        graph.addUndirectedLink (node6, node7);
        graph.addUndirectedLink (node7, node1);
      
        
        /* List<GNode> nodesToRemove = new List();
        nodesToRemove.join(node7);
        graph.removeGNodes(nodesToRemove); */
        String[] exclusions = new String[]{"violence", "sex"};
        
        System.out.println("Circuit:"+ findTour(graph,exclusions).toString());
       
    
    }
    
   
}
