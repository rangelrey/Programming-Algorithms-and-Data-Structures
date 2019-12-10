public class TourFinder{
    private String[] exclusions;
    private Graph graoh;
    
   
    public static List<GNode> findTour(Graph graph, String[] exclusions){
        
     for (int i=0; i<exclusions.length; i++);{


           List nodesToDelete = graph.getGNodesThatContain(exclusions[0]);
           
           graph.removeGNodes(nodesToDelete);
         
        
        }
        return graph.getCircuit();
        
    }
    }
