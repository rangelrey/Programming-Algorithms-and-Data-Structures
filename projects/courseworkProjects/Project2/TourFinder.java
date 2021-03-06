public class TourFinder{
    private String[] exclusions;
    private Graph graph;
    
    public static List<GNode> findTour(Graph graph, String[] exclusions){
        for (int j=0; j<exclusions.length; j++){
            //extract the nodes that contain the string which the user wants to avoid
            List nodesToDelete = graph.getGNodesThatContain(exclusions[j]);
            //remove those nodes from the tree
            graph.removeGNodes(nodesToDelete);
            
            //if the graph is not eulerian 
            if (graph.hasCircuit()!=true){
                System.out.println("Graph needs to be eulerian to find an eulerian circuit");
                System.out.println("In other words: ");
                System.out.println("The museum exposition's organisation is not prepared to handle avoiding certain expositions and at the same time visiting all the museum ");
                 List<GNode> empyList= new List();
                return empyList;
            }
            

        }return graph.getCircuit();
    } 
}
