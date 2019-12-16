public class Graph<T> {
    private List<GNode<T>> nodes;
    private T data;

    public Graph () {nodes = new List<GNode<T>> (); }

    public GNode<T> addNode (T data) {
        GNode<T> newNode = new GNode<> (data);
        nodes.join (newNode);
        return newNode;
    }
    
    public List<GNode<T>> getNodes(){return nodes;}

    public void addUndirectedLink (GNode<T> from, GNode<T> to) {
        from.addLink (to);
        to.addLink (from);
    }

    public void addDirectedLink (GNode<T> from, GNode<T> to) {
        from.addLink (to);
    }

    public void removeUndirectedLink (GNode<T> from, GNode<T> to) {
        from.removeLink (to);
        to.removeLink (from);
    }

    public int size () {
        if (nodes.size () > 0) {
            return nodes.get(0).countNodes (new List<GNode<T>> ());
        } else {
            return 0;
        }
    }
    //careful with this function since it actualy removes the edges
    //it returns an eulerian circuit using a stack to save the visited nodes
    public List<T> getCircuit () {
        Stack<GNode<T>> stack = new Stack<> ();
        List<T> circuit = new List<> ();
        
        if (nodes.size () > 0) {
            GNode<T> v = nodes.get (0); // take the first node
            Exposition exposition = (Exposition) v.getData();
            String title= (String) exposition.getTitle();

            while (v.hasNeighbours () || !stack.isEmpty () ) {
                if (v.hasNeighbours ()) {
                    stack.push (v);
                    Exposition exposition2 = (Exposition) v.getData();          
                    String title2= (String) exposition2.getTitle();
                    GNode<T> w = v.firstLink ();
                    removeUndirectedLink (v, w);
                    v = w;
                    Exposition exposition2a = (Exposition) v.getData();          
                    String title2a= (String) exposition2a.getTitle();
                } else {
                    circuit.join (v.getData ());
                    v = stack.pop ();
                    Exposition exposition3 = (Exposition) v.getData();          
                    String title3= (String) exposition3.getTitle();
                }
            }
        }
        return circuit;
    }
    //returns a list with the nodes that contain a particular string
    public List<GNode> getGNodesThatContain(String string){
        List<GNode> gNodesToRemove = new List<> ();
        for (int j = 0; j<nodes.size(); j++){
            GNode<T> v = nodes.get (j);
            Exposition exposition = (Exposition) v.getData();
            String content= (String) exposition.getContent();
            String title= (String) exposition.getTitle();        
            if ( content.contains(string)){  
                gNodesToRemove.join(v);
            }
        } return gNodesToRemove;
    }
    //removes the nodes that are in the list
    public void removeGNodes(List<GNode> nodesToRemove){
        for (int i = 0; i<nodesToRemove.size(); i++){
            GNode<T> gNodeToRemove = nodesToRemove.get(i);
            for (int j = 0; j<nodes.size(); j++){
                GNode<T> v = nodes.get (j);
                if ( v.equals(gNodeToRemove)){ 
                    nodes.deleteItem(gNodeToRemove);
                    List<GNode<T>> links = v.getLinks();
                    for (int k = 0; k<links.size(); k++){
                        links.get(k).getLinks().deleteItem(gNodeToRemove);
                    }
                }
            }
        }
    }
    //returns true if the graph has a circuit
     public boolean hasCircuit () {   
        for(int i = 0; i < nodes.size(); i++)
        { GNode<T> node = nodes.get(i);
            if(node.getDegree() % 2 != 0)
                return false;
            if(node.getDegree() == 0)
                return false;
        }
        return true;
    }
}