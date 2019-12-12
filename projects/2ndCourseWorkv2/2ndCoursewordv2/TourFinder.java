public class TourFinder{
    private String[] exclusions;
    private Graph graoh;

    public static List<GNode> findTour(Graph graph, String[] exclusions){
        for (int j=0; j<exclusions.length; j++){

            List nodesToDelete = graph.getGNodesThatContain(exclusions[j]);

            graph.removeGNodes(nodesToDelete);
            if (graph.hasCircuit()!=true){
                System.out.println("Graph needs to be eulerian to find an eulerian circuit");
                System.out.println("In other words: ");
                System.out.println("The museum exposition's organisation is not prepared to handle avoiding certain expositions and at the same time visiting all the museum ");
                return null;
            }
            

        }return graph.getCircuit();
    } 
}
