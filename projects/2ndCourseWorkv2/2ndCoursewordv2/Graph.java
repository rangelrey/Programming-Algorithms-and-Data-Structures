public class Graph<T> {
    private List<GNode<T>> nodes;
    private T data;

    public Graph () {nodes = new List<GNode<T>> (); }

    public GNode<T> addNode (T data) {
        GNode<T> newNode = new GNode<> (data);
        nodes.join (newNode);
        return newNode;
    }

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

    public List<T> getCircuit () {
        Stack<GNode<T>> stack = new Stack<> ();
        List<T> circuit = new List<> ();

        if (nodes.size () > 0) {
            GNode<T> v = nodes.get (0); // take the first node
            while (v.hasNeighbours () || !stack.isEmpty () ) {
                if (v.hasNeighbours ()) {
                    stack.push (v);
                    GNode<T> w = v.firstLink ();
                    removeUndirectedLink (v, w);
                    v = w;
                } else {
                    circuit.join (v.getData ());
                    v = stack.pop ();
                }
            }
        }

        return circuit;
    }

   

    public List<GNode> getGNodesThatContain(String string){
        List<GNode> gNodesToRemove = new List<> ();

        for (int j = 0; j<nodes.size(); j++){
            GNode<T> v = nodes.get (j);
            Exposition exposition = (Exposition) v.getData();
            String content= (String) exposition.getContent();
            System.out.println(content);
            if ( content.contains(string)){  
                gNodesToRemove.join(v);

            }
        } return gNodesToRemove;
    }

    public void removeGNodes(List<GNode> nodesToRemove){
        for (int i = 0; i<nodesToRemove.size(); i++){
            GNode<T> gNodeToRemove = nodesToRemove.get(i);
            for (int j = 0; j<nodes.size(); j++){
                GNode<T> v = nodes.get (j);
                if ( v.equals(gNodeToRemove)){ 
                    List<GNode<T>> links = v.getLinks();
                    for (int k = 0; k<links.size(); k++){
                        links.get(k).getLinks().deleteItem(gNodeToRemove);
                    }

                }

            }

        }
    }
}